package ru.kata.pp312.service;

import ru.kata.pp312.model.User;

import java.util.List;

public interface UserService {
    User getUserById(long id);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void saveUser (User user);
}