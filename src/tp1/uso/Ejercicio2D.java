package tp1.uso;

import tp1.especificacion.PilaTDA;
import tp1.implementacion.Pila;

public class Ejercicio2D {
    public static void main(String[] args) {
        PilaTDA pila = new Pila();
        pila.inicializarPila();
        pila.apilar(1);
        pila.apilar(10);
        pila.apilar(50);
        pila.apilar(100);
        pila.apilar(150);
        // pila.apilar(500);

        pila.imprimirArray();
        System.out.println("Cantidad de elementos que tiene la pila: " + contarElementosDeUnaPila(pila));
    }

    private static int contarElementosDeUnaPila(PilaTDA pila) {
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();
        int cantElementos = 0;

        // Desapilar la pila para contabilizar los elementos
        while(!pila.pilaVacia()){
            int num = pila.tope();
            pilaAux.apilar(num);
            cantElementos++;
            pila.desapilar();
        }

        // pila:
        // auxiliar: 150-100-50-10-1

        // Reapilar elementos, para dejar en el mismo estado la referencia en memoria de la pila original
        while(!pilaAux.pilaVacia()){
            int num = pilaAux.tope();
            pila.apilar(num);
            pilaAux.desapilar();
        }

        return cantElementos;
    }
}
