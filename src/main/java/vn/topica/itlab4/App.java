package vn.topica.itlab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.topica.itlab4.entity.Category;
import vn.topica.itlab4.entity.Item;
import vn.topica.itlab4.entity.Type;
import vn.topica.itlab4.service.CategoryService;
import vn.topica.itlab4.service.ItemService;
import vn.topica.itlab4.service.TypeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class to run
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
	}
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private TypeService typeService;
	
	@Override
	public void run(String... strings)
	{
		List<Type> types = new ArrayList<>();
		List<Category> categories = new ArrayList<>();
		List<Item> items = new ArrayList<>();
		
		// Find category
		String type = "Php";
		categories = categoryService.findByType(type, 0, 10);
		System.out.println("Find categories by type name: '" + type + "'");
		categories.forEach(System.out::println);
		
		// Find Item
		String category = "Category 5";
		items = itemService.findByCategory(category, 0, 10);
		System.out.println("Find items by category name: '" + category + "'");
		items.forEach(System.out::println);
		Scanner sc = new Scanner(System.in);
		System.out.print("Input id item category: ");
		int id = sc.nextInt();
		Category c = categoryService.find(id);
		if (c == null)
		{
			System.out.println("Category not found!");
		}
		else
		{
			System.out.println(c);
			boolean edited = false;
			System.out.print("Do you want change category name (Y/N): ");
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y"))
			{
				while (true)
				{
					System.out.print("Enter new category name: ");
					String s = sc.nextLine();
					if (!s.equalsIgnoreCase(""))
					{
						c.setName(s);
						edited = true;
						break;
					}
					System.out.println("Name not valid. Please enter again.");
				}
			}
			System.out.print("Do you want change category type (Y/N): ");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y"))
			{
				while (true)
				{
					System.out.print("Choose type id: ");
					try
					{
						int typeId = sc.nextInt();
						Type t = typeService.find(typeId);
						if (t != null)
						{
							c.setTypeId(id);
							edited = true;
							break;
						}
						System.out.println("Type not found for ID:" + id);
					}
					catch (NumberFormatException e)
					{
						System.out.println("Name not valid. Please enter again.");
					}
				}
			}
			if (edited)
			{
				categoryService.update(c);
			}
		}
	}
}
