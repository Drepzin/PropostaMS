package com.MSPropostaRecebida.PropostaRecebida.Services.Impl;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.UserRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.UserResponse;
import com.MSPropostaRecebida.PropostaRecebida.Mappers.PropostaMapper;
import com.MSPropostaRecebida.PropostaRecebida.Repositories.UserRepository;
import com.MSPropostaRecebida.PropostaRecebida.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserResponse addUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse findUserById(Integer id) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {

    }

    @Override
    public UserResponse attUserById(Integer id, UserRequest userRequest) {
        return null;
    }
}
