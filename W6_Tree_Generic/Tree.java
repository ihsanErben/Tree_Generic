package W6_Tree_Generic;

public class Tree<G> {

    Node<G> root;

    public void add(G item, int data) {
        Node<G> newNode = new Node(item, data);
        if (root == null) {
            root = newNode;
        } else {
            Node<G> tmp = root;
            Node<G> parent = root;

            while (tmp != null) {
                parent = tmp;
                if (data > tmp.data) {
                    tmp = tmp.right;
                } else if (data < tmp.data) {
                    tmp = tmp.left;
                }
            }
            if (data < parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }

    public void preOrder(Node x) {
        if (x != null) {
            System.out.println("isim: " + x.item);
            System.out.println("data: " + x.data);
            System.out.println("");
            preOrder(x.left);
            preOrder(x.right);
        }
    }

    public void searchMin() {
        Node<G> x = root;
        while (x.left != null) {
            x = x.left;
        }
        System.out.println("min: " + x.data);
    }

    public Node search(Node root, int x) {
        if (root == null) {
            System.out.println("--------------");
            return null;
        } else if (x < root.data) {
            return search(root.left, x);
        } else if (x > root.data) {
            return search(root.right, x);
        } else if (x == root.data) {
            System.out.println("++++++++++++++");
            return root;
        }
        return null;
    }

    public void deleteMin() {
        Node tmp = root;
        Node parent = root;
        while (tmp.left != null) {
            parent = tmp;
            tmp = tmp.left;
        }
        parent.left = null;
    }

}
