package com.example.petshop.animal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String animalSpeciesHUN;

    private String animalSpeciesLAT;
    private String animalSpeciesENG;
    private Integer priceOne;
    private Integer numberOfAnimals;

    public Animal(String animalSpeciesHUN, String animalSpeciesLAT, String animalSpeciesENG, Integer priceOne, Integer numberOfAnimals) {
        this.animalSpeciesHUN = animalSpeciesHUN;
        this.animalSpeciesLAT = animalSpeciesLAT;
        this.animalSpeciesENG = animalSpeciesENG;
        this.priceOne = priceOne;
        this.numberOfAnimals = numberOfAnimals;
    }

    public Animal() {
        this.numberOfAnimals = 10;
        this.priceOne = 1000;
    }

}
