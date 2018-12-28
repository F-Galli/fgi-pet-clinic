package fgi.springframework.fgipetclinic.services.map;

import java.util.Set;

import fgi.springframework.fgipetclinic.model.Owner;
import fgi.springframework.fgipetclinic.services.CrudService;
import fgi.springframework.fgipetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	public Set<Owner> findAll() {
		return super.findAll();
	}

	public Owner findById(Long id) {
		return super.findById(id);
	}

	public void delete(Owner object) {
		super.delete(object);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
