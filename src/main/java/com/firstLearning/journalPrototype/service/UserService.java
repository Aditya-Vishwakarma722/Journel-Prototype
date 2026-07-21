package com.firstLearning.journalPrototype.service;

import com.firstLearning.journalPrototype.entity.User;
import com.firstLearning.journalPrototype.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public String deleteById(ObjectId myId){
        userRepository.deleteById(myId);
        return "ID Deleted Successfully!";
    }

}
