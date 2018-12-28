package fgi.springframework.fgipetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fgi.springframework.fgipetclinic.model.Owner;
import fgi.springframework.fgipetclinic.services.OwnerService;

@Service
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
		return super.save(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
