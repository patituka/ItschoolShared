package fr.formation.itschool.domain.services;

import java.util.List;

import fr.formation.itschool.domain.entities.Address;

public interface TestService {

    public void save(Address address);

    public Address find(Long long1);

    public void deleteAdress(Long id);

    public List<Address> allAdresses();

    public List<Address> allAddressesByZipCode(String zipCode);

    public List<Address> allAddressesByCity(String city);

    public List<Address> getAddressesByCriteria(String zipCode, String city);
}
