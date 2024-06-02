public class Card {
    String palo;
    String color;
    char valor;
    public Card(int palo, int v) {
        if (palo == 0) {
            this.palo = "trebol";
        }
        if (palo == 1) {
            this.palo = "pica";
        }
        if (palo == 2) {
            this.palo = "corazon";
        }
        if (palo == 3) {
            this.palo = "diamante";
        }
        this.color = palo < 2 ? "negro" : "rojo";
        this.valor = String.valueOf(v).charAt(0);
        if (v == 11) {
            this.valor = 'A';
        }

        if (v == 12) {
            this.valor = 'J';
        }

        if (v == 13) {
            this.valor = 'Q';
        }

        if (v == 14) {
            this.valor = 'K';
        }
    }
}
