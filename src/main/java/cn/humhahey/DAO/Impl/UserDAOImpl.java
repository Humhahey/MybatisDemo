package cn.humhahey.DAO.Impl;

import cn.humhahey.DAO.BaseDAOImpl;
import cn.humhahey.DAO.UserDAO;
import cn.humhahey.POJO.User;

import java.util.List;

public class UserDAOImpl extends BaseDAOImpl implements UserDAO {
    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public List<User> findUser(String name) {
        return null;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(Long id) {
        return 0;
    }
}
