package com.MSPropostaRecebida.PropostaRecebida.controllers;

import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaRequest;
import com.MSPropostaRecebida.PropostaRecebida.Dtos.PropostaResponse;
import com.MSPropostaRecebida.PropostaRecebida.Services.Impl.PropostaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proposta")
public class PropostaController {

    @Autowired
    PropostaServiceImpl propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponse> addProposta(@RequestBody PropostaRequest propostaRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(propostaService.addProposta(propostaRequest));
    }

    @GetMapping
    public ResponseEntity<List<PropostaResponse>> findAllPropostas(){
        return ResponseEntity.status(HttpStatus.OK).body(propostaService.findAllPropostas());
    }
}