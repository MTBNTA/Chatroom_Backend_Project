package com.example.chatroom_gp2.services;


import com.example.chatroom_gp2.models.User;
import com.example.chatroom_gp2.repositories.ChatroomRepository;
import com.example.chatroom_gp2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ChatroomRepository chatroomRepository;


    public User saveUser(User user){
        return userRepository.save(user);
    }

//    public User updateUser(long id){
//        userRepository.findById(id);
//        return
//    }


    public User getUserById(long id){
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers(){
        return userRepository.getAll();
    }

//    public User addUserToChatroom(long chatroomId, long userId){
//
//    }

    public User deleteById(long id){
        return userRepository.deleteById(id);
    }


}
