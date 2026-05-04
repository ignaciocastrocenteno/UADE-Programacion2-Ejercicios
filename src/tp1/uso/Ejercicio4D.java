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

        System.out.println("Coincide el ultimo elementos de ambas colas: " + compararUltimoValorDeCola(colaA, colaB));

        // Casuística 2: Las colas tienen últimos elementos que son distintos
            limpiarCola(colaB);
            colaB.acolar(1);
            colaB.acolar(15);
            colaB.acolar(31);
            colaB.acolar(160);
    }

    private static boolean compararUltimoValorDeCola(ColaTDA colaA, ColaTDA colaB) {
        boolean resultado = false;



        return resultado;
    }

    private static void limpiarCola(ColaTDA colaLimpiar) {
        while(!colaLimpiar.colaVacia()) {
            colaLimpiar.desacolar();
        }
        System.out.println("Cola vaciada!");
    }
}
