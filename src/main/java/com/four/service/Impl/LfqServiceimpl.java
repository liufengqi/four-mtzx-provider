package com.four.service.Impl;

import com.four.dao.LfqDao;
import com.four.entity.User;
import com.four.mysqlzc.ReadOnlyConnection;
import com.four.service.LfqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
public class LfqServiceimpl implements LfqService{

    @Autowired
    private LfqDao lfqDao;

    @ReadOnlyConnection
    @Override
    public String fasongyzm(String phone) {
        return lfqDao.fasongyzm(phone);
    }

    @Override
    public void zhuceuser(User user) {
        lfqDao.zhuceuser(user);
    }

    @ReadOnlyConnection
    @Override
    public String querydengluuser(User user) {

        String foul = "";
        List<User> list =  lfqDao.queryname(user.getUsername());
            if(list.size() > 0){
              User aa =  list.get(0);
                if(aa.getUserpass().equals(user.getUserpass())){
                    System.err.println(list+"-------list");
                    //成功
                    foul = "success"+","+aa.getUsername();
                }else{
                    foul = "mimacuowu";
                }
            }else {
                   //用户名或手机号错误
                    foul = "yhsjkong";
            }
        return foul;
    }
}
