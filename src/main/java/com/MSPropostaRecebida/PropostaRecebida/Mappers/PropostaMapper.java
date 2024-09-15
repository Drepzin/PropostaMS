package com.MSPropostaRecebida.PropostaRecebida.Mappers;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaResponse;
import com.MSPropostaRecebida.PropostaRecebida.Models.PropostaModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface PropostaMapper {

    PropostaMapper PROPOSTA_MAPPER = Mappers.getMapper(PropostaMapper.class);

    @Mapping(target = "userModel.firstName", source = "name")
    @Mapping(target = "userModel.lastName", source = "lastName")
    @Mapping(target = "userModel.email", source = "email")
    @Mapping(target = "userModel.age", source = "age")
    @Mapping(target = "userModel.income", source = "income")
    PropostaModel requestToModel(PropostaRequest propostaRequest);

    @Mapping(target = "name", source = "userModel.firstName")
    @Mapping(target = "lastName", source = "userModel.lastName")
    @Mapping(target = "age", source = "userModel.age")
    @Mapping(target = "email", source = "userModel.email")
    @Mapping(target = "income", source = "userModel.income")
    PropostaResponse modelToResponse(PropostaModel propostaModel);


    PropostaModel atualizer(PropostaModel propostaModel);
}
