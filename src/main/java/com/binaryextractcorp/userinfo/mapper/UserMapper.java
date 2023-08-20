package com.binaryextractcorp.userinfo.mapper;

import com.binaryextractcorp.userinfo.dto.UserDTO;
import com.binaryextractcorp.userinfo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);
}
