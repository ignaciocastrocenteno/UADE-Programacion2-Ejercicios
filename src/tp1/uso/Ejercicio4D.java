package tp1.uso;

import tp1.especificacion.ColaTDA;
import tp1.implementacion.Cola;

public class Ejercicio4D {
    public static void main(String[] args) {
        // Casuística 1: Ambas colas tienen el mismo último elemento
            ColaTDA colaA = new Cola();
            colaA.inicializarCola();
            colaA.acolar(1);
            colaA.acolar(15);
            colaA.acolar(160);

            ColaTDA colaB = new Cola();
            colaB.inicializarCola();
            colaB.acolar(1);
            colaB.acolar(15);
            colaB.acolar(86);
            colaB.acolar(160);
            // colaB.acolar(161); // Probando si el último elementos fuese diferente

        System.out.println("Coincide el ultimo elemento de ambas colas: " + compararUltimoValorDeCola(colaA, colaB));
    }

    private static boolean compararUltimoValorDeCola(ColaTDA colaA, ColaTDA colaB) {
        int ultimoColaA = 0;
        int ultimoColaB = 0;
        // 1-15-31-160

        // Recorrer la colaA hasta encontrar el último elemento
        while(!colaA.colaVacia()){
            ultimoColaA = colaA.primero();
            colaA.desacolar();
        }

        // Recorrer la colaB hasta encontrar el último elemento
        while(!colaB.colaVacia()){
            ultimoColaB = colaB.primero();
            colaB.desacolar();
        }

        return ultimoColaA == ultimoColaB;
    }
}