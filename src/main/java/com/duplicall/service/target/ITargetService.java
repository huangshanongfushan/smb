package com.duplicall.service.target;

import com.duplicall.model.Target;

import java.util.List;

/**
 * Created by raymond on 2016/3/28.
 */
public interface ITargetService {
    List<Target> selectAllTargetList() throws Exception;
}
