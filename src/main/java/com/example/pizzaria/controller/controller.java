package com.example.pizzaria.controller;
import com.example.pizzaria.model.ItemPedido;

import lombok.NoArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@NoArgsConstructor


@Controller
public class controller {

    
   /*  ItemPedido itemPedido;

    public controller(ItemPedido itemPedido){
        this.itemPedido = itemPedido;
    }
    */

    //@RequestMapping("/selecionaProduto")
    //public void selecionaProduto(@RequestParam("id") int codigo){
      //  Produto produto = itemPedido.findProduto(codigo);
        //ModelAndView ModelAndView = new ModelAndView("produto");
        //ModelAndView.addObjetct("ListaDeProdutos", itemProduto.listarProdutos());
        //ModelAndView.addObjetct("produto", produto);
        //return ModelAndView;  
    //}
    @RequestMapping("/listaProduto")
    public ModelAndView listarProdutos(){
        ModelAndView ModelAndView = new ModelAndView("pedidos");
        ItemPedido itemPedido = new ItemPedido();
        ModelAndView.addObject("listaDeProdutos", itemPedido.listarProdutos());
        return ModelAndView;
    }
   /* @PostMapping
    public String salvaProduto(@ModelAttribute("produto")Produto produto){
        itemPedido.listarProdutos().add(produto);
        return "redirect:/listaProduto";
    }
    */
    
    
}
