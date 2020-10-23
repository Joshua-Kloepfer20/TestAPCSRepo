public class Demo {
  public static void main(String[] args) {
    //int[][] arr = new int[][]{{1, 2, 3, 4}, {3, 7, 2, 3}, {6, 9, 10, 2}};
    if (args.length == 0) {
      x(5);
    }
    else {
      x(Integer.parseInt(args[0]));
    }
    //System.out.println(arrayDeepToString(create2DArray(3, 4, 10)).replace("}, " , "},\n"));
    //System.out.println(arrayDeepToString(create2DArrayRandomized(3, 4, 10)).replace("}, " , "},\n"));
  }
  public static void x(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - (i - 1); j++) {
        System.out.print(i);
      }
      System.out.println("");
    }
  }
  public static String arrToString(int[] arr){
  String sArr = "{";
  for (int i = 0; i < arr.length; i++) {
    if (i == arr.length - 1) {
      sArr = sArr + arr[i];
    }
    else {
      sArr = sArr + arr[i] + ", ";
    }
  }
  sArr = sArr + "}";
  return sArr;
}
  public static String arrayDeepToString(int [][] arr) {
    String sArr = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        sArr = sArr + arrToString(arr[i]);
      }
      else {
        sArr = sArr + arrToString(arr[i]) + ", ";
      }
    }
    sArr = sArr + "}";
    return sArr;
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new int[(int)(Math.random() * (cols + 1))];
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

}
