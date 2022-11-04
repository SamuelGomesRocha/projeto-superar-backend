package br.com.maximatech.services;

import br.com.maximatech.models.ClienteModel;
import br.com.maximatech.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void cadastraCliente(ClienteModel cliente) {
        clienteRepository.save(cliente);
    }

    public void atualizaCliente(ClienteModel cliente){
        clienteRepository.save(cliente);
    }

    public ClienteModel encontraClinte(Long id){
        Optional<ClienteModel> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    public List<ClienteModel> listaClientes(){
        return clienteRepository.findAll();
    }

    public ClienteModel getByLatLng(Double lat, Double lng){
        ClienteModel cliente = new ClienteModel();
        for(ClienteModel c : listaClientes()){
            if(c.getLatitude().equals(lat) && c.getLongitude().equals(lng))
                cliente = c;
        }
        return cliente;
    }



    @Transactional
    public void deletaCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
