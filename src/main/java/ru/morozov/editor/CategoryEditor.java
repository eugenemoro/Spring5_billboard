package ru.morozov.editor;

import ru.morozov.entity.Category;
import ru.morozov.repo.CategoryRepository;
import java.beans.PropertyEditorSupport;

public class CategoryEditor extends PropertyEditorSupport {

	private CategoryRepository categoryRepository;

	public CategoryEditor(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public void setAsText(String id) throws IllegalArgumentException {
		Category category = categoryRepository.findOne(id);
		setValue(category);
	}
}
