/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Produto {
    // Atributos 
    private String codigoBarras;
    private String nome;
    private Fornecedor fornecedor;
    private Categoria categoria;
    private String descricao;
    private double precoUnitario;
    private double precoKg;
    protected int quantidade;
    private int estoqueMax;
    

    // Construtor 
    public Produto(String codigoBarras, String nome, Fornecedor fornecedor, Categoria categoria, String descricao, double precoUnitario, double precoKg, int quantidade, int estoqueMax) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.precoKg = precoKg;
        this.quantidade = quantidade;
        this.estoqueMax = estoqueMax;
    }

    // To String
    @Override
    public String toString() {
        return "[A] " + codigoBarras + " / [B] " + nome + " / [C] " + categoria + " / [D] " + quantidade + " / [E] " + precoUnitario + " / [F] " + precoKg + " / [G] " + descricao + " / [H] " + fornecedor.getNome() + " / [I] " + estoqueMax;    }

   
    // Getters 
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getEstoqueMax() {
        return estoqueMax;
    }

    
    
     
     
    
    
    
}
