package br.com.maximatech.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mxscliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    private String nome;
    private String cnpj;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private Double latitude;
    private Double longitude;

}
