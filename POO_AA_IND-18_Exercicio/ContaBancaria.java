/**
 *
 * @author Danilo Loschiavo
 */
public class ContaBancaria {
    
    private double saldo;
    // Determina o saldo da conta.

    private double limite;
    // Determina o limite de crédito do cheque especial.
    
    public ContaBancaria(double valorSaldo, double valorLimite){
        // Construtor padrão da classe.
        this.saldo = valorSaldo;
        this.limite = valorLimite;
    }
    

    public double getSaldo(){
        // Retorna o saldo da conta.
        return saldo;
    }

                    

    protected double getLimite(){
        // Retorna o limite da conta.
        return limite;
    }

    public double getSaldoComLimite(){
        // Retorna o saldo da conta somado ao limite.
        return saldo+limite;
    }
    
    //A sua classe conta bancária deve permitir apenas saques inferiores a R$ 500,00 
    //ou que não façam com que a soma entre o saldo e o limite da conta resultem em um valor menor do que zero. 
    //Caso estas condições não se cumpram, deve ser lançada uma ContaException com uma mensagem que identifique 
    //o tipo de erro.
    public boolean sacar(double valor) throws ContaException {
        // Deve decrementar o valor do saque da Conta. 
        // Retorna “true” caso a operação tenha sido bem sucedida, 
        // ou seja, a conta possui este valor (lembre-se de considerar o limite).
        if(valor <= 500)
            if(getSaldoComLimite() >= valor){
                saldo -= valor;
                return true;
            }
            else
                throw new ContaException("Não há limite disponível para o saque.");
        else
            throw new ContaException("Não é possivel sacar valor maior que R$ 500,00.");
    }

    //A conta não deve permitir depósitos superiores a R$ 1.000,00. 
    //Caso esta condição não se cumpra, deve ser lançada uma ContaException com uma mensagem 
    //identifique o tipo de erro.
    public boolean depositar(double valor) throws ContaException {
        // Deve incrementar o valor a Conta.
        if(valor <= 1000){
            saldo += valor;
            return true;
        }
        else
            throw new ContaException("Não é possivel depositar valor maior que R$ 1000,00.");
    }

    
}
