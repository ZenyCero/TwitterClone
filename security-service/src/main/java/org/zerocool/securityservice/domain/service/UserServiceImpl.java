package org.zerocool.securityservice.domain.service;

import org.springframework.stereotype.Service;
import org.zerocool.securityservice.domain.repository.UserRepository;
import org.zerocool.securityservice.dto.TokenDTO;
import org.zerocool.securityservice.dto.UserDTO;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public TokenDTO login(UserDTO userDTO) {
        return null;
    }

    @Override
    public TokenDTO registry(UserDTO userDTO) {
        return null;
    }
}
