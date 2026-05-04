package tp1.uso;

import tp1.especificacion.ColaTDA;
import tp1.implementacion.Cola;

public class Ejercicio4C {
    public static void main(String[] args) {
        ColaTDA colaOrigen = new Cola();
        colaOrigen.inicializarCola();
        colaOrigen.acolar(1);
        colaOrigen.acolar(2);
        colaOrigen.acolar(3);
        colaOrigen.acolar(4);

        invertirValoresDeColaSinColaAux(colaOrigen);

        System.out.println("Elementos de la cola ya invertidos (sin pilas auxiliares)");
    }

    // NO SE PUEDE UTILIZAR UNA PILA AUXILIAR PARA HACER EL PASAJE
    private static ColaTDA invertirValoresDeColaSinColaAux(ColaTDA cola) {
        // Como no se pueden usar estructuras de datos externas, utilizamos un enfoque recursivo
        int num = 0;

        // cola: 1-2-3-4
        num = cola.primero();
        cola.desacolar();

        if(cola.colaVacia()){
            cola.acolar(num);
            // System.out.println(num);
            return cola;
        }

        return invertirValoresDeColaSinColaAux(cola);
    }

    /*
        NOTA ACERCA DE COMPLEJIDADES:
            - Complejidad Constante (C): Para asignación de valores discretos, definición de búsquedas en bucles (sean
            for-loops o while-loops) y retorno de valores.
            - Complejidad Lineal (L): Para bucles que dependen directamente de la cantidad de valores que hay que
            recorrer.
            - Complejidad Polinómica (P): Para los bucles dentro de otro bucles, o bien búsquedas secundarias que
            dependan de otros valores para hacer mis cálculos o búsquedas principales.
     */
}
