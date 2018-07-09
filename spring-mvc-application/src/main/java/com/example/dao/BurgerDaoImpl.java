package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.example.model.Burger;
import com.example.model.User;

public class BurgerDaoImpl implements BurgerDao {

	
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	
	
	
	
	@Override
	public List<Burger> listAllBurgers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBurger(Burger burger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBurger(Burger burger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBurger(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findBurgerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
