package org.zerocool.securityservice.domain.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.zerocool.securityservice.application.UserMapper;
import org.zerocool.securityservice.domain.model.UserEntity;
import org.zerocool.securityservice.domain.repository.UserRepository;
import org.zerocool.securityservice.dto.TokenDTO;
import org.zerocool.securityservice.dto.UserDTO;
@Service

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public TokenDTO login(UserDTO userDTO) {
        if(userRepository.existsById(userDTO.getUsername()).equals(Boolean.FALSE)){
            throw new UsernameNotFoundException("User not found");
        } else if (userRepository.existsByUsernameAndPassword(userDTO.getUsername(),userDTO.getPassword()).equals(Boolean.FALSE)){
            throw new UsernameNotFoundException("User not found");
        }
        UserEntity userEntity = userRepository.findByUsernameAndPassword(userDTO.getUsername(),userDTO.getPassword());
        UserDTO user = UserMapper.entityToDomain(userEntity);
        return TokenDTO.builder().token("Bienvenido "+user.getUsername()).build();
    }

    @Override
    public TokenDTO registry(UserDTO userDTO) {
        if(userRepository.existsById(userDTO.getUsername()).equals(Boolean.TRUE)){
            throw new UsernameNotFoundException("User already exists");
        }
        UserEntity user = UserMapper.domainToEntity(userDTO);
        userRepository.save(user);
        return TokenDTO.builder().token("user added to the system").build();
    }
}
