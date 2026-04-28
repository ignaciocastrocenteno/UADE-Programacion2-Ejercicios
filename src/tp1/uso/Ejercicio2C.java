package tp1.uso;

import tp1.especificacion.PilaTDA;
import tp1.implementacion.Pila;

public class Ejercicio2C {
    public static void main(String[] args) {
        PilaTDA pila = new Pila();
        pila.inicializarPila();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);

        PilaTDA pilaInvertida = invertirContenidoDeUnaPila(pila);

        pilaInvertida.imprimirArray();
    }

    private static PilaTDA invertirContenidoDeUnaPila(PilaTDA pilaOrigen) {
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();

        while(!pilaOrigen.pilaVacia()) {
            int num = pilaOrigen.tope();
            pilaAux.apilar(num);
            pilaOrigen.desapilar();
        }

        return pilaAux;
    }
}
