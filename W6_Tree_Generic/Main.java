package W6_Tree_Generic;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        Tree<String> x = new Tree<String>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("0 - exit");
            System.out.println("1 - add node");
            System.out.println("5 - search");
            System.out.println("7 - search min");
            System.out.println("9 - delete min");
            System.out.println("11 - preOrder");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {
                case 0:
                    return;
                case 1:
                    System.out.print("name: ");
                    String name = input.next();
                    System.out.print("data: ");
                    int newData = input.nextInt();
                    x.add(name, newData);
                    break;

                case 5:
                    System.out.print("What is the data you are looking at: ");
                    int data1 = input.nextInt();
                    if (x.search(x.root, data1) == null) {
                        System.out.println("--- böyle bir eleman yok ---");
                        break;
                    } else {
                        System.out.println("The value you are looking for is avaliable in the system.");
                    }
                    break;
                case 7:
                    x.searchMin();
                    break;
                case 9:
                    x.deleteMin();
                    break;
                case 11:
                    x.preOrder(x.root);
                    System.out.println();
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("--------------------------------------------------------------------");
        }

    }
}
