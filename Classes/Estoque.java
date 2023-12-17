/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;


public class Estoque {
    private List<Produto> listaDeProdutos;

    public Estoque() {
        this.listaDeProdutos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return listaDeProdutos;
    }
    
            
         
}   

