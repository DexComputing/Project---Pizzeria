package com.example.pizzaria.model;

public class Produto {

    public Produto(int codigo, String nome, String descricao, int valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
      }
    int codigo;
    String nome;
    String descricao;
    float valor;

    public int getCodigo() {
      return this.codigo;
    }
    public void setCodigo(int value) {
      this.codigo = value;
    }

    public String getNome() {
      return this.nome;
    }
    public void setNome(String value) {
      this.nome = value;
    }

    public String getDescricao() {
      return this.descricao;
    }
    public void setDescricao(String value) {
      this.descricao = value;
    }

    public float getValor() {
      return this.valor;
    }
    public void setValor(float value) {
      this.valor = value;
    }
}
