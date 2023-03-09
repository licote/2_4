import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Kalkulator");
    while (true) {
      System.out.println("1. Suma 2. Róznica 3: Iloczyn 4: Iloraz");
      int wybor = s.nextInt();
      System.out.println("Podaj liczbe a:");
      float a = s.nextFloat();
      System.out.println("Podaj liczbe b:");
      float b = s.nextFloat();
      switch (wybor) {
        case 1:
          System.out.println(a + b);
          break;
        case 2:
          System.out.println(a - b);
          break;
        case 3:
          System.out.println(a * b);
          break;
        case 4:
          if (b == 0) {
            System.out.println("Dzielenie przez 0");
            break;
          }
          System.out.println(a / b);
          break;
        default:
          System.out.println("Nieprawidłowy wybor");
          break;
      }
    }
  }
}