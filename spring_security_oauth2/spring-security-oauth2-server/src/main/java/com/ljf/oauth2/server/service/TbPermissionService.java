package com.ljf.oauth2.server.service;

import com.ljf.oauth2.server.domin.TbPermission;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author ljf 2019/09/24 11:04
 */

public interface TbPermissionService {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
