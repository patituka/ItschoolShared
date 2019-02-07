package fr.formation.itschool.domain.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.itschool.domain.dtos.AddressDto;
import fr.formation.itschool.domain.dtos.CreateAddressDto;
import fr.formation.itschool.domain.entities.Address;
import fr.formation.itschool.domain.repositories.jpa.AddressJpaRepository;
import fr.formation.itschool.domain.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressJpaRepository addressJpaRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void createAddressDto(CreateAddressDto addressDto) {
	Address entity = mapper.map(addressDto, Address.class);
	addressJpaRepository.save(entity);
    }

    @Override
    public AddressDto get(Long id) {
	Address address = addressJpaRepository.findById(id).get();
	AddressDto addressDto = mapper.map(address, AddressDto.class);
	return addressDto;
    }

    @Override
    public List<AddressDto> findAll() {
	List<Address> addresses = addressJpaRepository.findAll();
	List<AddressDto> addressDtos = new ArrayList<>();
	for (Address address : addresses) {
	    AddressDto addressDto = mapper.map(address, AddressDto.class);
	    addressDtos.add(addressDto);
	}
	return Collections.unmodifiableList(addressDtos);
    }
}
