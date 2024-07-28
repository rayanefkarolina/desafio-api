package com.banco.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banco.api.model.Cliente;
import com.banco.api.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}