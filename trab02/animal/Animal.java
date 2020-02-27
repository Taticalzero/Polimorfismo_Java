package trab02.animal;

/**
 * Animal
 */
public class Animal {
    protected String nome;
    protected String idade;

    public String emitirSom() {
        return "sound";
    }
    public String actionrun() {
        return "action";
    }
    public String mostrarNome(){
        return this.nome;
    }
}