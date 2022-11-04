package br.com.maximatech.controller;

import br.com.maximatech.dtos.ClienteDTO;
import br.com.maximatech.models.ClienteModel;
import br.com.maximatech.services.ClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping(value = "/cadastra")
    public ResponseEntity<ClienteModel> cadastraCliente(@RequestBody @Valid ClienteDTO clienteDTO){
        ClienteModel cliente = new ClienteModel();
        BeanUtils.copyProperties(clienteDTO, cliente);
        clienteService.cadastraCliente(cliente);
        return new ResponseEntity<ClienteModel>(cliente, HttpStatus.CREATED);
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<ClienteModel>> listarClientes(){
        return new ResponseEntity<List<ClienteModel>>(clienteService.listaClientes(), HttpStatus.OK);
    }

    @GetMapping(value="/{idCliente}")
    public ResponseEntity<ClienteModel> obtemCliente(@PathVariable("idCliente") Long idCliente){
        return new ResponseEntity<ClienteModel>(clienteService.encontraClinte(idCliente), HttpStatus.OK);
    }

    @DeleteMapping(value = "/del/{idCliente}")
    public ResponseEntity deletaCliente(@PathVariable("idCliente") Long idCliente){
        clienteService.deletaCliente(idCliente);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/{longitude}/{latitude}")
    public ResponseEntity<ClienteModel> getByLatLng(@PathVariable("longitude") Double longitude, @PathVariable("latitude") Double latitude){
        return new ResponseEntity<ClienteModel>(clienteService.getByLatLng(latitude, longitude), HttpStatus.OK);
    }

}
