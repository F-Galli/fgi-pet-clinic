package fgi.springframework.fgipetclinic.services;

import java.util.Set;

import fgi.springframework.fgipetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
