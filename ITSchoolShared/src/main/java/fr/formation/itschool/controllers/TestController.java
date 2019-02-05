package fr.formation.itschool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.itschool.domain.entities.Address;
import fr.formation.itschool.domain.services.TestService;

@RestController
@RequestMapping("/test")
@SuppressWarnings("javadoc")
public class TestController {

    @Autowired
    private TestService service;

    /**
     * @param address
     */
    @PostMapping("/createAddress")
    public void createAddress(@RequestBody Address address) {
	service.save(address);
    }

    @DeleteMapping("/deleteAddress/{id}")
    public void deleteAddress(@PathVariable("id") Long id) {
	service.deleteAdress(id);
    }

    @GetMapping("/getAddress/{id}")
    public Address getAddress(@PathVariable("id") Long id) {
	Address address = service.find(id);
	return address;
    }

    @GetMapping("/alladresses")
    public List<Address> allAddresses() {
	return service.allAdresses();
    }

    @GetMapping("/zipcode/{zipCode}")
    public List<Address> allAddressesByZipCode(
	    @PathVariable("zipCode") String zipCode) {
	return service.allAddressesByZipCode(zipCode);
    }

    @GetMapping("/city/{city}")
    public List<Address> allAdressesByCity(@PathVariable("city") String city) {
	return service.allAddressesByCity(city);
    }

    @GetMapping("/criteria/{zipCode}/{city}")
    public List<Address> getAddressesByCriteria(
	    @PathVariable("zipCode") String zipCode,
	    @PathVariable("city") String city) {
	return service.getAddressesByCriteria(zipCode, city);
    }
}
