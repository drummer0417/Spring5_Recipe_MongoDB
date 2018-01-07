package nl.androidappfactory.recipe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import nl.androidappfactory.recipe.models.Category;
import nl.androidappfactory.recipe.repositories.CategoryRepository;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategories() {

		log.debug("in getAllCategories: ");

		List<Category> categories = new ArrayList<>();

		categoryRepository.findAll().forEach(category -> categories.add(category));

		return categories;
	}

}