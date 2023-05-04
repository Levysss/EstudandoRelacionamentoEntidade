package br.com.relacionamento.relacionamentoentidade.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.relacionamento.relacionamentoentidade.modelo.Colaborador;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long>{

    
    
}
