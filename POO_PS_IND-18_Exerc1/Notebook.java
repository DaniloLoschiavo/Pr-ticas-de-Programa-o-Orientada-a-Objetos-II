/**
 *
 * @author Danilo Loschiavo
 */
public class Notebook extends Computador{
    
    private int qtdAltoFalantes;
    private boolean possuiTouchPad;
    
    public Notebook(int velocidade, int quantidade, String fabricante) {
        //inicializa os atributos de classe e assumir que qtdAltoFalantes é 0 e que possuiTouchPad é false
        super(velocidade, quantidade, fabricante);
        qtdAltoFalantes = 0;
        possuiTouchPad = false;
    }
    
    public Notebook(int velocidade, int quantidade, String fabricante, int falantes, boolean touch) {
        //inicializa os atributos de classe
        super(velocidade, quantidade, fabricante);
        qtdAltoFalantes = falantes;
        possuiTouchPad = touch;
    }
    
    public int getQtdAltoFalantes(){
        //retorn quantidade de alto falantes
        return qtdAltoFalantes;
    }
    
    public boolean getPossuiTouchPad(){
        //retorna se tem touchpad
        return possuiTouchPad;
    }
    
    public String informacoesCompletas(){
        //retorna informações completa do computador
        return "Sou um Notebook. Meu processador " + super.getFabricanteProcessador() + 
            " Trabalha a uma velocidade " + super.getVelocidadeProcessador() + ". Possuo " + super.getQuantidadeMemoria() + " Mb de memória." +  
            " Tenho um total de " + qtdAltoFalantes + " alto-falantes e " + (possuiTouchPad ? "possuo touch pad." : "não possuo touch pad");
    }
    
}
