package ru.morozov.editor;

import ru.morozov.entity.Company;
import ru.morozov.repo.CompanyRepository;
import java.beans.PropertyEditorSupport;

public class CompanyEditor extends PropertyEditorSupport {

	private CompanyRepository companyRepository;

	public CompanyEditor(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public void setAsText(String id) throws IllegalArgumentException {
		Company company = companyRepository.findOne(id);
		setValue(company);
	}
}
