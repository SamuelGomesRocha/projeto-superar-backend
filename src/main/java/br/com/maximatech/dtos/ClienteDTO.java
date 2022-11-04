package br.com.maximatech.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ClienteDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String cnpj;
    @NotBlank
    private String cep;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String uf;
    private Double latitude;
    private Double longitude;

}
