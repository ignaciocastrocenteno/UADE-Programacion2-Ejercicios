package tp1.implementacion;

import java.util.Arrays;
import tp1.especificacion.PilaTDA;

public class Pila implements PilaTDA {
    private int[] arr;
    private int indice;

    public void inicializarPila() {
        this.arr = new int[100];
        this.indice = 0;
    }

    public void apilar(int x) {
        this.arr[this.indice] = x;
        ++this.indice;
    }

    public void desapilar() {
        --this.indice;
    }

    public int tope() {
        return this.arr[this.indice - 1];
    }

    public boolean pilaVacia() {
        return this.indice == 0;
    }

    public void imprimirArray() {
        System.out.println(Arrays.toString(arr));
    }
}
