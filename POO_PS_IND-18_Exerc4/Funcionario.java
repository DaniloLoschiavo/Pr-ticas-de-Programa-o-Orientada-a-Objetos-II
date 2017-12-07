/**
 *
 * @author Danilo Loschiavo
 */
public class Funcionario {
    
    private double salario;
    
    public double getSalario(){
     //retorna salario do funcionario
     return salario;
    }
    public double setSalario(double salario){
        //altera valor do salario
        return this.salario = salario;
    }
    
    public double calcularParticipacaoNosLucros(){
        //retorna 0
        return 0;
    }
    
}
