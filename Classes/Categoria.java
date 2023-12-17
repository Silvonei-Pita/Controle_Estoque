/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Classes;


public enum Categoria {
    //Categorias
    ALIMENTOS("Alimentos"),
    BEBIDAS("Bebidas"),
    PRODUTOS_DE_LIMPEZA("Produtos de Limpeza"),
    HIGIENE_PESSOAL("Higiene Pessoal"),
    ELETRODOMESTICOS("Eletrodomésticos"),
    ELETRONICOS("Eletrônicos"),
    VESTUARIO("Vestuário"),
    BRINQUEDOS("Brinquedos"),
    FERRAMENTAS("Ferramentas"),
    PAPELARIA("Papelaria"),
    AUTOMOTIVO("Automotivo"),
    ESPORTES("Artigos Esportivos"),
    PETSHOP("Pet Shop"),
    JARDINAGEM("Jardinagem"),
    BELEZA("Produtos de Beleza"),
    LIVROS("Livros"),
    MATERIAIS_CONSTRUCAO("Materiais de Construção"),
    TECNOLOGIA("Tecnologia"),
    AUTOMACAO_RESIDENCIAL("Automação Residencial"),
    MOVEIS_DECORACAO("Móveis e Decoração"),
    SUPLEMENTOS_NUTRICIONAIS("Suplementos Nutricionais"),
    MODA_ACESSORIOS("Moda e Acessórios"),
    INFORMATICA("Informática"),
    ARTIGOS_FESTA("Artigos para Festa"),
    INSTRUMENTOS_MUSICAIS("Instrumentos Musicais"),
    ENTRETENIMENTO("Filmes e Músicas"),
    ARTIGOS_RELIGIOSOS("Artigos Religiosos"),
    BEBES("Bebês"),
    BRICOLAGEM("Bricolagem"),
    TELEFONIA("Telefonia"),
    ARTESANATO("Artesanato"),
    MEDICAMENTOS("Medicamentos"),
    PESCA("Pesca"),
    VIAGEM("Artigos de Viagem"),
    OUTROS("Outros");

    private String nome;

    // Construtor
    Categoria(String nome) {
        this.nome = nome;
    }

    // Getters
    public String getNome() {
        return nome;
    }
}
