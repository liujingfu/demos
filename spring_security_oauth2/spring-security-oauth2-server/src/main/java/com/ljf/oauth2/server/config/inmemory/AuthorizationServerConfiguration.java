package com.ljf.oauth2.server.config.inmemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * description
 *
 * @author ljf 2019/09/20 15:58
 */
//@Configuration
//@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    @Autowired
    public BCryptPasswordEncoder passwordEncoder;
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients
        .inMemory()
        .withClient("client")
        .secret(passwordEncoder.encode("secret"))
        .authorizedGrantTypes("authorization_code")
        .scopes("app")
        .redirectUris("http://www.jingfu.com");
    }
}
