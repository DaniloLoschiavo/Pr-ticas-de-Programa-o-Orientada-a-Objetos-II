/**
 *
 * @author Danilo Loschiavo
 */
public class Veiculo {
    
    private int qtdRodas;
    private String combustivel;
    
    public Veiculo(int qtdRodas, String combustivel){
        //contrutor que inicializa os atributos
        this.qtdRodas = qtdRodas;
        this.combustivel = combustivel;
    }
    
    public int getRodas(){
        //retorna a quantidade de rodas
        return qtdRodas;
    }
    
    public String getCombustivel(){
        //retorna o tipo de combustivel do veiculo
        return combustivel;
    }
    
}
