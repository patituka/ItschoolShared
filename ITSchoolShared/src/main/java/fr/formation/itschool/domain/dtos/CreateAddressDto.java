package fr.formation.itschool.domain.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateAddressDto implements Serializable {

    @NotBlank(message = "{E_NOT_BLANK}")
    @Size(max = 100)
    private String road;

    @NotBlank
    @Size(max = 100)
    private String zipCode;

    @NotBlank
    @Size(max = 100)
    private String city;
}
