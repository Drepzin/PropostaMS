package com.MSPropostaRecebida.PropostaRecebida.Repositories;

import com.MSPropostaRecebida.PropostaRecebida.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
