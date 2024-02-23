package tarea.pkg2;

//  Creamos una interfaz común para todos los objetos que queremos clonar
interface Clonable {
    Clonable clonar();
}

// Creamos una clase concreta que implementa la interfaz Clonable
class Gato implements Clonable {
    private final String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Clonable clonar() {
        // Realizamos una copia exacta del objeto Gato
        return new Gato(this.nombre);
    }

    public void maullar() {
        System.out.println("¡Miau! Soy " + nombre);
    }
}

//  Creamos una clase principal para probar el patrón Prototype
public class Main {
    public static void main(String[] args) {
        // Creamos un gato original
        Gato gatoOriginal = new Gato("Pelusa");

        // Clonamos el gato original
        Gato gatoClonado = (Gato) gatoOriginal.clonar();

        // Verificamos que el clon sea igual al original
        System.out.println("¿El gato clonado es igual al original? " + (gatoOriginal == gatoClonado));

        // Probamos el método maullar del gato clonado
        gatoClonado.maullar();
    }
}

