/*
 *Project 3
 *Movie Ticket System
 *Tasneem Jacobs (215030389)
 * Food And Drink
 * Entity
 *//*

package za.ac.cput.domain;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class FoodAndDrink implements Serializable {
    public int length;
    @NotNull
    @Id
    private String comboNO;
    private String comboSize;
    private String comboPrice;
    private String comboAvailability;
    private String totalPrice;

    public FoodAndDrink() {
    }

    private FoodAndDrink(Builder builder) {
        this.comboNO = builder.comboNO;
        this.comboSize = builder.comboSize;
        this.comboAvailability = builder.comboAvailability;
        this.totalPrice = builder.totalPrice;
        this.comboPrice =builder.comboPrice;
    }

    public void setComboNO(String  comboNO) {
        this.comboNO = comboNO;
    }

    public void setComboSize(String comboSize) {
        this.comboSize = comboSize;
    }

    public void setComboPrice(String  comboPrice) {
        this.comboPrice = comboPrice;
    }

    public void setComboAvailability(String  comboAvailability) {
        this.comboAvailability = comboAvailability;
    }

    public void setTotalPrice(String  totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String  getComboNO() {
        return comboNO;
    }

    public String  getComboPrice() {
        return comboPrice;
    }

    public String  getComboAvailability() {
        return comboAvailability;
    }

    public String  getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "FoodAndDrink{" +
                "comboNO=" + comboNO +
                ", comboSize='" + comboSize + '\'' +
                ", comboPrice=" + comboPrice +
                ", comboAvailability=" + comboAvailability +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public void set(String  comboNO, String comboSize, String  comboPrice, String  comboAvailability,String  totalPrice) {
        this.comboNO = comboNO;
        this.comboPrice = comboPrice;
        this.comboSize = comboSize;
        this.comboAvailability = comboAvailability;
        this.totalPrice = totalPrice;

    }

    public static class Builder {

        private String  comboNO;
        private String comboSize;
        private String  comboPrice;
        private String  comboAvailability;
        private String  totalPrice;

        public Builder setComboNO(String  comboNO) {
            this.comboNO = comboNO;
            return  this;
        }

        public Builder setComboSize(String comboSize) {
            this.comboSize = comboSize;
            return  this;
        }

        public Builder setComboPrice(String  comboPrice) {
            this.comboPrice = comboPrice;
            return  this;
        }

        public Builder setComboAvailability(String  comboAvailability) {
            this.comboAvailability = comboAvailability;
            return  this;
        }

        public Builder setTotalPrice(String  totalPrice) {
            this.totalPrice = totalPrice;
            return  this;
        }

        public Builder copy(FoodAndDrink foodAndDrink) {
            this.comboNO = foodAndDrink.comboNO;
            this.comboPrice = foodAndDrink.comboPrice;
            this.comboSize = foodAndDrink.comboSize;
            this.comboAvailability = foodAndDrink.comboAvailability;
            this.totalPrice = foodAndDrink.totalPrice;
            return this;
        }

        public FoodAndDrink build() {
            return new FoodAndDrink(this);
        }
    }
}



*/
