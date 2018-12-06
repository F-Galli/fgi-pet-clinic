package fgi.springframework.fgipetclinic.services;

import java.util.Set;

import fgi.springframework.fgipetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
