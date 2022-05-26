package com.security.composite.repository;

import com.security.composite.enitty.User;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

@Repository
public class UserRepository {

    private static Set<User> users = new HashSet<>();

    static{
        users.add(new User(1, "a@gmail.com", "a@gmail.com", "USER"));
        users.add(new User(2, "b@gmail.com", "b@gmail.com", "ADMIN"));
    }

    public User getUserByEmail(String email){
        return users.stream().filter(u -> email.equalsIgnoreCase(u.getEmail())).findFirst().orElse(null);
    }

    public User getUserById(int id){
        return users.stream().filter(u -> id == u.getId()).findFirst().orElse(null);
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        UserRepository.users = users;
    }

    public void saveUser(User u) {
        int maxId = users.stream().max(Comparator.comparing(User::getId)).get().getId();
        u.setId(maxId + 1);
        users.add(u);
    }

    public boolean validateUserPlain(User user) {
        User existing = users.stream().filter(
                u -> user.getEmail().equalsIgnoreCase(u.getEmail()) && user.getPassword().equalsIgnoreCase(u.getPassword())
        ).findAny().orElse(null);

        return existing != null;
    }
}
