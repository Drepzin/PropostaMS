package com.MSPropostaRecebida.PropostaRecebida.Repositories;

import com.MSPropostaRecebida.PropostaRecebida.Models.PropostaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<PropostaModel, Integer> {
}
