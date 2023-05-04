package br.com.relacionamento.relacionamentoentidade.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.relacionamento.relacionamentoentidade.modelo.Cargo;

@Repository
public interface CargoRepositorio extends CrudRepository<Cargo, Long> {
    
}
