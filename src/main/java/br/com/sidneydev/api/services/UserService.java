package br.com.sidneydev.api.services;

import br.com.sidneydev.api.domain.User;

public interface UserService {

    User findById(Integer id);

}
