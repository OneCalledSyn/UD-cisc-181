public class Node<AnyType> {
    public AnyType data;
    public Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next) {
        this.data = data;
        this.next = next;
    }

    public Node(AnyType data) {
        this.data = data;
        this.next = null;
    }
}