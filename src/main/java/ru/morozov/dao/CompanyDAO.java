package ru.morozov.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.morozov.entity.Company;

import java.util.List;

@Component
@Transactional
public class CompanyDAO extends AbstractDAO {

	public List<Company> getListCompany() {
		return em.createQuery("SELECT e FROM Company e", Company.class).getResultList();
	}

	public Company merge(Company company) {
		return em.merge(company);
	}
}
