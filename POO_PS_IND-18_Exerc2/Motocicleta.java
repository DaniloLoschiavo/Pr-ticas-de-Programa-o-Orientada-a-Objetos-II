/**
 *
 * @author Danilo Loschiavo
 */
public class Motocicleta extends Veiculo{
    
    private int cilindradas;
    
    public Motocicleta(int qtdRodas, String combustivel, int cilindradas) {
        //inicializa atributos de classe
        super(qtdRodas, combustivel);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        //retorna cilindrada
        return cilindradas;
    }
    
    public String getInformacoes(){
        //retorna informações
        return "É uma Motocicleta com "+ super.getRodas() + " rodas, "+ cilindradas + 
                " cilindradas, movida a " + super.getCombustivel() + ".";
    }
    
}
