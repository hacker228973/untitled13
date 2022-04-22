import java.util.Scanner;

public class LivingSector extends TaxRoot {
    public LivingSector(int square, int taxPercent) {
        super(square, taxPercent);
    }

    public static float getTaxPercentOfFullSquare(int taxPercent, int square) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите процент субсидии");
        float subsidyPercent = scanner.nextInt();
        if (taxPercent < subsidyPercent) {
            System.out.println("Процент субсидии должен быть меньше чем налог, Попробуйте еще раз");
            CreatorSectors.createSector();
        }
        return (int) ((taxPercent - subsidyPercent) * square);
    }

}
