package com.helpPet.pet.service;

import com.helpPet.pet.Entity.Animal;
import com.helpPet.pet.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Pega do repository
@Service
public class AnimalService {
    private final AnimalRepository animalRepository;
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }
    public List<Animal> mostrarAnimais(){
        List<Animal> animais = new ArrayList<>();
        return animais = animalRepository.findAll();
    }

    public void cadastrarAnimal(Animal animal){

        Animal animali =  new Animal();
        animali.setNome(animal.getNome());
        animali.setEspecie(animal.getEspecie());
        animali.setRaca(animal.getRaca());
        animali.setSexo(animal.getSexo());
        animali.setDataNascimento(animal.getDataNascimento());
        animali.setPeso(animal.getPeso());
        animali.setCor(animal.getCor());
        animali.setCastrado(animal.isCastrado());
        animali.setVacinacao(animal.getVacinacao());
        animali.setObservacoes(animal.getObservacoes());

        animalRepository.save(animal);
    }

}
