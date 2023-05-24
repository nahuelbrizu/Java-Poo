package cartas;

import java.util.LinkedList;

public class Carta {
    private int numCarta;
    private String palo;

    public Carta() {
    }

    public Carta(int numCarta, String palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numCarta=" + numCarta +
                ", palo='" + palo + '\'' +
                '}';
    }
}
