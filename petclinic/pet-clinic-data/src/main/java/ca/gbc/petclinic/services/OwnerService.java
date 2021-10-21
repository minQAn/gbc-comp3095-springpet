package ca.gbc.petclinic.services;

import ca.gbc.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> { //primary key

    Owner findByLastname(String lastname);


}
