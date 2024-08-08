package org.zerocool.securityservice.application;

import org.zerocool.securityservice.domain.model.UserEntity;
import org.zerocool.securityservice.dto.UserDTO;

public class UserMapper {

    public static UserDTO entityToDomain(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(userEntity.getUsername());
        userDTO.setPassword(userEntity.getPassword());
        return userDTO;
    }

    public static UserEntity domainToEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        return userEntity;
    }
}
