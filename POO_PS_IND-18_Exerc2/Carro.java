/**
 *
 * @author Danilo Loschiavo
 */
public class Carro extends Veiculo {
    
    private double potencia;

    public Carro(int qtdRodas, String combustivel, double potencia) {
        //inicializa atributos de classe
        super(qtdRodas, combustivel);
        this.potencia = potencia;
    }

    public double getPotencia(){
        //retorna potencia
        return potencia;
    }

    public String getInformacoes(){
        //retorna informações
       return "É um Carro com "+ super.getRodas() + " rodas, "+ potencia + 
                " de potência, movido a " + super.getCombustivel() + ".";
    }
    
}
