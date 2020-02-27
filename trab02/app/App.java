package trab02.app;

import trab02.cachorro.Cachorro;
import trab02.cavalo.Cavalo;
import trab02.preguica.Preguica;
import trab02.veterinario.Veterinario;
import trab02.zoo.Zoo;

import java.util.Scanner;


/**
 * App
 */
public class App {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        Veterinario veterinario = new Veterinario();
        Zoo zoo = new Zoo();

        cachorro.nomearDogs(sc.nextLine());
        cavalo.nomearCav(sc.nextLine());
        preguica.nomearPreg(sc.nextLine());

        // Nomes dos Animais

        System.out.println("Nome do Cachorro " + cachorro.mostrarNome());
        System.out.println("Nome do Cavalo " + cavalo.mostrarNome());
        System.out.println("Nome da Preguica " + preguica.mostrarNome());

        System.out.println();
        System.out.println();

        // Os animais emitem os Sons
       
        System.out.println("Cachorro emitindo Som " + cachorro.emitirSom());
        System.out.println("Cavalo emitindo Som " + cavalo.emitirSom());
        System.out.println("Preguica emitindo Som " + preguica.emitirSom());

        System.out.println();
        System.out.println();
        
        // Os animais emitem as ações

        System.out.println("Cachorro emitindo ação " + cachorro.actionrun());
        System.out.println("Cavalo emitindo ação " + cavalo.actionrun());
        System.out.println("Preguica emitindo ação " + preguica.actionrun());

        System.out.println();
        System.out.println();

        // Veterinario ao examinar 

        System.out.println("Veterinario examinando cachorro " + veterinario.examinar(cachorro));
        System.out.println("Veterinario examinando cavalo " + veterinario.examinar(cavalo));
        System.out.println("Veterinario examinando preguica " + veterinario.examinar(preguica));

        System.out.println();
        System.out.println();

        // Zoologico aprisionando os animais
         
        int opcao = 0;
        int cont = 0;
        while(cont < 10){

            System.out.println("Infomer o animal : ");
            System.out.println("0 Sair ");
            System.out.println("1 Cachorro ");
            System.out.println("2 Cavalo ");
            System.out.println("3 Preguica ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                zoo.prisao[cont] = cachorro;
                cont++;
            }
            else if (opcao == 2) {
                zoo.prisao[cont] = cavalo;
                cont++;
            } 
            else if(opcao == 3){
                zoo.prisao[cont] = preguica;
                cont++;
            }
            else if (opcao == 0) {
                break;
            }
            else{
                System.out.println("Opção invalida!");
            }
        }       

        System.out.println();
        zoo.mostrarPrisao();

        sc.close();
    }
}