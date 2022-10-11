package br.com.springboot.controller;

import br.com.springboot.dto.PessoaDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaController {

    @GetMapping("/status")
    public String status(){
        return "Hello World";
    }

    @GetMapping("/consultar")
    public String consultar(@RequestParam("ID") Integer id){
        System.out.println("Paramentro" + id);
        return "Paramentro: "+ id;
    }

    @PostMapping("/salvar")
    public PessoaDTO salvar(@RequestBody PessoaDTO pessoaDTO){
        System.out.println(pessoaDTO.getNome());
        System.out.println(pessoaDTO.getTelefone());
        System.out.println(pessoaDTO.getEmail());
        return pessoaDTO;
    }

    @PostMapping("/salvarComRetorno")
    @ResponseBody
    public PessoaDTO salvarComRetorno(@RequestBody PessoaDTO pessoaDTO){
        System.out.println(pessoaDTO.getNome());
        System.out.println(pessoaDTO.getTelefone());
        System.out.println(pessoaDTO.getEmail());
        return pessoaDTO;
    }

}
