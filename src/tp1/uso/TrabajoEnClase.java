package tp1.uso;

import tp1.especificacion.PilaTDA;
import tp1.implementacion.Pila;

public class TrabajoEnClase {
    public static void main(String[] args) {
        /*
            EJERCICIOS EN CLASE - STACKS
                1) Pasar los elementos de una pila origen a una pila destino, en donde se perderán los elementos
                   de la pila origen y en la pila destino quedarán esos elementos en orden inverso a la origen.
                   Escribir un método que nos devuelva la suma de los valores que contiene la pila. En éste caso, el
                   método va a retornar un valor de tipo int.

            EJERCICIOS DEL TP1 - STACKS
                1) Definir el TDA Pila, listando las operaciones asociadas y establecer sus precondiciones.
                2) A partir del TDA Pila definido, escribir distintos métodos que permitan
                    a) Pasar una Pila a otra (dejándola en orden inverso)
                    b) Copiar una Pila en otra (dejándola en el mismo orden que la original)
                    c) Invertir el contenido de una Pila.
                    d) Contar los elementos de una Pila
                    e) Sumar los elementos de una Pila
                    f) Calcular el promedio de los elementos de una Pila
         */
        Pila pilaOrigen = new Pila();
        pilaOrigen.inicializarPila();
        pilaOrigen.apilar(1);
        pilaOrigen.apilar(2);
        pilaOrigen.apilar(3);
        pilaOrigen.apilar(4);
        pilaOrigen.apilar(5);

        PilaTDA pilaDestino = new Pila();
        pilaDestino.inicializarPila();

        invertirElOrdenDeLaPila(pilaOrigen, pilaDestino);

        pilaOrigen.imprimirArray();
        pilaDestino.imprimirArray();

        sumarElementosDeLaPila(pilaDestino);
    }

    private static void invertirElOrdenDeLaPila(PilaTDA pilaOrigen, PilaTDA pilaDestino) {
       // Complejidad temporal: O(n) --> Complejidad Lineal
        while(!pilaOrigen.pilaVacia()) {
          int num = pilaOrigen.tope();
          pilaOrigen.desapilar();
          // System.out.println("Numero desapilado: " + num);
          pilaDestino.apilar(num);
       }
    }

    private static int sumarElementosDeLaPila(PilaTDA pila) {
        int resultado = 0;

        while(!pila.pilaVacia()){
            int num = pila.tope();
            resultado += num;
            pila.desapilar();
        }

        System.out.println("Resultado final de la suma: " + resultado);

        return resultado;
    }
}
