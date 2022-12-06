package br.com.foodtruck.model;

import jakarta.persistence.*;

@Entity
@Table(name = "foodtruck")
public class FoodTruck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String nome;
    @Column
    int telefone;
    @Column
    String ramoAtuacao;
    @Column
    String localDeFuncionamento;

    public FoodTruck(int id, String nome, int telefone, String ramoAtuacao, String localDeFuncionamento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.ramoAtuacao = ramoAtuacao;
        this.localDeFuncionamento = localDeFuncionamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getRamoAtuacao() {
        return ramoAtuacao;
    }

    public void setRamoAtuacao(String ramoAtuacao) {
        this.ramoAtuacao = ramoAtuacao;
    }

    public String getLocalDeFuncionamento() {
        return localDeFuncionamento;
    }

    public void setLocalDeFuncionamento(String localDeFuncionamento) {
        this.localDeFuncionamento = localDeFuncionamento;
    }


}


