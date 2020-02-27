package trab02.zoo;
import trab02.animal.Animal;

/**
 * Zoo
 */
public class Zoo {
    public Animal prisao[] = new Animal[10];

    public void mostrarPrisao() {
        for(int i = 0 ; i < 10 ; i++){
            System.out.printf("EMITIR SOM %s e EMITIR AÇÃO %s\n", prisao[i].emitirSom(), prisao[i].actionrun());
        }
    }

}