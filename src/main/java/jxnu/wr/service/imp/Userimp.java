package jxnu.wr.service.imp;

import jxnu.wr.mapper.Usermapper;
import jxnu.wr.model.User;
import jxnu.wr.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class Userimp implements UserService {

    private Usermapper usermapper;
    @Override
    public User login(User record){
        return usermapper.login(record);
    }

    @Override
    public void Regist(User user) {

    }
}
