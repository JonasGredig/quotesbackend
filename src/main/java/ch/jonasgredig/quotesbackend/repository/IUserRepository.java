package ch.jonasgredig.quotesbackend.repository;

import ch.jonasgredig.quotesbackend.model.User;

import java.util.ArrayList;

public interface IUserRepository {

    public boolean createUser(User user);
    public User getUser(Long id);
    public ArrayList<User> getUsers();
    public boolean updateUser(User user);
    public boolean deleteUser(User user);
}
