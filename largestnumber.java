import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    System.out.println("Enter the three numbers");
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    if(a > b && a > c)
    {
      System.out.println("a is an largest number");
    }
    else if(b > a && b > c)
    {
      System.out.println("b is an largest number");
    }
    else if(c > a && c > b)
    {
      System.out.println("c is an largest number");
    }
    else
    {
      System.out.println("The number is not largest");
    }
  }
}