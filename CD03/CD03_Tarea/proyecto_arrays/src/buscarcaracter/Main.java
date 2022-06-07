package buscarcaracter;

/**
 *
 * @author Profesor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        char C = 'K';
        char[] V = {'A','A','A','A','A','A','A','A','A','A','A'};
        OperacionsArrays x=new OperacionsArrays();        
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(C, V);
        System.out.print(result + "\t");
    }
}
