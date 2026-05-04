package tp1.uso;

import tp1.implementacion.Cola;
import tp1.especificacion.ColaTDA;

public class Ejercicio4A {
    /* EJERCICIOS DEL TP1 - COLAS
        A partir del TDA Cola definido, escribir distintos métodos que permitan
            a) Pasar una Cola a otra
            b) Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)
            c) Invertir el contenido de una Cola (NO pueden usarse Pilas auxiliares)
            d) Determinar si el final de la Cola C1 coincide o no con la Cola C2.
            e) Determinar si una Cola es capicúa o no. Para ser capicúa debe cumplir
            que el primer elemento es igual al último, el segundo igual al penúltimo, etc.
            f) Determinar si la Cola C1 es la inversa de la Cola C2. Dos Colas serán
            inversas, si tienen los mismos elementos pero en orden inverso.
     */
    public static void main(String[] args) {
        ColaTDA colaOrigen = new Cola();
        colaOrigen.inicializarCola();
        colaOrigen.acolar(1);
        colaOrigen.acolar(2);
        colaOrigen.acolar(3);
        colaOrigen.acolar(4);

        ColaTDA colaDestino= new Cola();
        colaDestino.inicializarCola();

        pasarColaAOtra(colaOrigen, colaDestino);

        System.out.println("Elementos pasados de una cola a otra");
    }

    private static void pasarColaAOtra(ColaTDA colaOrigen, ColaTDA colaDestino) {
        while(!colaOrigen.colaVacia()) {
            int num = colaOrigen.primero();
            colaDestino.acolar(num);
            System.out.println("Acolado en destino: " + num);
            colaOrigen.desacolar();
        }
    }
}


