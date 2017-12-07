/**
 *
 * @author Danilo Loschiavo
 */
public class POO_PS_IND18_Exerc4 {

    public static void main(String[] args) {
        
        Funcionario carlos = new Gerente();
        Funcionario amanda = new Secretaria();
        carlos.setSalario(2300);
        amanda.setSalario(1900);
        System.out.println("Participação Carlos: " + carlos.calcularParticipacaoNosLucros() + 
                " Salario: " + carlos.getSalario());
        System.out.println("Participação Amanda: " + amanda.calcularParticipacaoNosLucros() + 
                " Salario: " + amanda.getSalario());
    }
    
}
