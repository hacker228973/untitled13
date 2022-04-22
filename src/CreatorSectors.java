import java.util.Scanner;

public class CreatorSectors {
    static void createSector() {
        System.out.println("Выберите тип недвижимости");
        System.out.println("1 - Жилая недвижимость");
        System.out.println("2 - Торговая недвижимость");
        System.out.println("3 - Производственная недвижимость");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Пожалуйста введите площадь недвижимости");
            int square = scanner.nextInt();
            System.out.println("Пожалуйста введите процент налога за 1 кв метр");
            int taxPercent = scanner.nextInt();
            TaxRoot sectorOne = new LivingSector(square, taxPercent);
            int balance = TaxRoot.inputBalance();
            float taxFromLivingSectorPercent = LivingSector.getTaxPercentOfFullSquare(sectorOne.taxPercent, sectorOne.square);
            float floatFinishCost = (balance * taxFromLivingSectorPercent / 100 + balance);
            int intFinishCost = (int) (floatFinishCost);
            if (floatFinishCost - intFinishCost > 0 && (int) ((floatFinishCost - intFinishCost) * 100) != 0) {
                System.out.println(intFinishCost + " Долларов и " + (int) ((floatFinishCost - intFinishCost) * 100) + " центов вам нужно вам заплатить за эту недвижимость включая налоги");
            } else {
                System.out.println(intFinishCost + " Долларов вам нужно вам заплатить за эту недвижимость включая налоги");
            }
        }
        if (choice == 2) {
            System.out.println("Пожалуйста введите площадь недвижимости");
            int square = scanner.nextInt();
            System.out.println("Пожалуйста введите процент налога за 1 кв метр");
            int taxPercent = scanner.nextInt();
            TaxRoot sectorOne = new TradeSector(square, taxPercent);
            int balance = TaxRoot.inputBalance();
            float taxFromTradeSectorPercent = TradeSector.getTaxPercentOfFullSquare(sectorOne.taxPercent, sectorOne.square, balance);
            float floatFinishCost = (balance * taxFromTradeSectorPercent / 100 + balance);
            int intFinishCost = (int) (floatFinishCost);
            if (floatFinishCost - intFinishCost > 0 && (int) ((floatFinishCost - intFinishCost) * 100) != 0) {
                System.out.println(intFinishCost + " Долларов и " + (int) ((floatFinishCost - intFinishCost) * 100) + " центов вам нужно вам заплатить за эту недвижимость включая налоги");
            } else {
                System.out.println(intFinishCost + " Долларов вам нужно вам заплатить за эту недвижимость включая налоги");
            }
        }
        if (choice == 3) {
            System.out.println("Пожалуйста введите площадь недвижимости");
            int square = scanner.nextInt();
            System.out.println("Пожалуйста введите процент налога за 1 кв метр");
            int taxPercent = scanner.nextInt();
            TaxRoot sectorOne = new ProductiveSector(square, taxPercent);
            int balance = TaxRoot.inputBalance();
            float taxFromProductiveSectorPercent = ProductiveSector.getTaxPercentOfFullSquare(sectorOne.taxPercent, sectorOne.square);
            float floatFinishCost = (balance * taxFromProductiveSectorPercent / 100 + balance);
            int intFinishCost = (int) (floatFinishCost);
            if (floatFinishCost - intFinishCost > 0 && (int) ((floatFinishCost - intFinishCost) * 100) != 0) {
                System.out.println(intFinishCost + " Долларов и " + (int) ((floatFinishCost - intFinishCost) * 100) + " центов вам нужно вам заплатить за эту недвижимость включая налоги");
            } else {
                System.out.println(intFinishCost + " Долларов вам нужно вам заплатить за эту недвижимость включая налоги");
            }
        }
    }
}
