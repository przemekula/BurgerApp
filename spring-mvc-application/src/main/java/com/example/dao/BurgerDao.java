package com.example.dao;

import java.util.List;

import com.example.model.Burger;
import com.example.model.User;

public interface BurgerDao {
	 public List <Burger>listAllBurgers();
	 
	 public void addBurger(Burger burger);
	 
	 public void updateBurger(Burger burger);
	 
	 public void deleteBurger(int id);
	 
	 public User findBurgerById(int id);
}
