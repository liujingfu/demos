package com.ljf.oauth2.server.service.impl;

import com.ljf.oauth2.server.domin.TbUser;
import com.ljf.oauth2.server.mapper.TbUserMapper;
import com.ljf.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * description
 *
 * @author ljf 2019/09/24 10:42
 */
@Service
public class TbUserServiceimpl  implements TbUserService {

   @Resource
    TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example=new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);

        return tbUserMapper.selectOneByExample(example);
    }
}
