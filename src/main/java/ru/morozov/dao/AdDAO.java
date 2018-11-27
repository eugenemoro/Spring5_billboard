package ru.morozov.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.morozov.entity.Ad;
import java.util.List;

@Component
@Transactional
public class AdDAO extends AbstractDAO {

	public List<Ad> getListAd() {
		return em.createQuery("SELECT e FROM Ad e", Ad.class).getResultList();
	}

	public Ad merge(Ad ad) {
		return em.merge(ad);
	}

}
