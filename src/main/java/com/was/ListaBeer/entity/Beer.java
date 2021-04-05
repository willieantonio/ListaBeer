package com.was.ListaBeer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Beer implements Serializable {
    private  static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private  String nome;
    private String tipo;

    public Long getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getNome(){
        return  nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
}
