package ru.morozov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.morozov.entity.Ad;
import ru.morozov.entity.Category;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

	@Query("select a from Category a where a.name = :name")
	List<Ad> findCategoryByName(@Param("name") String name);

}
