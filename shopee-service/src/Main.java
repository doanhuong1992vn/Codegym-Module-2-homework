import entity.*;
import service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoryService categoriesManagement = new CategoryService();
        List<Category> categoriesList = CategoryService.getCategories();
        categoriesList.forEach(System.out::println);
        categoriesManagement.removeCategory(1);
        categoriesManagement.addCategory(new Category("Book"));
        List<Product> productsList = ProductService.getListByCategoryId(3);
        productsList.forEach(System.out::println);
        UserService userService = new UserService();
        userService.signUp();
        userService.signIn();



    }
}