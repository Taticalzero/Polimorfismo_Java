package trab02.cavalo;
import trab02.animal.Animal;

/**
 * Cavalo
 */
public class Cavalo extends Animal{
    public String emitirSom() {
        return "rinlicha";
    }
    public String actionrun() {
        return "trote";
    }
    public void nomearCav(String nome) {
        this.nome = nome;
    }
    
}