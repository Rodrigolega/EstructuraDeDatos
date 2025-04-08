public class ThirdPartialMain {
        // Test the list
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
    
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(70);
    
            System.out.println("List:");
            list.display();
    
            System.out.println("Is 70 in the list? " + list.search(70));
    
            int numeroRemove = 10;
            list.delete(numeroRemove);
    
            System.out.println("After deleting: " + numeroRemove);
            list.display();
}
}