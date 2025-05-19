
import java.util.*;

public class Grafo {
    private final Map<String, List<String>> adyacencia;

    public Grafo() {
        adyacencia = new HashMap<>();
    }

    // Agregar vértice al grafo
    public void agregarVertice(String vertice) {
        adyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    // Agregar arista (conexión) entre dos vértices
    public void agregarArista(String origen, String destino) {
        adyacencia.putIfAbsent(origen, new ArrayList<>());
        adyacencia.putIfAbsent(destino, new ArrayList<>());
        adyacencia.get(origen).add(destino);
        adyacencia.get(destino).add(origen); // No dirigido
    }

    // Mostrar el grafo
    public void mostrarGrafo() {
        System.out.println("Representacion del grafo:");
        for (String vertice : adyacencia.keySet()) {
            System.out.println(vertice + " -> " + adyacencia.get(vertice));
        }
    }

    // Recorrido en anchura (BFS)
    public void bfs(String inicio) {
        System.out.println("Recorrido BFS desde " + inicio + ":");
        Set<String> visitados = new HashSet<>();
        Queue<String> cola = new LinkedList<>();

        cola.add(inicio);
        visitados.add(inicio);

        while (!cola.isEmpty()) {
            String actual = cola.poll();
            System.out.print(actual + " ");

            for (String vecino : adyacencia.get(actual)) {
                if (!visitados.contains(vecino)) {
                    cola.add(vecino);
                    visitados.add(vecino);
                }
            }
        }
        System.out.println();
    }
}