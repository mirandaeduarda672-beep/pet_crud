package com.helpPet.pet.controllers;

import com.helpPet.pet.Entity.Animal;
import com.helpPet.pet.repository.AnimalRepository;
import com.helpPet.pet.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.hibernate.Hibernate.map;
@RestController
@RequestMapping("/api/animais")
//Pega do service
public class AnimalController {

    private final AnimalService animalService;
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> mostrarAnimais(){
        return animalService.mostrarAnimais();
    }
    @PostMapping
    public void CadastrarAnimal(@RequestBody Animal animal){
        animalService.cadastrarAnimal(animal);
    }
}
