package br.com.rcurvo.animalservice.controllers;

import br.com.rcurvo.animalservice.entities.Animal;
import br.com.rcurvo.animalservice.repositories.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
            return repository.findNotAdopted();
        }

    @GetMapping("/cats")
    private List<Animal> findAllCats(){
        return repository.findAllCats();
    }

    @GetMapping("/dogs")
    private List<Animal> findAllDogs(){
        return repository.findAllDogs();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }

    @GetMapping("/receptor-count")
    private List<Object[]> countRescuesByReceptor(){
        return repository.countRescuesByReceptor();
    }
}
