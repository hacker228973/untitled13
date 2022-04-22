public class TradeSector extends TaxRoot {
    public TradeSector(int square, int taxPercent) {
        super(square, taxPercent);
    }

    public static float getTaxPercentOfFullSquare(float taxPercent, float square, int balance) {
        if (balance * taxPercent * square / 100 < 100) {
            return 0;
        }
        return taxPercent * square / 100;
    }
}
