public class ProductiveSector extends TaxRoot {

    public ProductiveSector(int square, int taxPercent) {
        super(square, taxPercent);
    }

    public static int getTaxPercentOfFullSquare(int taxPercent, int square) {
        return taxPercent * square;
    }

}
