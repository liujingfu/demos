package com.ljf.oauth2.server.service;

import com.ljf.oauth2.server.domin.TbUser;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author ljf 2019/09/24 10:42
 */

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
