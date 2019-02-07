package fr.formation.itschool.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.itschool.domain.dtos.AddressDto;
import fr.formation.itschool.domain.dtos.CreateAddressDto;
import fr.formation.itschool.domain.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public void createAddressDto(
	    @Valid @RequestBody CreateAddressDto createAddressDto) {
	addressService.createAddressDto(createAddressDto);
    }

    @GetMapping("/{id}")
    public AddressDto get(@PathVariable Long id) {
	return addressService.get(id);
    }

    @GetMapping("/all")
    public List<AddressDto> findAll() {
	return addressService.findAll();
    }
}
