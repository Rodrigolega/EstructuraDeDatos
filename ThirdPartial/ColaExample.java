import java.util.LinkedList;
import java.util.Queue;

public class ColaExample {
    public Queue<String> cola;

    public ColaExample() {
        cola = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        cola.add(cliente);
    }

    public String verClienteAlFrente() {
        return cola.peek();
    }

    public String atenderCliente() {
        return cola.poll();
    }
}