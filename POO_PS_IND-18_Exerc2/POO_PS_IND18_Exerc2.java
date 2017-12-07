/**
 *
 * @author Danilo Loschiavo
 */
public class POO_PS_IND18_Exerc2 {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(3, "Etanol");
        Motocicleta motocicleta = new Motocicleta(2, "Gasolina", 125);
        Carro carro = new Carro(4, "Etanol/Gasolina", 1.6);
        Caminhao caminhao = new Caminhao(10, "Dísel", 3345.3);
        
        System.out.println("Veiculo: --------------------------------------------------------------------------------------------------");
        System.out.println("Combustivel: " + veiculo.getCombustivel());
        System.out.println("Rodas: " + veiculo.getRodas());
        System.out.println("Motocicleta: ----------------------------------------------------------------------------------------------");
        System.out.println("Cilindradas: " + motocicleta.getCilindradas());
        System.out.println(motocicleta.getInformacoes());
        System.out.println("Carro: ----------------------------------------------------------------------------------------------------");
        System.out.println("Potência: " + carro.getPotencia());
        System.out.println(carro.getInformacoes());
        System.out.println("Caminhão: -------------------------------------------------------------------------------------------------");
        System.out.println("Peso: " + caminhao.getPesoEmQuilos() + "KG");
        System.out.println(caminhao.getInformacoes());
    }
    
}
