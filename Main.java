import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();
        System.out.print("Enter first list size: ");
        int size1 = scan.nextInt();

       for(int i =0; i<size1; i++){
           System.out.print("Enter element: ");
           firstArrayList.add(Integer.parseInt(scan.next()));
       }
        System.out.print("Enter second list size: ");
        int size2 = scan.nextInt();

        for(int i =0; i<size2; i++){
            System.out.print("Enter element: ");
            secondArrayList.add(Integer.parseInt(scan.next()));
        }
        Intersect intersect = new Intersect(firstArrayList, secondArrayList);
        System.out.println("Common elements: "+intersect.findCommon());
        System.out.println("Uncommon elements: "+intersect.findUncommon());
	}
}