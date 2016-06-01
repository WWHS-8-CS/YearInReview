import java.util.*;

public class ArrayListReview {
  
  public static void main(String[] args) {
  
  ArrayList<Integer> a = new ArrayList<Integer>();
  Scanner scan = new Scanner(System.in);

  for (int i = 0; i < 10; i++)
  {
    System.out.println("Enter an integer: ");
    a.add(scan.nextInt());
  }
  
  System.out.println();
  float sum = 0;

  for (int i : a)
  {
    System.out.print(i + " ");
    sum += i;
  }

  System.out.println();
  System.out.println(sum/10);
  
  }
}
