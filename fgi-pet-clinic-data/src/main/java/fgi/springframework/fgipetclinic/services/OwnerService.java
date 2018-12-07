package fgi.springframework.fgipetclinic.services;

import fgi.springframework.fgipetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
