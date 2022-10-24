/*
package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import za.ac.cput.domain.FoodAndDrink;
import za.ac.cput.repository.IFoodAndDrinkRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FoodAndDrinkImpl implements FoodAndDrinkService{

        private final IFoodAndDrinkRepository repository;

        @Autowired
        public FoodAndDrinkImpl(IFoodAndDrinkRepository repository){
            this.repository = repository;
        }
        @Override
        public FoodAndDrink save (FoodAndDrink foodAndDrink){
            return this.repository.save(foodAndDrink);
        }
        @Override
        public Optional<FoodAndDrink> read(String comboNO) {
            return this.repository.findById(comboNO);
        }
        @Override
        public boolean delete(FoodAndDrink foodAndDrink){
            this.repository.delete(foodAndDrink);
            return false;
        }

        @Override
        public List<FoodAndDrink> findAllcomboNO(String comboNO) {
            return this.repository.findAll();
        }

        @Override
        public void deleteBycomboNO(String comboNO) {

        }

        @Override
        public List<FoodAndDrink> findAll() {
            return null;
        }
    }


*/
