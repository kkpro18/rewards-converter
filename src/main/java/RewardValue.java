public class RewardValue {
    public double cashValue;
    public double rewardsValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public double getCashValue(){
        double cash = rewardsValue * 0.0035;
        return cash;
    }

    public double getMilesValue(){
        double miles =  cashValue / 0.0035;
        return miles;
    }


    }
