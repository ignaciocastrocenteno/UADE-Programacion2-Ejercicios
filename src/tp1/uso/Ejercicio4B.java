package tp1.uso;

import tp1.especificacion.ColaTDA;
import tp1.especificacion.PilaTDA;
import tp1.implementacion.Cola;
import tp1.implementacion.Pila;

public class Ejercicio4B {
    public static void main(String[] args) {
        ColaTDA cola = new Cola();
        cola.inicializarCola();
        cola.acolar(1);
        cola.acolar(2);
        cola.acolar(3);
        cola.acolar(4);

        invertirValoresColaConPilaAux(cola);

        System.out.println("Elementos de la cola ya invertidos!");
    }

    // Se solicita invertir los valores de una cola de origen hacia una cola de destino (se puede usar pilas auxiliares)
    private static void invertirValoresColaConPilaAux(ColaTDA colaOrigen) {
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();

        // colaOrigen: 1-2-3-4
        // pilaAux:
        // colaDestino:

        // Agregar los valores de la cola de origen en una pila auxiliar, para invertir el orden de sus elementos
        while(!colaOrigen.colaVacia()){
            int num = colaOrigen.primero();
            pilaAux.apilar(num);
            System.out.println("Apilado: " + num);
            colaOrigen.desacolar();
        }

        // colaOrigen:
        // pilaAux: 4-3-2-1

        // Volver a agregar los elementos a la cola, ahora ya invertidos
        while(!pilaAux.pilaVacia()){
            int num = pilaAux.tope();
            System.out.println("Encolado: " + num);
            colaOrigen.acolar(num);
        }

        // colaOrigen: 4-3-2-1
        // pilaAux:
    }
}
