package com.four.service;

import com.four.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface LfqService {

    String fasongyzm(String phone);

    void zhuceuser(User user);

    String querydengluuser(User user);

}
