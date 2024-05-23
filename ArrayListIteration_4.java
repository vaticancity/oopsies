import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIteration_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Using Iterator
        System.out.print("Iterator Loop: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Using advanced for-loop
        System.out.print("Advanced For Loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Using regular for-loop
        System.out.print("For Loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
