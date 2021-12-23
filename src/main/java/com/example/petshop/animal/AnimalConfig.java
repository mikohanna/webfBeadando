package com.example.petshop.animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AnimalConfig {

    @Bean
    CommandLineRunner commandLineRunner(AnimalRepository animalRepository) {
        return args -> {
            Animal turtle = new Animal("vörösfülű ékszerteknős", "Trachemys scripta elegans", "red-eared slider turtle", 5200, 4);
            Animal hamster = new Animal("dzsungáriai törpehörcsög", "Phodopus sungorus","djungarian hamster", 1290, 7);
            Animal guineaPig = new Animal("tengerimalac", "Cavia porcellus","guinea pig", 1290, 7);
            Animal python = new Animal("kockás piton", "Malayopython reticulatus", "reticulated python", 150000, 1);
            Animal parrot = new Animal("hullámos papagáj", "Melopsittacus undulatus", "budgerigar", 2490, 15);
            Animal canary = new Animal("kanári", "Serinus canaria forma domestica", "domestic canary", 3490, 22);
            Animal chinchilla = new Animal("csincsilla", "Chinchilla lanigera", "chinchilla", 4200, 5);
            Animal neonFish = new Animal("neonhal", "Paracheirodon innesi", "neon tetra fish", 490, 55);
            Animal guppy = new Animal("szivárványos guppi", "Poecilia reticulata", "guppy", 490, 72);
            Animal siameseFighter = new Animal("sziámi harcoshal", "Betta splendens", "siamese fighting fish", 1990, 72);

            animalRepository.saveAll(List.of(turtle, hamster, python, parrot, chinchilla, neonFish, guppy, siameseFighter, canary, guineaPig));
        };
    }
}
