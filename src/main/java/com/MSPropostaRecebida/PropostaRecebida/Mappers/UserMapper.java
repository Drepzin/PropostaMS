package com.MSPropostaRecebida.PropostaRecebida.Mappers;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.UserRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.UserResponse;
import com.MSPropostaRecebida.PropostaRecebida.Models.UserModel;
import org.mapstruct.Mapper;

@Mapper()
public interface UserMapper {

    UserModel requestToModel(UserRequest userRequest);

    UserResponse modelToResponse(UserModel userModel);
}
