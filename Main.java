import java.sql.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        //deck.pick();
        //deck.head();
        ArrayList<Card> mano = deck.hand();
    }
}
