package tp1.uso;

import tp1.especificacion.PilaTDA;
import tp1.implementacion.Pila;

public class Ejercicio2E {
    public static void main(String[] args) {
        PilaTDA pila = new Pila();
        pila.inicializarPila();
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        System.out.println("Promedio de los elementos de la pila (esperado = 20): " + calcularPromedioDeElementos(pila));
    }

    private static int calcularPromedioDeElementos(PilaTDA pila) {
        // Como la interface no considera numeros decimales, se acota la acumulacion a ser unicamente entera
        int acumulador = 0;
        int contador = 0;
        PilaTDA pilaAux = new Pila();
        pilaAux.inicializarPila();

        while(!pila.pilaVacia()) {
            int num = pila.tope();
            pilaAux.apilar(num);
            acumulador += num;
            contador++;
            pila.desapilar();
        }

        return acumulador / contador;
    }
}
