package jxnu.wr.mapper;

import jxnu.wr.model.User;
import org.apache.ibatis.annotations.Param;

public interface Usermapper{

    User login(User record);
    User findByUsername(String username);
    // 注册用户和密码
    void registerByUsernameAndPassword(@Param("username") String username,
                                       @Param("password") String password);
}