// Definición del nodo
class Nodo {
    int data;
    Nodo prev;
    Nodo next;

    // Constructor del nodo
    public Nodo(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Implementación de la lista doblemente enlazada
public class DoubleLinkedList {
    private Nodo head;
    private Nodo tail;

    // Constructor de la lista
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // 🔹 Método para agregar al final de la lista
    public void agregarAlFinal(int data) {
        Nodo nuevoNodo = new Nodo(data);

        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.prev = tail;
            tail = nuevoNodo;
        }
    }

    // 🔹 Método para agregar al inicio de la lista
    public void agregarAlInicio(int data) {
        Nodo nuevoNodo = new Nodo(data);

        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            nuevoNodo.next = head;
            head.prev = nuevoNodo;
            head = nuevoNodo;
        }
    }

    // 🔹 Método para eliminar un nodo específico
    public void eliminar(int data) {
        Nodo actual = head;

        while (actual != null) {
            if (actual.data == data) {
                if (actual.prev != null) {
                    actual.prev.next = actual.next;
                } else {
                    head = actual.next;
                }

                if (actual.next != null) {
                    actual.next.prev = actual.prev;
                } else {
                    tail = actual.prev;
                }

                System.out.println("Nodo con valor " + data + " eliminado.");
                return;
            }
            actual = actual.next;
        }
        System.out.println("Nodo con valor " + data + " no encontrado.");
    }

    // 🔹 Método para mostrar la lista en orden
    public void mostrarAdelante() {
        System.out.print("Lista (inicio a fin): ");
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.data + " ");
            actual = actual.next;
        }
        System.out.println();
    }

    // 🔹 Método para mostrar la lista en orden inverso
    public void mostrarAtras() {
        System.out.print("Lista (fin a inicio): ");
        Nodo actual = tail;
        while (actual != null) {
            System.out.print(actual.data + " ");
            actual = actual.prev;
        }
        System.out.println();
    }
}