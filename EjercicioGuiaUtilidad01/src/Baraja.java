import cartas.Carta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    LinkedList<Carta> cartas;
    LinkedList<Carta> mixCartas;


    public  Baraja() {
    cartas = new LinkedList<>();
    mixCartas = new LinkedList<>();

        String[] palos = {"espada", "basto", "oro", "copa"};
        for (String palo: palos) {
            for (int i = 1; i <= 12; i++){
                if(i != 8 && i != 9){
                    Carta carta = new Carta(i, palo);
                    cartas.add(carta);
                }
            }
        }
    }
    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        Carta carta = cartas.remove(0);
        mixCartas.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                mano.add(carta);
            }
        }
        return mano;
    }

    public List<Carta> cartasMonton() {
        return mixCartas;
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}
/*
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.


 */