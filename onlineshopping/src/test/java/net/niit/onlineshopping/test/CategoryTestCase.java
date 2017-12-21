package net.niit.onlineshopping.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.niit.onlineshopping.dao.CategoryDAO;
import net.niit.onlineshopping.dto.Category;

public class CategoryTestCase {
private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	 
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.niit.onlineshopping");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	/*@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("Leather");
		category.setDescription("This is some description for leather handicrafts");
		category.setImageURL("abc.jpg");
		
		assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	}*/
	
	/*@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("Glass");
		category.setDescription("This is some discription for glass handicrafts");
		category.setImageURL("xyz.jpg");
		
		assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	}*/
	
	@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("Wooden");
		category.setDescription("This is some discription for Wooden handicrafts");
		
		
		assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	}

}
	/*
	@Test
	public void testGetCategory()
	{
		category = categoryDAO.get(2);
		
		assertEquals("Successfully fetched a category from table","glass",category.getName());
	}
	
	*/
  /* @Test
   public void testDeleteCategory() {
	   
	   category = categoryDAO.get(1);
	    
	   category.setName("Paper");
	    
	   assertEquals("Something went wrong while updated a single category in table",true,categoryDAO.delete(category));
   }
	*/
	
	/* @Test
	   public void testDeleteCategory() {
		   
		 
    assertEquals("Something went wrong while fetched a list of category from table",4,categoryDAO.list().size());
	   }
	
	@Test
	  
	public  void testCRUDCategory(){
		//add operation
       category = new Category();
		
		category.setName("glass");
		category.setDescription("This is some discription for glass handicrafts");
		category.setImageURL("xyz.jpg");
		//assertEquals("Something went wrong while  new  added category inside table",true,categoryDAO.add(category));
	
	
	 category = new Category();
		
		category.setName("Paper");
		category.setDescription("This is some discription for paper handicrafts");
		category.setImageURL("efg.jpg");
		
		//assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	
	
		
		 category = new Category();
			
			category.setName("Leather");
			category.setDescription("This is some discription for leather handicrafts");
			category.setImageURL("abc.jpg");
			
			//assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	
			// fetching and updating category 
			 category = categoryDAO.get(2);
			    
			   category.setName("glass");
			    
			assertEquals("Successfully updated a single category in table",true,categoryDAO.update(category));
	
	
	       //delete the category
		  // assertEquals("Successfully delete a single category in table",true,categoryDAO.delete(category));
	
		   //fetch list
		  assertEquals("Successfully fetched a list of category from table",2,categoryDAO.list().size());
	}
	
}
*/