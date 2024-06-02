import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    ArrayList<Card> cartas = new ArrayList<Card>();
    public Deck() {
        for (int p = 0; p < 4; p++) {
            for (int v = 2; v < 15; v++) {
                Card carta = new Card(p, v);
                this.cartas.add(carta);
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(this.cartas);
        System.out.println("Se mezcló el Deck");
    }
    public void head() {
        Card carta = this.cartas.getFirst();
        System.out.print(carta.palo+",");
        System.out.print(carta.color+",");
        System.out.println(carta.valor);
        this.cartas.removeFirst();
        System.out.println("Quedan "+String.valueOf(this.cartas.size())+" cartas");
    }
    public void pick() {
        Random rand = new Random();
        int azar = rand.nextInt(this.cartas.size());
        Card carta = this.cartas.get( azar );
        System.out.print(carta.palo+",");
        System.out.print(carta.color+",");
        System.out.println(carta.valor);
        this.cartas.remove(azar);
        System.out.println("Quedan "+String.valueOf(this.cartas.size())+" cartas");
    }
    public ArrayList<Card> hand() {
        ArrayList<Card> mano  = new ArrayList<Card>();
        for (int i=0; i<5; i++) {
            Random rand = new Random();
            int azar = rand.nextInt(this.cartas.size());
            Card carta = cartas.get(azar);
            System.out.print(carta.palo+",");
            System.out.print(carta.color+",");
            System.out.println(carta.valor);
            mano.add(carta);
            cartas.remove(azar);
        }
        System.out.println("Quedan "+String.valueOf(this.cartas.size())+" cartas");
        return mano;
    }
}