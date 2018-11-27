package ru.morozov.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.morozov.entity.Ad;
import ru.morozov.entity.Category;
import ru.morozov.entity.Company;
import ru.morozov.repo.AdRepository;
import ru.morozov.repo.CompanyRepository;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService
public class BillboardService {

    @Autowired
    private AdRepository adRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public void addAd(Ad ad) {
        adRepository.saveAndFlush(ad);
    }

    public void deleteAdByID(String id) {adRepository.delete(id);}

    public Ad getAdByID(String id) {
        return adRepository.findOne(id);
    }

    public void updateAd(Ad ad) {
        adRepository.updateAd(ad.getId(), ad.getName(), ad.getCategory(), ad.getContent(), ad.getPhoneNumber());
        adRepository.flush();
    }

    public List<Ad> getListAd() {
        return adRepository.findAll();
    }

    public List<Ad> getListAdByCategory(Category category) {
        return adRepository.findByCategory(category);
    }

    public Company getCompanyByAd(Ad ad){
        return companyRepository.findOne(ad.getId());
    }

}
