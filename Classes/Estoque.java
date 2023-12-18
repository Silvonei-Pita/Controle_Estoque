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
    
    //Métodos
    
    //Aumenta a quantidade no estoque de um certo Produto
    public void acrescentarProduto(String codigoBarras, int quantidade){
        String resultado = "fracasso";
        for(int i = 0; i < listaDeProdutos.size(); i++){
           if(listaDeProdutos.get(i).getCodigoBarras().equals(codigoBarras)){
               listaDeProdutos.get(i).quantidade += quantidade;
               resultado = "sucesso";
           }    
        }
        if(!resultado.equals("sucesso")){
            throw new ECodigoInvalidoException("Produto com o código inserido não foi encontrado");
        }
    } 
 
    //Diminui a quantidade no estoque de um certo Produto
    public void subtrairProduto(String codigoBarras, int quantidade){
        String resultado = "fracasso";
        for(int i = 0; i < listaDeProdutos.size(); i++){
           if(listaDeProdutos.get(i).getCodigoBarras().equals(codigoBarras)){
               listaDeProdutos.get(i).quantidade -= quantidade;
               resultado = "sucesso";
           }    
        }
        if(!resultado.equals("sucesso")){
            throw new ECodigoInvalidoException("Produto com o código inserido não foi encontrado");
        }
    }
    

    //Cadastra um novo produto no Estoque
    public void adicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
    }
    
    //Remove um produto do Cadastro do Estoque
    public void removerProduto(String codigoBarras){
        String resultado = "fracasso";
        for(int i = 0; i < listaDeProdutos.size(); i++){
           if(listaDeProdutos.get(i).getCodigoBarras().equals(codigoBarras)){
               listaDeProdutos.remove(i);
               resultado = "sucesso";
           }    
        }
        if(!resultado.equals("sucesso")){
            throw new ECodigoInvalidoException("Produto com o código inserido não foi encontrado");
        }
    }
    
    //Lista todos os produtos cadastrados.
    public void listarProdutos(){
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("[A] código de Barras / [B] nome / [C] categoria / [D] quantidade / [E] precoUnitario / [F] precoKg /");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for(int i = 0; i < listaDeProdutos.size(); i++){
            System.out.println(
                    "[A] " + listaDeProdutos.get(i).getCodigoBarras()
                           + "/ [B] " + listaDeProdutos.get(i).getNome()
                           + "/ [C] " + listaDeProdutos.get(i).getCategoria()
                           + "/ [D] " + listaDeProdutos.get(i).getQuantidade()
                           + "/ [E] " + listaDeProdutos.get(i).getPrecoUnitario()
                           + "/ [F] " + listaDeProdutos.get(i).getPrecoKg()
  
            );
        }
    }
    
    /*Atualizaria um produto do Cadastro do Estoque
    public void atualizarProduto(String codigoBarras, Produto produto){
        String resultado = "fracasso";
        for(int i = 0; i < listaDeProdutos.size(); i++){
           if(listaDeProdutos.get(i).getCodigoBarras().equals(codigoBarras)){
               listaDeProdutos.set(i, produto);
               resultado = "sucesso";
           }    
        }
        if(!resultado.equals("sucesso")){
            throw new ECodigoInvalidoException("Produto com o código inserido não foi encontrado");
        }
    }*/ 

            
         
}   

