package com.example.pizzaria.model;
import java.sql.Timestamp;


public class Pedido {
    int numero;
    Timestamp momento;
    float valor;
    String status;
    String pagamento;

    
    /*@RequestMapping("/selecionaProduto")
    public void adicionarItem(@RequestParam("id") int codigo){
        List<Produto> lista = new ArrayList<Produto>();
        Produto produto = Produto.findById(Integer.valueOf(codigo)).get();
        ItemPedido itemPedido = new ItemPedido("Produto");
        itemPedido.addObjetct("produto", produto);
        return itemPedido;
    }
    */
    void finalizarPedido(){
        
    }

}
