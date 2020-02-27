package trab02.cachorro;
import trab02.animal.Animal;
/**
 * Cachorro
 */
public class Cachorro extends Animal {
    public String emitirSom() {
        return "late";
    }
    public String actionrun() {
        return "corre";
    }

    public void nomearDogs(String nome) {
        this.nome = nome;
    }
}