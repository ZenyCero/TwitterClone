package org.zerocool.securityservice.domain.service;

import org.zerocool.securityservice.dto.TokenDTO;
import org.zerocool.securityservice.dto.UserDTO;

public interface UserService {
    TokenDTO login(UserDTO userDTO);
    TokenDTO registry(UserDTO userDTO);
}
