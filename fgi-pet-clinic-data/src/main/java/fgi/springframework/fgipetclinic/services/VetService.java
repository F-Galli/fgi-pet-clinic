package fgi.springframework.fgipetclinic.services;

import java.util.Set;

import fgi.springframework.fgipetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
