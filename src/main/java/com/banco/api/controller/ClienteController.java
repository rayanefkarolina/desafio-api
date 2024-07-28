package com.banco.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.banco.api.model.Cliente;
import com.banco.api.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}