import com.flowacademy.jegy.Jegy;
import com.flowacademy.jegy.ReturnJegy;

public class Main {
    public static void main(String[] args) {

        int validTickets = args.length / 4;
        if(args.length % validTickets != 0) {
            System.out.println("A megadott jegyadatok nem stimmelnek.");
            System.exit(1);
        }

        Jegy[] jegyek = new Jegy[validTickets];
        int n = 0;

        for (int i = 0; i < args.length; i+=4) {
            if ( args[i].equals("return") ) {
                jegyek[n] = new ReturnJegy( Integer.parseInt(args[i+1]), args[i+2],
                        Integer.parseInt(args[i+3]) );
                n++;
            } else if (args[i].equals("simple")) {
                jegyek[n] = new Jegy( Integer.parseInt(args[i+1]), args[i+2],
                        Integer.parseInt(args[i+3]) );
                n++;
            } else {
                System.out.println("Hibás a bevitt adat.");
            }
        }

        int max = jegyek[0].arKiszamit();
        Jegy highest = jegyek[0] ;


        for (int i = 0; i < jegyek.length; i++) {
            if ( jegyek[i].arKiszamit() > max ) {
                max = jegyek[i].arKiszamit();
                highest = jegyek[i];
            }
        }

        System.out.println("A legdrágább jegy: " + highest);

    }
}
