package repository;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1,"Huy",200,"Hà Nội","Samsung"));
        productList.add(new Product(2,"Huy",300,"Hà Nội,sda","Apple"));
        productList.add(new Product(3,"Huy",400,"Hà Nội","Vivo"));
        productList.add(new Product(4,"Huy",500,"Hà Nội","Asus"));
    }

    @Override
    public List<Product> showList() {
        return productList;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product editProduct(Product product) {
        return null;
    }

    @Override
    public Boolean deleteProduct(Product product) {
        return null;
    }

    @Override
    public Product showProduct(Product product) {
        return null;
    }

    @Override
    public Product findProduct(Product product) {
        return null;
    }
}
