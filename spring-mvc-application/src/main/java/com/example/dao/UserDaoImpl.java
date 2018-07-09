package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;



	@Override
	public List<User> listAllUsers() {
		String sql = "SELECT id, firstname, lastname, email FROM users";

		List<User> list = jdbcTemplate.query(sql, new UserMapper());

		return list;
	}

	private SqlParameterSource getSqlParameterByModel(User user) {
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		if (user != null) {
			parameterSource.addValue("id", user.getId());
			parameterSource.addValue("firstname", user.getFirstname());
			parameterSource.addValue("lastname", user.getLastname());
			parameterSource.addValue("email", user.getEmail());
		}
		return parameterSource;
	}

	
	// Wykorzystywana do zwracania LISTY i szukania  !!!!!!!!!!!!!!
	private static final class UserMapper implements RowMapper {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));

			return user;
		}

	}

	@Override
	public void addUser(User user) {
		  String sql = "INSERT INTO users(firstname, lastname, email) VALUES(:firstname, :lastname, :email)";

		jdbcTemplate.update(sql, getSqlParameterByModel(user));

	}

	@Override
	public void updateUser(User user) {
		  String sql = "UPDATE users SET firstname = :firstname, lastname = :lastname , email = :email WHERE id = :id";

		jdbcTemplate.update(sql, getSqlParameterByModel(user));
	}

	@Override
	public void deleteUser(int id) {
		String sql = "DELETE FROM users WHERE id = :id";

		jdbcTemplate.update(sql, getSqlParameterByModel(new User(id)));

	}

	@Override
	public User findUserById(int id) {
		 String sql = "SELECT * FROM users WHERE id = :id";
		  return (User) jdbcTemplate.queryForObject(sql,getSqlParameterByModel(new User(id)), new UserMapper());
				   }

		//return (User) jdbcTemplate.queryForObject(sql, getSqlParameterByModel(new User(id)),new UserMapper());
	}

