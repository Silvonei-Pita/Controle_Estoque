
package Classes;


public class Endereco {
    // Atributos
    private int id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private UnidadeFederativa uf;
    private String complemento;

    // Construtor
    public Endereco(int id, String cep, String logradouro, String bairro, String cidade, UnidadeFederativa uf, String complemento) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public String getComplemento() {
        return complemento;
    }
  
    
}
