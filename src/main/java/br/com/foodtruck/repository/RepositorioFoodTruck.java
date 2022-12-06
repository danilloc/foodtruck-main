package br.com.foodtruck.repository;

import br.com.foodtruck.model.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioFoodTruck extends JpaRepository<FoodTruck, Integer> {
}
