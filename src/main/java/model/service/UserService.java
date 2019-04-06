package model.service;

import model.dao.DaoFactory;
import model.dao.UserDao;
import model.entity.User;

import java.util.Optional;

public class UserService {


    DaoFactory daoFactory = DaoFactory.getInstance();
    public Optional<User> login(String name){
        Optional<User> result; //= Optional.empty();
        try(UserDao userDao = daoFactory.createUserDao()){
            result = userDao.findByName(name);
        }
        return result;
    }
}
