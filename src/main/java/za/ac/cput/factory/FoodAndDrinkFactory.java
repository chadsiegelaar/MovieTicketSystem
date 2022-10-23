/*
package za.ac.cput.factory;

import za.ac.cput.domain.FoodAndDrink;
import za.ac.cput.helper.RepositoryHelper;

public class FoodAndDrinkFactory {
    public  static FoodAndDrink createFoodAndDrink(String  comboNO, String comboSize, String  comboPrice, String  comboAvailability , String  totalPrice){

        if (RepositoryHelper.isNullorEmpty(String.valueOf(comboNO))|| RepositoryHelper.isNullorEmpty(comboSize)||
                RepositoryHelper.isNullorEmpty(String.valueOf(comboPrice))|| RepositoryHelper.isNullorEmpty(String.valueOf(comboAvailability))||
                RepositoryHelper.isNullorEmpty(String.valueOf(totalPrice)))
            return null;

        return  new FoodAndDrink.Builder().setComboNO(comboNO).setComboSize(comboSize).
                setComboPrice(comboPrice).setComboAvailability(comboAvailability)
                .setTotalPrice(totalPrice).build();
    }
}

*/
