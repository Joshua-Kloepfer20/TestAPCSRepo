public class Demo {
  public static void main(String[] args) {
    if (args.length == 0) {
      x(5);
    }
    else {
      x(Integer.parseInt(args[0]));
    }
  }
  public static void x(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - (i - 1); j++) {
        System.out.print(i);
      }
      System.out.println("");
    }
  }
}
