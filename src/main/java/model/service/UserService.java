package model.service;

import model.dao.DaoFactory;
import model.dao.UserDao;
import model.entity.User;

public class UserService {


    DaoFactory daoFactory = DaoFactory.getInstance();
    public User login(String name){
        UserDao userDao = daoFactory.createUserDao();

            User user = userDao.findByName(name);
            System.out.println(user + " 00000000");
            return user;

    }
}
