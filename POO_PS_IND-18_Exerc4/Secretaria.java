/**
 *
 * @author Danilo Loschiavo
 */
public class Secretaria extends Funcionario {
    
    @Override
    public double calcularParticipacaoNosLucros(){
        //retorna salaro*0,2
        return super.getSalario()*0.2;
    }
}
