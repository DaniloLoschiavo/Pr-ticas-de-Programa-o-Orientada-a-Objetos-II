/**
 *
 * @author Danilo Loschiavo
 */
public class Zebra extends Animal {
    
    private int quantidadeDeListras;
    private double peso;

    public Zebra(String nome, int listras, double peso) {
        //Inicializa parametros da classe
        super(nome);
        this.quantidadeDeListras = listras;
        this.peso = peso;
    }

    public int getQuantidadeDeListras(){
        //retorna quantidade de listras
        return quantidadeDeListras;
    }
    public void setQuantidadeDeListras(int val){
        //altera valor de quantidade de listras
        this.quantidadeDeListras = val;
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
        System.out.println(super.getNome() + " e sou uma Zebra.");
    }
    
    
    
}
