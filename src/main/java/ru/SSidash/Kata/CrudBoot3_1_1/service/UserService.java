package ru.SSidash.Kata.CrudBoot3_1_1.service;



import ru.SSidash.Kata.CrudBoot3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void removeUser(int id);

    void updateUser(User user);
}
