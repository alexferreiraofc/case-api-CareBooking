package com.carebooking.carebooking.api;


import com.carebooking.carebooking.domain.model.Pessoa;
import com.carebooking.carebooking.domain.repository.PessoaRepository;
import com.carebooking.carebooking.domain.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class PessoaController {

    // Meu problema inicial é que se eu instanciar essa outra classe sem o construtor eu tenho que passar
    // @autowired na instancia da classe Service
    // ao usar Lombok, vc usa a anotação @AllArgsConstructor que elimina essa parte
    // @autowired
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaService.listarTodos();
    }


}
