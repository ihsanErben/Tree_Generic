package W6_Tree_Generic;

public class Node<G> {

    Node<G> left;
    Node<G> right;

    G item;
    int data;

    public Node(G item, int x) {
        data = x;
        this.item = item;
    }
}
