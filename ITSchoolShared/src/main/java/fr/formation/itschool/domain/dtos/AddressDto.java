package fr.formation.itschool.domain.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddressDto {

    @NotNull
    @Size(max = 100)
    private String road;

    @NotNull
    @Size(max = 10)
    private String zipCode;

    @NotNull
    @Size(max = 100)
    private String city;

    protected AddressDto() {
    }
}
