package com.duplicall.service.user;

import com.duplicall.model.Users;

/**
 * Created by raymond on 2016/3/27.
 */
public interface IUserService {
    void addUser(Users users) throws Exception;

    void updateUser(Users users) throws Exception;
}
