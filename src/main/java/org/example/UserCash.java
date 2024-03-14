package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class UserCash {
    private Map<Integer, User> cache;


    public UserCash(){
        this.cache = new HashMap<>();
    }

    public void addUser(User user) {
        cache.put(user.getId(), user);
    }

    public User getUser(int userId) {
        return cache.get(userId);
    }
}
