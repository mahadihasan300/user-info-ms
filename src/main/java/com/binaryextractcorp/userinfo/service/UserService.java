package com.binaryextractcorp.userinfo.service;

import com.binaryextractcorp.userinfo.dto.UserDTO;
import com.binaryextractcorp.userinfo.entity.User;
import com.binaryextractcorp.userinfo.mapper.UserMapper;
import com.binaryextractcorp.userinfo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserDTO addUser(UserDTO userDTO) {
        User savedUser = userRepo.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);

    }
}
