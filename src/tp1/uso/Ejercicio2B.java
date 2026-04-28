package tp1.uso;

import tp1.especificacion.PilaTDA;
import tp1.implementacion.Pila;

public class Ejercicio2B {
    public static void main(String[] args) {
        PilaTDA pilaOrigen = new Pila();
        pilaOrigen.inicializarPila();
        pilaOrigen.apilar(1);
        pilaOrigen.apilar(2);
        pilaOrigen.apilar(3);
        pilaOrigen.apilar(4);

        PilaTDA pilaDestino = new Pila();
        pilaDestino.inicializarPila();

        copiarUnaPilaAOtraMismoOrden(pilaOrigen, pilaDestino);

        System.out.println("Pila de origen: ");
        pilaOrigen.imprimirArray();
        System.out.println("Pila de destino: ");
        pilaDestino.imprimirArray();
    }

    private static void copiarUnaPilaAOtraMismoOrden(PilaTDA pilaOrigen, PilaTDA pilaDestino) {
        // Crear una pila auxiliar para ayudarme a hacer el pasaje de valores
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();

        // Pasar todos los valores a la pila auxiliar; la pila original queda vacia
        while(!pilaOrigen.pilaVacia()) {
            int num = pilaOrigen.tope();
            pilaAux.apilar(num);
            pilaOrigen.desapilar();
        }

        // pilaOrigen:
        // pilaAux: 4-3-2-1
        // pilaDestino:

        // Cargar todos los valores a pila de destino, con el orden ya invertido
        while(!pilaAux.pilaVacia()){
            int num = pilaAux.tope();
            // Como habia vaciado la pila original, vuelvo a cargar los valores dejar la referencia en memoria igual
            pilaOrigen.apilar(num);
            pilaDestino.apilar(num);
            pilaAux.desapilar();
        }

         /*
            Resultado Final:
                - origen: 1-2-3-4
                - auxiliar:
                - destino: 1-2-3-4
         */
    }
}
