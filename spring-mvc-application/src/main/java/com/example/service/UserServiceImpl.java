package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.User;

@Service
public class UserServiceImpl implements UserService {

	UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> listAllUsers() {
		return userDao.listAllUsers();
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);

	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);

	}

	@Override
	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

}
