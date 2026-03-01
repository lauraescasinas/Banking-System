public class InterestCalculator {
    double computeSimple(double balance, double rate){
        return balance * rate;
    }
    double computeCompound(double balance, double rate, int months){
        return balance * Math.pow((1 + rate), months) - balance;
    }
}
