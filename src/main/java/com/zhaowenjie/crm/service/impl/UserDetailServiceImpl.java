package com.zhaowenjie.crm.service.impl;

import com.zhaowenjie.crm.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


/**
 *
 * <p>
 *      security 自定义登陆逻辑类
 *      用来做登陆认证，验证用户名与密码
 * </p>
 *
 * @author wangzh
 *
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

//    @Autowired
//    private ICustomerService customerService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        /*// 根据用户名去查找用户信息
        Customer customer = customerService.queryCustomerByUsername(username);

        if(customer == null) {
            throw new UsernameNotFoundException(String.format("Not user Found with '%s'", username));
        }

        return new User(customer.getUsername(),passwordEncoder.encode(customer.getPassword()), AuthorityUtils.createAuthorityList("admin"));
    */
        return null;
    }

}