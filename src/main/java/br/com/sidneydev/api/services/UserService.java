package br.com.sidneydev.api.services;

import br.com.sidneydev.api.domain.User;
import br.com.sidneydev.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);

}
