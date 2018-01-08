package nl.androidappfactory.recipe.commands;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nl.androidappfactory.recipe.models.Difficulty;

/**
 * Created by jt on 6/21/17.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class RecipeCommand {
	private String id;

	@NotBlank
	@Size(min = 3, max = 255)
	private String description;

	@Min(1)
	@Max(999)
	private Integer prepTime;

	@Min(1)
	@Max(999)
	private Integer cookTime;

	@Min(1)
	@Max(50)
	private Integer servings;

	private String source;

	@URL
	private String url;

	@NotBlank
	private String directions;
	private List<IngredientCommand> ingredients = new ArrayList<>();
	private Difficulty difficulty;
	private NotesCommand notes;
	private List<CategoryCommand> categories = new ArrayList<>();
	private String[] selectedCategories;
	private Byte[] image;

	private List<CategoryCommand> categoryList = new ArrayList<>();
	private List<String> currentCategoryIds = new ArrayList<>();

	public void addCategory(CategoryCommand categoryCommand) {
		categories.add(categoryCommand);
	}
}
