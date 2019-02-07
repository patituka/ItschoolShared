package fr.formation.itschool.services;

import fr.formation.itschool.domain.dtos.CreateContactDto;

public interface ContactService {

    public void create(CreateContactDto createContactDto);
}
