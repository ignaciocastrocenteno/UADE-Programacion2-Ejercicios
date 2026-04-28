package tp1.especificacion;

public interface PilaTDA {
    public abstract void inicializarPila();
    public abstract boolean pilaVacia(); // Precondicion: inicializacion
    public abstract void apilar(int x); // Precondicion: inicializacion
    public abstract void desapilar(); // Precondicion: inicializacion y no estar vacia
    public abstract int tope(); // Precondicion: inicializacion y no estar vacia
    public abstract void imprimirArray(); // Precondicion: inicializacion
}
