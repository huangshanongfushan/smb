package com.duplicall.service;

import com.duplicall.mapper.UsersMapper;
import com.duplicall.model.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by raymond on 2016/3/27.
 */

/**
 *
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) throws Exception {
        usersMapper.insertSelective(users);
    }

    @Override
    public void updateUser(Users users) throws Exception {
        usersMapper.updateByPrimaryKeySelective(users);
    }
}
