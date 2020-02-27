package trab02.veterinario;
import trab02.animal.Animal;

/**
 * Veterinario
 */
public class Veterinario {
    public String examinar(Animal animal) {
        return animal.emitirSom();
    }
}