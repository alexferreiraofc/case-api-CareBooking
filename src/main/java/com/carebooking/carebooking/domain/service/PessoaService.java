package com.carebooking.carebooking.domain.service;

import com.carebooking.carebooking.domain.model.Pessoa;
import com.carebooking.carebooking.domain.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    // Meu problema inicial é que se eu instanciar essa outra classe sem o construtor eu tenho que passar
    // @autowired na instancia da classe Repository
    // ao usar Lombok, vc usa a anotação @AllArgsConstructor que elimina essa parte
    // @autowired
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }


}
