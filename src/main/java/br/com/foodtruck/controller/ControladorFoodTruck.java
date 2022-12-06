package br.com.foodtruck.controller;

import br.com.foodtruck.model.FoodTruck;
import br.com.foodtruck.repository.RepositorioFoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ControladorFoodTruck {

    @Autowired
    private RepositorioFoodTruck repositorioFoodTruck;

    @GetMapping
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView("views/tela.html");
        List<FoodTruck> foodTrucks = new ArrayList<>();
        foodTrucks.add(new FoodTruck(1, "kkooss", 9888888, "laou", "palmas"));
        modelAndView.addObject("foodTrucks", foodTrucks);
        return modelAndView;
    }

    @PostMapping("/cadastrar")
    public ModelAndView cadastrar(FoodTruck foodTruck){
        repositorioFoodTruck.save(foodTruck);

        return new ModelAndView("redirect:/");
    }
//
//    @GetMapping("/{id}/editar")
//    public ModelAndView editar(@PathVariable Integer id){
//        FoodTruck foodTruck = repositorioFoodTruck.getReferenceById(id);
//
//        ModelAndView modelAndView = new ModelAndView("foodtruck/tela.html");
//        modelAndView.addObject("foodTrucks", foodTruck);
//
//        return modelAndView;
//    }
//
//    @GetMapping("/{id}/editar")
//    public ModelAndView editar(FoodTruck foodTruck){
//        repositorioFoodTruck.save(foodTruck);
//
//        return new ModelAndView("redirect:/");
//    }
//
//    @GetMapping("/{id}/excluir")
//    public ModelAndView excluir(@PathVariable int id){
//        repositorioFoodTruck.deleteById(id);
//
//        return new ModelAndView("redirect:/");
//    }

}
