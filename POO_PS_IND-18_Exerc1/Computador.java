/**
 *
 * @author Danilo Loschiavo
 */
public class Computador {
    
    private int velocidadeProcessador;
    private int quantidadeMemoria;
    private String fabricanteProcessador;
    
    public Computador(int velocidade, int quantidade, String fabricante){
        //inicializa atributos da classe
        velocidadeProcessador = velocidade;
        quantidadeMemoria = quantidade;
        fabricanteProcessador = fabricante;
    }
    
    public int getVelocidadeProcessador(){
        //retorna a velocidade do processador
        return velocidadeProcessador;
    }
    
    public int getQuantidadeMemoria(){
        //retorna quantidade de memoria do computador
        return quantidadeMemoria;
    }
    
    public String getFabricanteProcessador(){
        //retorna o fabricante do processador
        return fabricanteProcessador;
    }
    
    public String dizerInformacoes(){
        //retorna informações
        return "Sou um computador. Meu processador " + fabricanteProcessador + 
                " Trabalha a uma velocidade " + velocidadeProcessador + ". Possuo " + quantidadeMemoria + " Mb de memória.";
    }
    
}
