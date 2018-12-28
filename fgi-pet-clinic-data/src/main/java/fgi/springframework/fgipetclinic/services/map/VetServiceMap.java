package fgi.springframework.fgipetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fgi.springframework.fgipetclinic.model.Vet;
import fgi.springframework.fgipetclinic.services.CrudService;
import fgi.springframework.fgipetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	public Set<Vet> findAll() {
		return super.findAll();
	}

	public Vet findById(Long id) {
		return super.findById(id);
	}

	public void delete(Vet object) {
		super.delete(object);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

}
