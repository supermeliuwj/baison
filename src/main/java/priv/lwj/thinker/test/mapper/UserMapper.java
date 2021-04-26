package priv.lwj.thinker.test.mapper;

import priv.lwj.thinker.test.pojo.User;

public interface UserMapper {

    int insert(User user);

    int update(User user);

    int delete(Integer id);

    User getById(Integer id);
}
