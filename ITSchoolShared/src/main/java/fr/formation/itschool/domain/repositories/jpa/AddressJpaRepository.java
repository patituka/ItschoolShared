package fr.formation.itschool.domain.repositories.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.formation.itschool.domain.entities.Address;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {

    List<Address> findByZipCode(String zipCode);

    List<Address> findByCityIgnoreCase(String city);

    @Query("select a from Address a where a.city = :city and a.zipCode = :zipCode")
    List<Address> getAddressesByCriteria(@Param("zipCode") String zipCode,
	    @Param("city") String city);
}
