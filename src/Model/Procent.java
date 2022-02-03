package Model;
import java.lang.Math;
public class Procent {
    public double countPr(double sum, int pr){
        return sum*(pr/100.);
    };
    public double countSum(double sum, int pr){
        return sum*(1+pr/100.);
    };
    public int countSumTrunc(double sum, int pr){
        return (int)Math.round(sum*(1+pr/100.));
    };
}
