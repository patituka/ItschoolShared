package fr.formation.itschool.domain.repositories.custom;

import java.util.List;

import fr.formation.itschool.domain.entities.Address;

public interface TestRepository {

    public void save(Address address);

    public Address find(Long id);

    public void deleteAddress(Long id);

    public List<Address> allAdresses();
}
