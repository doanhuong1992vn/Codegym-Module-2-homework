package service;

import entity.Category;
import entity.Product;

import java.util.ArrayList;

public class ProductService {
    private static final ArrayList<Product> productsList;
    private static Product currentProduct;

    static {
        productsList = new ArrayList<>();
        productsList.add(new Product("T-Shirt", 450, 1));
        productsList.add(new Product("PoloMan", 550, 1));
        productsList.add(new Product("Man's Shirt", 550, 1));

        productsList.add(new Product("Crop-top Shirt", 250, 2));
        productsList.add(new Product("Baggy", 300, 2));

        productsList.add(new Product("iPhone", 30000, 3));
        productsList.add(new Product("SamSung", 28000, 3));
        productsList.add(new Product("Oppo", 5000, 3));

        productsList.add(new Product("Bỉm", 275, 4));
        productsList.add(new Product("Sữa bột", 380, 4));
        productsList.add(new Product("Babe Suit", 250, 4));

        productsList.add(new Product("Dell", 15000, 5));
        productsList.add(new Product("Lenovo", 16000, 5));

        productsList.add(new Product("Orient", 9150, 6));
        productsList.add(new Product("Rado", 40000, 6));

        productsList.add(new Product("Sneaker", 2300, 7));
        productsList.add(new Product("Oxfords", 3500, 7));

        productsList.add(new Product("Giày cao gót", 800, 8));
        productsList.add(new Product("Giày búp bê", 500, 8));
    }

    public ProductService() {
    }
    public static ArrayList<Product> getListByCategoryId(long id){
//        System.out.println("Category " + getCategoryNameById(id) + ": ");
        ArrayList<Product> resultList = new ArrayList<>();
        for(Product product: productsList){
            if(id == product.getCategoryId()){
                resultList.add(product);
            }
        }
        return resultList;
    }

//    private static String getCategoryNameById(long id) {
//        ArrayList<Category> categoriesList = CategoryService.getCategories();
//        for(Category category: categoriesList){
//            if(category.getId() == id){
//                return category.getName();
//            }
//        }
//    }

}
