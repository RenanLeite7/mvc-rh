package com.github.renanleite7.mvc_rh.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity <Long>{


    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column( columnDefinition = "DATE")
    private LocalDate dataSaida;
    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false,  columnDefinition = "NUMERIC(15,2)")
    private BigDecimal salario;

    @ManyToOne
    @JoinColumn(name = "id_cargo_fk", nullable = false)
    private Cargo cargo;

    @OneToOne
    @JoinColumn(name = "id_endereco_fk", nullable = false)
    private Endereco endereco;



    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
