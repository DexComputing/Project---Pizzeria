package com.example.pizzaria.model;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

import java.util.List;

@Component
public class ItemPedido {
  
    int quantidade;
    String tamanho;

    //private List<Produto> lista;

    public  List<Produto> listarProdutos(){
        List<Produto> lista = new ArrayList<Produto>();
        lista.add(new Produto(1,"pizza","com recheio",20));
        return lista;
    }
   
}
