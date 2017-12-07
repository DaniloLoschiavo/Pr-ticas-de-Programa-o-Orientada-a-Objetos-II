/**
 *
 * @author Danilo Loschiavo
 */
public class Elefante extends Animal {
    
    private double tamanhoDaTromba;
    private double peso;

    public Elefante(String nome, double tamanhoTromba, double peso) {
        //Inicializa parametros da classe
        super(nome);
        this.tamanhoDaTromba = tamanhoTromba;
        this.peso = peso;
    }

    public double getTamanhoDaTromba(){
        //retorna tamanho da tromba
        return tamanhoDaTromba;
    }
    public void setTamanhoDaTromba(double val){
        //altera valor do tamanho da tromba
        this.tamanhoDaTromba = val;
    }
    
    public double getPeso(){
        //retorna peso
        return peso;
    }
    public void setPeso(double val){
        //altera valor do peso
        this.peso = val;
    }    
    
    @Override
    public void dizerNomeEEspecie() {
        //imprime nome e especie
        System.out.println(super.getNome() + " e sou um Elefante.");
    }
    
}
