/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Classes.Categoria;
import Classes.Endereco;
import Classes.Estoque;
import Classes.Fornecedor;
import Classes.Lote;
import Classes.Produto;
import Classes.UnidadeFederativa;
import java.time.LocalDate;

/**
 *
 * @author Silvoneizinho
 */
public class Main {

    public static void main(String[] args) {
        
        Estoque estoque = new Estoque();
        
        estoque.adicionarProduto(new Produto
        ("1234", 
                "Pct. Folhas A4 300f.", 
                new Fornecedor(
                        1, 
                        "ATLAS PAPELARIA", 
                        new Endereco(
                                2, 
                                "4212-340", 
                                "Rua da Vitória", 
                                "Cabula", 
                                "Salvador", 
                                UnidadeFederativa.BAHIA, 
                                "Sala 407"), 
                        "(71)92313-5564", 
                        "atlas.papelaria@hotmail.com", 
                        "54.753.235/0042-31"), 
                Categoria.PAPELARIA, 
                "Pacote de Folhas A4, contendo 300 folhas.", 
                30.00, 
                0, 
                20, 
                new Lote(
                        1, 
                        LocalDate.of(2023, 12, 20), 
                        LocalDate.of(2024, 6, 20))));
        
        System.out.println(estoque.listarProdutos());
                        
        
                
        
        
    }
}
