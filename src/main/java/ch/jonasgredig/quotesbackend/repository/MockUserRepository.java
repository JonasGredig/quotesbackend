package ch.jonasgredig.quotesbackend.repository;

import ch.jonasgredig.quotesbackend.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MockUserRepository implements IUserRepository {
    
    private ArrayList<User> mockUsers;

    public MockUserRepository() {
        mockUsers = new ArrayList<User>();
        mockUsers.add(new User(0L, "JONASUSER", "TEST"));
        mockUsers.add(new User(3L, "JONASUSER2", "TEST"));
        mockUsers.add(new User(36L, "PETERUSER", "TEasdfasdf3245!!ST"));
    }

    public boolean createUser(User user) {
        mockUsers.add(user);
        return true;
    }

    public User getUser(Long id) {
        for (User user : mockUsers) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        throw new RuntimeException("User not Found");
    }

    public ArrayList<User> getUsers() {
        return mockUsers;
    }

    public boolean updateUser(User user) {
        for (User mockUser : mockUsers) {
            if (mockUser.getUserId() == user.getUserId()) {
                mockUser = user;
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(User user) {
        mockUsers.remove(user);
        return true;
    }
}
