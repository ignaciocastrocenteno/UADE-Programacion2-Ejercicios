package tp1.uso;

import tp1.especificacion.ColaTDA;
import tp1.especificacion.PilaTDA;
import tp1.implementacion.Cola;
import tp1.implementacion.Pila;

public class Ejercicio4F {
    public static void main(String[] args) {
        ColaTDA colaA = new Cola();
        colaA.inicializarCola();
        colaA.acolar(10);
        colaA.acolar(20);
        colaA.acolar(30);
        colaA.acolar(40);
        colaA.acolar(50);

        // NO COPIAR LOS VALORES, QUE PUEDE LLEVARA A DEBUGGING INNECESARIO Y PÉRDIDA DE TIEMPO
        ColaTDA colaB = new Cola();
        colaB.inicializarCola();
        colaB.acolar(50);
        colaB.acolar(40);
        colaB.acolar(30);
        colaB.acolar(20);
        colaB.acolar(10);
        // colaB.acolar(9999); // Probando que las colas son sean inversas

        System.out.println("Son colas inversas: " + sonColasInversas(colaA, colaB));
    }

    /*
        Como necesitamos validar si los elementos de ambas colas son inversos entre sí, usamos una
        pila auxiliar para dar vuelta los valores de una de las colas y comparar sus elementos contra
        la otra de modo de que todos los valores deberían ser iguales, si en algún punto no lo son
        no son colas inversas.
     */
    private static boolean sonColasInversas(ColaTDA colaA, ColaTDA colaB) {
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();
        // colaA: 10-20-30-40-50 (asumiendo que las colas son inversas)
        // colaB: 50-40-30-20-10
        // pilaAux:

        // Copiar los valores de una de las colas hacia la pila auxiliar
        while(!colaA.colaVacia()){
            int num = colaA.primero();
            pilaAux.apilar(num);
            colaA.desacolar();
        }

        // colaA:
        // colaB: 50-40-30-20-10
        // pilaAux: 10-20-30-40-50

        /*
            Una vez que los valores de una de las colas ya están invertidos, entonces comparamos
            todos los valores uno a uno.
         */
        while(!colaB.colaVacia() && !pilaAux.pilaVacia()) {
            int num = colaB.primero();
            int num2 = pilaAux.tope();
            colaB.desacolar();
            pilaAux.desapilar();

            // Si en algún momento los elementos son diferentes, no pueden ser espejos/inversos
            if(num != num2) {
                return false;
            }
        }

        // Si ambas estructuras fueron vaciadas y no se dieron elementos diferentes, entonces son inversas
        return true;
    }
}
