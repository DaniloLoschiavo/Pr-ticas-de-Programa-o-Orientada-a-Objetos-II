/**
 *
 * @author Danilo Loschiavo
 */
public abstract class Animal {
    
    private String nome;
    
    public Animal(String nome){
        //Inicializa parametros da classe
        this.nome = nome;
    }
    
    public String getNome(){
        //retorna nome
        return "Eu sou um animal chamado " + nome;
    }
    
    public abstract void dizerNomeEEspecie();
    
}
