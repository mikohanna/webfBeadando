package com.example.petshop.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/")
    public String displayListOfAnimals(Model model) {

        model.addAttribute("listOfAnimals", animalService.getAllAnimals());

        return "index";
    }

    @GetMapping("/addNewAnimal")
    public String addNewAnimal(Model model) {
        model.addAttribute("animal", new Animal());
        return "newanimal";
    }

    @PostMapping("/saveAnimal")
    public String saveAnimal(@ModelAttribute("animal") Animal animal) {
        animalService.saveAnimal(animal);
        return "redirect:/";
    }

    @GetMapping("/updateAnimal/{id}")
    public String updateAnimal(@PathVariable(value = "id") long id, Model model) {
        Animal animal = animalService.getAnimalById(id);
        model.addAttribute("animal", animal);
        return "updateanimal";
    }

    @GetMapping("/deleteAnimal/{id}")
    public String deleteAnimal(@PathVariable(value = "id") long id) {
        this.animalService.deleteAnimalById(id);
        return "redirect:/";

    }


}
