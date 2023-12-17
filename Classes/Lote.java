/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;


public class Lote {
    // Atributos
    // -- Talvez precise adicionar o atributo "Produtos" aqui também
    private int id;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    // Construtor
    public Lote(int id, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.id = id;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
    
    
    
    
    
}
