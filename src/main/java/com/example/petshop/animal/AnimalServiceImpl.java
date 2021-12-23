package com.example.petshop.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {

        return animalRepository.findAll();
    }

    @Override
    public void saveAnimal(Animal animal) {
        this.animalRepository.save(animal);
    }

    @Override
    public Animal getAnimalById(long id) {
        Optional<Animal> optional = animalRepository.findById(id);
        Animal animal = null;
        if(optional.isPresent()) {
            animal = optional.get();
        }else {
            throw new RuntimeException("No animal with this id!");
        }
        return animal;
    }

    @Override
    public void deleteAnimalById(long id) {
        this.animalRepository.deleteById(id);
    }
}
