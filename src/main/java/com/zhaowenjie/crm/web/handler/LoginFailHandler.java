package com.zhaowenjie.crm.web.handler;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhaowenjie.crm.utils.MessageUtil;
import com.zhaowenjie.crm.utils.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFailHandler implements AuthenticationFailureHandler {
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {

        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(MessageUtil.error(CodeUtil.LOGINFAIL_CODE,"登陆失败：" + exception.getMessage())));
    }
}
