/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Classes.Categoria;
import Classes.Endereco;
import Classes.Estoque;
import Classes.Fornecedor;
//import Classes.Lote;
import Classes.Produto;
import Classes.UnidadeFederativa;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Silvoneizinho
 */
public class Main {

    public static void main(String[] args) {
        //Adicionar valor de Estoque Máximo aos produtos.
        
        // Criação do Estoque
        Estoque estoque = new Estoque();
        
        // Método Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Variável Controle do Menu
        int opcao = 0;
        int opcaoSwitch = 0;
        
        //Variáveis de Entrada de Dados (Produto)
        String codigoBarras;
        String nomeProduto;
        String descricaoProduto;
        double precoUnitario;
        double precoKg;
        int quantidade;
        int estoqueMax;
        
        
        //Objetos Pré-Criados
        Fornecedor fornecedor1;
        
        estoque.adicionarProduto(new Produto
        ("1234", 
                "Pct. Folhas A4 300f.", fornecedor1 = 
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
                100
                ));
        
        estoque.adicionarProduto(new Produto
        ("1235", 
                "Pct. Folhas A3 200f.", 
                fornecedor1,
                Categoria.PAPELARIA, 
                "Pacote de Folhas A3, contendo 200 folhas.", 
                40.00, 
                0, 
                20,
                100));
        
        System.out.println("Bem-vindo ao Sistema de Controle de Estoque ArmaTech");
        
        do{
            
            System.out.println("Insira o código correspondente à ação desejada.");
            System.out.println("[1] Consultar Estoque"); 
            System.out.println("[2] Acrescentar Produto");
            System.out.println("[3] Subtrair Produto");
            System.out.println("[4] Gerenciar Estoque");
            opcao = Integer.parseInt(entrada.nextLine());
            
            switch(opcao){
                case 1: 
                   estoque.listarProdutos();
                       
                break;
                
                
                case 2:
                   System.out.println("Acrescentar Produto");
                   System.out.println("-------------------");
                   System.out.println("Insira o código de barras do Produto:");
                   codigoBarras = entrada.nextLine();
                   System.out.println("Insira a quantidade a ser adicionada.");
                   //entrada.skip("\\R?");
                   quantidade = Integer.parseInt(entrada.nextLine());
                   estoque.acrescentarProduto(codigoBarras, quantidade);
                   System.out.println("Quantidade adicionada.");
                   
                break;
                
                case 3:
                   System.out.println("Subtrair Produto");
                   System.out.println("-------------------");
                   System.out.println("Insira o código de barras do Produto:");
                   codigoBarras = entrada.nextLine();
                   System.out.println("Insira a quantidade a ser subtraída.");
                   //entrada.skip("\\R?");
                   quantidade = Integer.parseInt(entrada.nextLine());
                   estoque.subtrairProduto(codigoBarras, quantidade);
                   System.out.println("Quantidade subtraída.");
                
                break;
                
                case 4:
                    opcaoSwitch = 0;
                    while(opcaoSwitch == 0){
                        System.out.println("------------------------");
                        System.out.println("Gerenciamento de Estoque");
                        System.out.println("------------------------");
                        System.out.println("Insira o código correspondente à ação desejada.");
                        System.out.println("[1] Consultar Estoque");
                        System.out.println("[2] Adicionar novo Produto");
                        System.out.println("[3] Remover um Produto");
                        System.out.println("[4] Atualizar um Produto");
                        opcaoSwitch = Integer.parseInt(entrada.nextLine());
                        
                       switch (opcaoSwitch){
                           
                           case 1:
                               estoque.listarProdutos();
                           break;
                                    
                           case 2:
                               System.out.println("Insira o código de barras do novo Produto: ");
                               codigoBarras = entrada.nextLine();
                               System.out.println("Insira o nome do novo Produto");
                               nomeProduto = entrada.nextLine();
                               System.out.println("Insira a descrição do Produto: ");
                               descricaoProduto = entrada.nextLine();
                               System.out.println("Insira o preço unitário do Produto (caso haja): ");
                               precoUnitario = Double.parseDouble(entrada.nextLine());
                               System.out.println("Insira o preço por kg do Produto (caso haja):");
                               precoKg = Double.parseDouble(entrada.nextLine());
                               System.out.println("Insira a quantidade inicial do produto");
                               quantidade = Integer.parseInt(entrada.nextLine());
                               System.out.println("Insira o estoque máximo do produto");
                               estoqueMax = Integer.parseInt(entrada.nextLine());
        
                               
                               estoque.adicionarProduto(new Produto
                                (codigoBarras, 
                             nomeProduto, 
                        fornecedor1,  
                         Categoria.ALIMENTOS, 
                         descricaoProduto, 
                                 precoUnitario, 
                                 precoKg, 
                                 quantidade,
                                 estoqueMax
                                ));
                               
                               System.out.println("Produto adicionado com sucesso");
                               
                               
                               
                           break;
                           
                       }  
                    }
                    
                
            }
            
            
        }while(opcao != 0);
        
        
        
        
        
        
        
        
        
        
        
        
                        
        
           
        
        
    }
}
