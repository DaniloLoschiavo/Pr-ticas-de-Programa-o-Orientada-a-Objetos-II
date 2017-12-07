/**
 *
 * @author Danilo Loschiavo
 */
public class Gerente extends Funcionario {
    
    @Override
    public double calcularParticipacaoNosLucros(){
        //retorna salaro*0,5
        return super.getSalario()*0.5;
    }
    
}
