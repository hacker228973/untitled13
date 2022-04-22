import java.util.Scanner;

public class TaxRoot {


    static int inputBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рассчитанную суму денег, за которую вы готовы купить участок");
        return scanner.nextInt();
    }

    int square;
    int taxPercent;

    public TaxRoot(int square, int taxPercent) {
        this.square = square;
        this.taxPercent = taxPercent;
    }
}
