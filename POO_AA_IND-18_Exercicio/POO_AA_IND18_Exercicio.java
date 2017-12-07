/**
 *
 * @author Danilo Loschiavo
 */
public class POO_AA_IND18_Exercicio {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(100,100);
        try{
            System.out.println("Tentativa de saque maior que 500 reais: " +(conta.sacar(501) ? "OK" : ""));
        }catch(ContaException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println("Tentativa de saque maior que saldo: " +(conta.sacar(300) ? "OK" : ""));
        }catch(ContaException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println("Tentativa de saque 50 reais: " +(conta.sacar(50) ? "OK" : ""));
        }catch(ContaException ex) {
            System.out.println(ex.getMessage());
        }
        
        try{
            System.out.println("Tentativa de deposito maior que 1000  reais: " +(conta.depositar(1001) ? "OK" : ""));
        }catch(ContaException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println("Tentativa de deposito 100 reais: " +(conta.depositar(300) ? "OK" : ""));
        }catch(ContaException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
