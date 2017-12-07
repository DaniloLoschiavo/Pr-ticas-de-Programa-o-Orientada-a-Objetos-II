/**
 *
 * @author Danilo Loschiavo
 */
public class Desktop extends Computador {
    
    private String corGabinete;
    private int potenciaFonteEnergia;
    
    public Desktop(int velocidade, int quantidade, String fabricante) {
        //Construtor que deve setar os atributos da classe e deixar a cor do 
        //gabinete igual a branco e potencia de energia igual a 400
        super(velocidade, quantidade, fabricante);
        corGabinete = "branco";
        potenciaFonteEnergia = 400;
    }
    
    public Desktop(int velocidade, int quantidade, String fabricante, String cor, int potencia) {
        //Construtor que deve inicializa atributos de classe
        super(velocidade, quantidade, fabricante);
        corGabinete = cor;
        potenciaFonteEnergia = potencia;
    }
    
    public String getCorGabinete(){
        //retorna cor do gabinete
        return corGabinete;
    }
    
    public int getPotenciaFonteEnergia(){
        //retorna potencia da fonte de energia
        return potenciaFonteEnergia;
    }
    
    public String informacoesCompletas(){
        //retorna informações completa do computador
        return "Sou um Desktop. Meu processador " + super.getFabricanteProcessador() + 
            " Trabalha a uma velocidade " + super.getVelocidadeProcessador() + ". Possuo " + super.getQuantidadeMemoria() + " Mb de memória." + 
            " Meu gabinete é de cor " + corGabinete + " e minha fonte tem a potencia de " + potenciaFonteEnergia + "W.";
    }
    
}
