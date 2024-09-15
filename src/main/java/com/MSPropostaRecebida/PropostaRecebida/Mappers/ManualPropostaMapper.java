package com.MSPropostaRecebida.PropostaRecebida.Mappers;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaRequest;
import com.MSPropostaRecebida.PropostaRecebida.Models.PropostaModel;

public class ManualPropostaMapper {

    public static PropostaModel attProposta(PropostaModel propostaModel, PropostaRequest propostaRequest){
        if(propostaRequest.getAge() > 0){
            propostaModel.getUserModel().setAge(propostaRequest.getAge());
        }
        if(propostaRequest.getEmail() != null){
            propostaModel.getUserModel().setEmail(propostaRequest.getEmail());
        }
        if(propostaRequest.getIncome() != null){
            propostaModel.getUserModel().setIncome(propostaRequest.getIncome());
        }
        if(propostaRequest.getName() != null){
            propostaModel.getUserModel().setFirstName(propostaRequest.getName());
        }
        if(propostaRequest.getLastName() != null){
            propostaModel.getUserModel().setLastName(propostaRequest.getLastName());
        }
        if(propostaRequest.getValue() != null){
            propostaModel.setValue(propostaRequest.getValue());
        }
        if(propostaRequest.getPaymentTerm() > 0){
            propostaModel.setPaymentTerm(propostaRequest.getPaymentTerm());
        }
        return propostaModel;
    }
}
