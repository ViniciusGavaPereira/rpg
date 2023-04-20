package jogorpg;

public class Armas {

    Integer id;
    String nome;
    Integer dano;
    Integer quantidade;
    
    public Armas() {

    }

    public Armas(Integer id, String nome, Integer dano, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.dano = dano;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
