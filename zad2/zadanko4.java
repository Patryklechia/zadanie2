import java.util.Scanner;
public class zadanko4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int raz = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int dwa = y.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int trzy = z.nextInt();
        if (raz < dwa && dwa < trzy) {
            System.out.println("kolejność rosnąca.");
        } else {
            if (trzy < dwa && dwa < raz) {
                System.out.println("kolejność malejąca.");
            }
            else {
                System.out.println("brak kolejności.");
            }
        }
    }
}