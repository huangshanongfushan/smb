package com.duplicall;

import com.duplicall.model.UsersExample;
import com.duplicall.model.Users;
import com.duplicall.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

/**
 * Created by raymond on 2016/3/24.
 */

@EnableAutoConfiguration
@ComponentScan
public class Application implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        final ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }

    @Resource
    private IUserService userServiceImpl;

    @Override
    public void run(String... strings) throws Exception {
        UsersExample usersExample = new UsersExample();
        Users users = new Users();
     /*   users.setFirstName("xiaoming");
        users.setLoginId("xiaoxiao");*/
        users.setId(100);
//        users.setOrganizationId(0);
        users.setLoginId("administrator");
        try {
            while (true) {
                userServiceImpl.updateUser(users);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }
}
