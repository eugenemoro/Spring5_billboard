package ru.morozov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.morozov.entity.Ad;
import ru.morozov.entity.Category;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, String> {

    @Query("select a from Ad a where a.name = :name")
    List<Ad> findAdByName(@Param("name") String name);

    @Query("select a from Ad a where a.category = :category")
    List<Ad> findByCategory(@Param("category") Category category);

    @Query("update Ad a set " +
            "a.name =:name, " +
            "a.category = :category, " +
            "a.content = :content, " +
            "a.phoneNumber = :phoneNumber " +
            "where a.id =:id")
    void updateAd(@Param("id") String id,
                  @Param("name") String name,
                  @Param("category") Category category,
                  @Param("content") String content,
                  @Param("phoneNumber") String phoneNumber);
}
