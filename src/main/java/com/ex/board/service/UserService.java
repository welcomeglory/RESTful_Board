package com.ex.board.service;

import com.ex.board.dto.UserDTO;
import com.ex.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//2.
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }

    public List<UserDTO> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public UserDTO getUserByUserId(String userId){
        return userRepository.getUserByUserId(userId);
    }

    public void updateUserPw(String userId, UserDTO user){
        userRepository.updateUserPw(userId,user);
    }
    public void deleteUser(String userId){
        userRepository.deleteUsser(userId);
    }
}
