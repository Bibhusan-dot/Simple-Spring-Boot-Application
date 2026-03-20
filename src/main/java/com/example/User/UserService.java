package com.example.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public User add(User user){
        return repo.save(user);
    }

    public List<User> getAll(){
        return repo.findAll();
    }

    public void delete(int id){
        repo.deleteById(id);
    }

    public User getById(int id){
        return repo.findUserById(id);
    }
}
