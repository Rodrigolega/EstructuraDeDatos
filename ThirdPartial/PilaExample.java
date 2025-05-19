import java.util.Stack;


public class PilaExample {
    public Stack<String> pila;

    public PilaExample() {
        pila = new Stack<>();
    }

    public void push(String item) {
        pila.push(item);
    }

    public String peek() {
        return pila.peek();
    }

    public String pop() {
        return pila.pop();
    }
}