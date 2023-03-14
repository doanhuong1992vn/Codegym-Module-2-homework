package service;

import entity.*;

import java.util.*;

public class CategoryService {
    private static final ArrayList<Category> categoriesList;
    private static Category currentCategory;

    static {
        categoriesList = new ArrayList<>();
        categoriesList.add(new Category("Man Fashion"));
        categoriesList.add(new Category("Women Fashion"));
        categoriesList.add(new Category("Mobile Phone"));
        categoriesList.add(new Category("Mom & Baby"));
        categoriesList.add(new Category("Laptop"));
        categoriesList.add(new Category("Watch"));
        categoriesList.add(new Category("Man Shoes"));
        categoriesList.add(new Category("Women Shoes"));
    }

    public CategoryService() {
    }

    public static ArrayList<Category> getCategories(){
        return categoriesList;
    }

    public void addCategory(Category newCategory){
        if(categoriesList.contains(newCategory)){
            System.out.println("Add failed. " + newCategory +  " already in the catalog");
        } else {
            categoriesList.add(newCategory);
            System.out.println(newCategory + " have been successfully added to the catalog");
        }
    }

    public void removeCategory(long id){
        if(checkIdAndSetCurrentCategoryIfAvailable(id)) {
            categoriesList.remove(currentCategory);
            System.out.println(currentCategory + " have been removed from the catalog");
        } else {
            System.out.println("Remove failed. ID " + id + " not in the catalog");
        }
    }

    private boolean checkIdAndSetCurrentCategoryIfAvailable(long id) {
        for(Category category: categoriesList){
            if(category.getId() == id){
                currentCategory = category;
                return true;
            }
        }
        return false;
    }

}
