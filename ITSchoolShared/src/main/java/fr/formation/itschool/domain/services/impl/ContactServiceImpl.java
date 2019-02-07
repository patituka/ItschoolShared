package fr.formation.itschool.domain.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.itschool.domain.dtos.CreateContactDto;
import fr.formation.itschool.domain.entities.ContactInfo;
import fr.formation.itschool.domain.repositories.jpa.AddressJpaRepository;
import fr.formation.itschool.domain.repositories.jpa.ContactJpaRepository;
import fr.formation.itschool.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ContactJpaRepository contactJpaRepository;

    @Autowired
    AddressJpaRepository addressJpaRepository;

    @Override
    public void create(CreateContactDto createContactDto) {
	ContactInfo contactInfo = mapper.map(createContactDto,
		ContactInfo.class);
	contactJpaRepository.save(contactInfo);
    }
}
