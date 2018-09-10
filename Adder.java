import java.util.*;
class Adder {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Enter Fiestnumber => ");
    int a = sc.nextInt();
    
    System.out.print("Enter Secondnumber => ");
    int b = sc.nextInt();
    
    int sum = a+b ;
    System.out.print("Answer => "+sum);
   }
}