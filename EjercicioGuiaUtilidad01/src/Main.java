import cartas.Carta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        System.out.println("Carta siguiente: " + baraja.siguienteCarta());

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        List<Carta> mano = baraja.darCartas(5);
        if (mano != null) {
            System.out.println("Mano de cartas: " + mano);
        }

        System.out.println("Cartas en el montón: " + baraja.cartasMonton());

        System.out.println("Mostrar baraja:");
        baraja.mostrarBaraja();
    }
}
