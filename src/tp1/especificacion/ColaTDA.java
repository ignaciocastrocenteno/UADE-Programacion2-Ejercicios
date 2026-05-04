package tp1.especificacion;

public interface ColaTDA {
    public abstract void inicializarCola();
    public abstract void acolar(int x); // Precondicion: cola inicializada
    public abstract void desacolar(); // Precondicion: cola inicializada y tener elementos
    public abstract int primero(); // Precondicion: cola inicializada y tener elementos
    public abstract boolean colaVacia(); // Precondicion: cola inicializada
}