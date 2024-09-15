package com.MSPropostaRecebida.PropostaRecebida.Services;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.UserRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.UserResponse;

public interface UserService {

    UserResponse addUser(UserRequest userRequest);

    UserResponse findUserById(Integer id);

    void deleteUserById(Integer id);

    UserResponse attUserById(Integer id, UserRequest userRequest);


}
