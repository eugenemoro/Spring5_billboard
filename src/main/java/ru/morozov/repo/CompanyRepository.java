package ru.morozov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.morozov.entity.Ad;
import ru.morozov.entity.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

	@Query("select a from Company a where a.name = :name")
	List<Ad> findCompanyByName(@Param("name") String name);
}
