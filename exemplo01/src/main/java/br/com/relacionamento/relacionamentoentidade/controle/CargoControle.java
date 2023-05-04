package br.com.relacionamento.relacionamentoentidade.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.relacionamento.relacionamentoentidade.modelo.Cargo;
import br.com.relacionamento.relacionamentoentidade.repositorio.CargoRepositorio;

@RestController
@RequestMapping("/cargo")
public class CargoControle {

    @Autowired
    private CargoRepositorio cargo_repositorio;
    
    @GetMapping("/listar")
    public Iterable<Cargo> listar(){
        return cargo_repositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargo_repositorio.save(obj);
    }
}
