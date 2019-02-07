package fr.formation.itschool.domain.services;

import java.util.List;

import fr.formation.itschool.domain.dtos.AddressDto;
import fr.formation.itschool.domain.dtos.CreateAddressDto;

public interface AddressService {

    public void createAddressDto(CreateAddressDto address);

    public AddressDto get(Long id);

    public List<AddressDto> findAll();
}
