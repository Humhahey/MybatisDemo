package cn.humhahey.DAO;

import cn.humhahey.POJO.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDAO {
    public User getUser(Long id);

    public List<User> findUser(String name);

    public int updateUser(User user);

    public int insertUser(User user);

    public int deleteUser(Long id);
}
