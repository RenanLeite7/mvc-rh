package com.github.renanleite7.mvc_rh.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cargos")
public class Cargo extends AbstractEntity<Long> {


    @Column(nullable = false, length = 50, unique = true)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
