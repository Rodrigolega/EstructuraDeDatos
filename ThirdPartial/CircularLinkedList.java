class Nodo2 {
    int dato;
    Nodo2 siguiente;

    public Nodo2(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class CircularLinkedList {
    private Nodo2 cabeza = null;
    private Nodo2 cola = null;

    // Agregar nodo al final
    public void agregar(int dato) {
        Nodo2 nuevoNodo2 = new Nodo2(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo2;
            cola = nuevoNodo2;
            cola.siguiente = cabeza; // Hacer circular
        } else {
            cola.siguiente = nuevoNodo2;
            cola = nuevoNodo2;
            cola.siguiente = cabeza; // Hacer circular
        }
    }

    // Recorrer la lista
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo2 actual = cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(cabeza)");
    }
}