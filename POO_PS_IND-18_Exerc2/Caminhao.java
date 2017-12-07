/**
 *
 * @author Danilo Loschiavo
 */
public class Caminhao extends Veiculo {
    
    private double pesoEmQuilos;
    
    public Caminhao(int qtdRodas, String combustivel, double pesoEmQuilos) {
        //inicializa atributos da classe
        super(qtdRodas, combustivel);
        this.pesoEmQuilos = pesoEmQuilos;
    }
    
    public double getPesoEmQuilos(){
        //retorna peso
        return pesoEmQuilos;
    }
    
    public String getInformacoes(){
        //retorna informacoes
        return "É um Caminhão com "+ super.getRodas() + " rodas, pesando "+ pesoEmQuilos + 
                " quilos, movido a " + super.getCombustivel() + ".";
    }
    
}
