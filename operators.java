class Main {
  public static void main(String[] args) {
    int a = 6;
    int b = 3;
    int c;
    boolean d = true;
    boolean e= false; 
    c = a+b;
    System.out.println("a+b:"+c);
    c = a-b;
    System.out.println("a-b:"+c);
    c = a*b;
    System.out.print("a*b:"+c);
    c = b/a;
    System.out.println("b/a:"+c);
    c = b%a;
    System.out.println("b%a:"+c);
    c = b++;
    System.out.println("b++:"+c);
    c = b--;
    System.out.println("b--:"+c);
    c = a&b;
    System.out.println("a&b;"+c);
    c = a|b;
    System.out.println("a|b:"+c);
    c = a^b;
    System.out.println("a^b:"+c);
    c = ~a;
    System.out.println("~a:"+c);
    c = a<<2;
    System.out.println("a<<2:"+c);
    c = a>>2;
    System.out.println("a>>2:"+c);
    c = a>>>2;
    System.out.println("a>>>2:"+c);
    System.out.println("d && e="+(d&&e));
    System.out.println("d || e="+(d||e));
    System.out.println("!(d && e)="+!(d&&e));
    }
}