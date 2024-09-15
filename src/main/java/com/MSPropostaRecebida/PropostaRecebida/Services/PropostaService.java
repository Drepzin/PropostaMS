package com.MSPropostaRecebida.PropostaRecebida.Services;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaResponse;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface PropostaService {

    PropostaResponse addProposta(PropostaRequest propostaRequest);

    PropostaResponse attPropostaById(Integer id,PropostaRequest propostaRequest) throws JsonMappingException;

    PropostaResponse findPropostaById(Integer id);

    void deletePropostaById(Integer id);

}
