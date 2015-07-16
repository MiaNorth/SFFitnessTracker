package sf.hackday.sffitnesstracker.model;

/**
 * Created by DDKN on 7/16/2015.
 */
public class Policy {
    private double price;
    private double discount;

    //public void computeDiscount(Activity activityHistory) {
    //
    //}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
