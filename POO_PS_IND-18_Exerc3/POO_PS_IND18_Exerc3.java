/**
 *
 * @author Danilo Loschiavo
 */
public class POO_PS_IND18_Exerc3 {

    public static void main(String[] args) {
        
	Animal animal = new Zebra("Testildo", 111, 321.2);
	
        Zebra zebra = new Zebra("Gimbiba", 132, 567.2);
        Elefante elefante = new Elefante("Genivaldo", 48.6, 2346.6);
                
        System.out.println("----------------------------------------------------------");
        System.out.println("Zebra ");
        zebra.setPeso(zebra.getPeso()+1);
        System.out.println("Peso: " + zebra.getPeso());
        zebra.setQuantidadeDeListras(zebra.getQuantidadeDeListras()+1);
        System.out.println("Quantidade de Listras: " + zebra.getQuantidadeDeListras());
        zebra.dizerNomeEEspecie();
        System.out.println("----------------------------------------------------------");
        System.out.println("Elefante ");
        elefante.setPeso(elefante.getPeso()+1);
        System.out.println("Peso: " + elefante.getPeso());
        elefante.setTamanhoDaTromba(elefante.getTamanhoDaTromba()+1);
        System.out.println("Tamanho da Tromba: " + elefante.getTamanhoDaTromba());
        elefante.dizerNomeEEspecie();
        
    }
    
}
