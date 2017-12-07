package poo_ps_ind.pkg18_exerc1;

/**
 * 
 * 
 * @author Danilo Loschiavo
 */
public class POO_PS_IND18_Exerc1 {

    public static void main(String[] args) {
        Notebook note = new Notebook(2500, 4000, "AMD", 2, true);
        Desktop desk = new Desktop(3000, 8000, "AMD", "preta", 400);
        Computador comp = new Computador(1200, 2000, "INTEL");
        
        System.out.println("Notebook: --------------------------------------------------------------------------------------------------");
        System.out.println(note.dizerInformacoes());
        System.out.println(note.informacoesCompletas());
        System.out.println("Desktop: ---------------------------------------------------------------------------------------------------");
        System.out.println(desk.dizerInformacoes());
        System.out.println(desk.informacoesCompletas());
        System.out.println("Computador: ------------------------------------------------------------------------------------------------");
        System.out.println(comp.dizerInformacoes());
    }
    
}
