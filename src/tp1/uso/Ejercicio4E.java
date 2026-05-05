package tp1.uso;

import tp1.especificacion.ColaTDA;
import tp1.implementacion.Cola;
import tp1.especificacion.PilaTDA;
import tp1.implementacion.Pila;

public class Ejercicio4E {
    public static void main(String[] args) {
        ColaTDA colaA = new Cola();
        colaA.inicializarCola();
        colaA.acolar(1);
        colaA.acolar(1);
        colaA.acolar(500);
        colaA.acolar(500);
        colaA.acolar(1);
        colaA.acolar(1);

        ColaTDA colaB = new Cola();
        colaB.inicializarCola();
        colaB.acolar(1);
        colaB.acolar(1);
        colaB.acolar(500);
        colaB.acolar(500);
        colaB.acolar(1);
        colaB.acolar(1);
        // colaB.acolar(99) // Para probar que el retorno es falso

        System.out.println("Son ambas colas palindromos: " + sonColasCapicuas(colaA, colaB));
    }

    // Para verificar si las colas tienen elementos que forman un palindromo, usamos una pila auxiliar
    private static boolean sonColasCapicuas(ColaTDA colaA, ColaTDA colaB) {
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();
        // colaA = 1-1-500-500-1-1 (si fueran capicuas)
        // colaB = 1-1-500-500-1-1
        // pilaAux =

        // Descargar los elementos de la primera cola en la pila auxiliar, para invertir los elementos
        while(!colaA.colaVacia()) {
            int num = colaA.primero();
            colaA.desacolar();
            pilaAux.apilar(num);
        }

        // colaA =
        // colaB = 1-1-500-500-1-1 (en el orden original, sin modificación)
        // pilaAux = 1-1-500-500-1-1 (valores ya invertidos, asumiendo que son iguales)

        // Con los elementos ya invertidos, empiezo a comparar uno a uno los valores de cada estructura
        // Si una estructura tiene más elementos que la otra, o viceversa, ya no puede ser un palíndromo
        while(!colaB.colaVacia() && !pilaAux.pilaVacia()) {
            int num = colaB.primero();
            int num2 = pilaAux.tope();
            colaB.desacolar();
            pilaAux.desapilar();

            // Si en algun caso no coinciden los elementos en cada iteración, no puede ser capicua
            if(num != num2){
                return false;
            }
        }

        return true;
    }
}
