import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ThirdPartialMain {
    //ejemplo de cola 
        public static void main(String[] args) {
        //llamar funcion de cola
            //SinglyLinkedList
        System.out.println("SinglyLinkedList Example");
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        // Mostrar la lista actual
        System.out.println("Lista original:");
        list.display();
        // Agregar un nuevo valor
        list.insert(40);
        // Mostrar la lista después de insertar
        System.out.println("Despues de insertar 40:");
        list.display();

        System.out.println();
        //DobleLinkedList
        System.out.println("DobleLinkedList Example");
        DoubleLinkedList lista = new DoubleLinkedList();
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlInicio(5);

        lista.mostrarAdelante();   // Salida: 5 10 20 30
        lista.mostrarAtras();      // Salida: 30 20 10 5

        lista.eliminar(20);        // Elimina el nodo con valor 20
        lista.mostrarAdelante();   // Salida: 5 10 30

        System.out.println();
        //stack
        System.out.println("Pila Example");
        PilaExample pila = new PilaExample();
        // PUSH: Agregando elementos
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");
        // PEEK: Consultando el elemento en la cima
        System.out.println("Elemento en la cima: " + pila.peek());
        // POP: Eliminando elementos de la pila
        System.out.println("Elemento removido: " + pila.pop());
        System.out.println("Elemento removido: " + pila.pop());
        // PEEK: Estado final de la pila
        System.out.println("Elemento en la cima ahora: " + pila.peek());

        System.out.println();
        //Cola
        System.out.println("Cola Example");
        ColaExample cola = new ColaExample();
        // ENQUEUE: Agregando elementos a la cola
        cola.agregarCliente("Cami");
        cola.agregarCliente("Rodri");
        cola.agregarCliente("Pau");
        // PEEK: Consultando quién está al frente
        System.out.println("Cliente al frente: " + cola.verClienteAlFrente());
        // DEQUEUE: Atendiendo clientes
        System.out.println("Atendiendo a: " + cola.atenderCliente());
        System.out.println("Atendiendo a: " + cola.atenderCliente());
        // PEEK: Quién está ahora al frente
        System.out.println("Cliente al frente ahora: " + cola.verClienteAlFrente());

        System.out.println();
        //CircularList
        System.out.println("Circular List Example");
        CircularLinkedList Cir = new CircularLinkedList();
        Cir.agregar(1);
        Cir.agregar(2);
        Cir.agregar(3);
        Cir.agregar(4);

        Cir.mostrar();

        System.out.println();
        //arbol binario
        System.out.println("Arbol binario");
        BinarySearchTree bst = new BinarySearchTree();

        // Insertamos algunos valores desde aquí (puedes modificar)
        int[] valores = {50, 30, 20, 40, 70, 60, 80};
        for (int valor : valores) {
            bst.insert(valor);
        }

        System.out.print("Recorrido en orden: ");
        bst.inorder(); // Debe imprimir los números ordenados

        System.out.println();
         //GrafoExample
        System.out.println("Grafo Example");
        Grafo grafo = new Grafo();

        // Agregar vértices
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");

        // Agregar aristas
        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "C");
        grafo.agregarArista("B", "D");
        grafo.agregarArista("C", "E");

        // Mostrar grafo
        grafo.mostrarGrafo();

        // Recorrido BFS desde el vértice A
        grafo.bfs("A");
}
    }


