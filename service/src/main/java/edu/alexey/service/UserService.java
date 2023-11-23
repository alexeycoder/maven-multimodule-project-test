package edu.alexey.service;

import java.util.Optional;

import edu.alexey.database.dao.UserDao;
import edu.alexey.service.dto.UserDto;

public class UserService {

	private final UserDao userDao = new UserDao();

	public Optional<UserDto> getUser(long id) {
		return userDao.findById(id).map(u -> new UserDto());
	}
}
