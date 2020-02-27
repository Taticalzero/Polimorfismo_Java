package trab02.preguica;
import trab02.animal.Animal;
/**
 * Preguica
 */
public class Preguica extends Animal {
    public String emitirSom() {
        return "gruni";
    }
    public String actionrun() {
        return "subir arvore";
    }
    public void nomearPreg(String nome) {
        this.nome = nome;
    }
    

    
}