public class ReceiptCalculator {
    public static double calcSubtotal(double app, double ent, double dri, double des){
        return app+ent+dri+des;
    }
    public static double calcTax(double sub, double tax){
        return sub + (sub*tax);
    }
}