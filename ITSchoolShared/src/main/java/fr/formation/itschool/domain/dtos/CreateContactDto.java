package fr.formation.itschool.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateContactDto {

    @NotNull
    @Valid
    private CreateAddressDto CreateAddressDto;

    @Size(max = 12)
    private String phone;

    @Size(max = 12)
    private String mobile;

    @NotNull
    @Email
    @Size(max = 255)
    private String email;

    protected CreateContactDto() {
	//
    }
}
