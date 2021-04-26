package priv.lwj.thinker.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.lwj.thinker.test.mapper.UserMapper;
import priv.lwj.thinker.test.pojo.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) { return userMapper.insert(user);};

    public int update(User user) {return userMapper.update(user);};

    public int delete(Integer id){return userMapper.delete(id);};

    public User getById(Integer id) {
        return userMapper.getById(id);
    }
}
