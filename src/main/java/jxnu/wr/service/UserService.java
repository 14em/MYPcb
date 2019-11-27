package jxnu.wr.service;

import jxnu.wr.model.User;

//Service层接口
public interface UserService {
    User login(User record);
    void Regist(User user);
}