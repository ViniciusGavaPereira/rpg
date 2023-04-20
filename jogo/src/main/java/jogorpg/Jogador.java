package jogorpg;

public class Jogador {
    
    String nome;
    Integer vida;
    Integer mana;
    Integer stamina;
    Armas armas;


    
    
    public Jogador() {
    }


   

    
    public Jogador(String nome, Integer vida, Integer mana, Integer stamina, Armas armas) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.stamina = stamina;
        this.armas = armas;
    }





    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getVida() {
        return vida;
    }
    public void setVida(Integer vida) {
        this.vida = vida;
    }
    public Integer getMana() {
        return mana;
    }
    public void setMana(Integer mana) {
        this.mana = mana;
    }
    public Integer getStamina() {
        return stamina;
    }
    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }


    public Armas getArmas() {
        return armas;
    }


    public void setArmas(Armas armas) {
        this.armas = armas;
    }
  
   
    
}
