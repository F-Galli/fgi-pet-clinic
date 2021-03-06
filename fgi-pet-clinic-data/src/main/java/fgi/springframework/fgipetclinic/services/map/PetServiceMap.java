package fgi.springframework.fgipetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fgi.springframework.fgipetclinic.model.Pet;
import fgi.springframework.fgipetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	public Set<Pet> findAll() {
		return super.findAll();
	}

	public Pet findById(Long id) {
		return super.findById(id);
	}

	public void delete(Pet object) {
		super.delete(object);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

}
