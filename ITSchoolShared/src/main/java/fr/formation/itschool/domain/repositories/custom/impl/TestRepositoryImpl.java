package fr.formation.itschool.domain.repositories.custom.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.itschool.domain.entities.Address;
import fr.formation.itschool.domain.repositories.custom.TestRepository;

@Repository
public class TestRepositoryImpl implements TestRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void save(Address address) {
	em.persist(address);
    }

    @Override
    public Address find(Long id) {
	Address address = em.find(Address.class, id);
	return address;
    }

    @Transactional
    @Override
    public void deleteAddress(Long id) {
	String jpql = "delete Address where address = :id";
	Query query = em.createQuery(jpql);
	query.setParameter("id", id);
	query.executeUpdate();
	em.close();
    }

    @Override
    public List<Address> allAdresses() {
	String jpql = "select a from Address a";
	Query query = em.createQuery(jpql);
	return query.getResultList();
    }
}
