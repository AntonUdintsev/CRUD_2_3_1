package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    public void addUser (User user){
        userDao.addUser(user);
    }

    @Override
    public User showUser(int id) {
        return userDao.showUser(id-1);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id-1,user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id-1);
    }
}
