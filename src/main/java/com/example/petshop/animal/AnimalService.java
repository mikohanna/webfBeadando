package com.example.petshop.animal;

import java.util.List;


public interface AnimalService {
    List<Animal> getAllAnimals();

    void saveAnimal(Animal animal);
    Animal getAnimalById(long id);
    void deleteAnimalById(long id);
}
