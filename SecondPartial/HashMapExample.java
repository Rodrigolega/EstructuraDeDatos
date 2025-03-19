import java.util.HashMap;

public class HashMapExample {
    private HashMap<String, Integer> map;

    public HashMapExample() {
        this.map = new HashMap<>();
    }

    public void add(String key, int value) {
        map.put(key, value);
    }

    public Integer get(String key) {
        return map.getOrDefault(key, null);
    }

    public void remove(String key) {
        map.remove(key);
    }

    public void printMap() {
        System.out.println("Contenido del HashMap: " + map);
    }

    public void performOperations() {
        add("Uno", 1);
        add("Dos", 2);
        add("Tres", 3);

        System.out.println("Valor de 'Dos': " + get("Dos"));

        remove("Uno");
        printMap();
    }
}
