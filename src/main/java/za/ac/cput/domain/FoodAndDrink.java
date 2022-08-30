/*
 *Project 3
 *Movie Ticket System
 *Tasneem Jacobs (215030389)
 * Food And Drink
 * Entity
 */
package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Entity
public class FoodAndDrink  implements Serializable{
      @NotNull@Id private int comboNO;
        private String comboSize;
        private int comboPrice;
        private int comboAvailability;
        private int totalPrice;
public FoodAndDrink(){}

        public FoodAndDrink(int comboNO, String comboSize, int comboPrice, int comboAvailability , int totalPrice){
            this.comboNO =comboNO;
            this.comboSize= comboSize;
            this.comboAvailability = comboAvailability;
            this.totalPrice = totalPrice;
        }

        public int getComboNO() {
            return comboNO;
        }

        public String getComboSize() {
            return comboSize;
        }

        public int getComboPrice() {
            return comboPrice;
        }

        public int getComboAvailability() {
            return comboAvailability;
        }

        public int getTotalPrice() {
            return totalPrice;
        }

        public void setComboNO(int comboNO) {
            this.comboNO = comboNO;
        }

        public void setComboSize(String comboSize) {
            this.comboSize = comboSize;
        }

        public void setComboPrice(int comboPrice) {
            this.comboPrice = comboPrice;
        }

        public void setComboAvailability(int comboAvailability) {
            this.comboAvailability = comboAvailability;
        }

        public void setTotalPrice(int totalPrice) {
            this.totalPrice = totalPrice;
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
    }


