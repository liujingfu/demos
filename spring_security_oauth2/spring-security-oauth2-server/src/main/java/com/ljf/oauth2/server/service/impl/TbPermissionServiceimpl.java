package com.ljf.oauth2.server.service.impl;

import com.ljf.oauth2.server.domin.TbPermission;
import com.ljf.oauth2.server.mapper.TbPermissionMapper;
import com.ljf.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description
 *
 * @author ljf 2019/09/24 11:05
 */
@Service
public class TbPermissionServiceimpl implements TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;
    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
