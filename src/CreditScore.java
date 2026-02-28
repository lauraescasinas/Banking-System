public class CreditScore {

    private int score;

    public CreditScore(int score) {
        this.score = score;
    }

    public void increaseScore(int value) {
        score += value;
    }

    public void decreaseScore(int value) {
        score -= value;
    }

    public boolean isEligibleForLoan() {
        return score >= 600;
    }

    public int getScore() {
        return score;
    }
}