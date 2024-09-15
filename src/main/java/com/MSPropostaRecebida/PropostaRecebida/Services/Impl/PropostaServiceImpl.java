package com.MSPropostaRecebida.PropostaRecebida.Services.Impl;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaResponse;
import com.MSPropostaRecebida.PropostaRecebida.Mappers.ManualPropostaMapper;
import com.MSPropostaRecebida.PropostaRecebida.Mappers.PropostaMapper;
import com.MSPropostaRecebida.PropostaRecebida.Models.PropostaModel;
import com.MSPropostaRecebida.PropostaRecebida.Repositories.PropostaRepository;
import com.MSPropostaRecebida.PropostaRecebida.Services.PropostaService;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropostaServiceImpl implements PropostaService {

    @Autowired
    PropostaRepository propostaRepository;

    PropostaMapper mapper = PropostaMapper.PROPOSTA_MAPPER;

    @Override
    public PropostaResponse addProposta(PropostaRequest propostaRequest) {
        PropostaModel propostaModel = mapper.requestToModel(propostaRequest);
        return mapper.modelToResponse(propostaRepository.save(propostaModel));
    }

    @Override
    public PropostaResponse attPropostaById(Integer id, PropostaRequest propostaRequest){
        PropostaModel propostaModel = propostaRepository.findById(id).orElseThrow(() ->
                new RuntimeException("User not found"));
        ManualPropostaMapper.attProposta(propostaModel, propostaRequest);
        return mapper.modelToResponse(propostaModel);
    }

    @Override
    public PropostaResponse findPropostaById(Integer id) {
        return null;
    }

    @Override
    public void deletePropostaById(Integer id) {

    }

    public List<PropostaResponse> findAllPropostas(){
        return propostaRepository.findAll()
                .stream().map(model -> mapper.modelToResponse(model)).toList();
    }
}
