package services;

import models.Product;

import java.util.List;

public interface IProductService {
    List<Product> showList();
    Product addProduct(Product product);
    Product editProduct(Product product);
    Boolean deleteProduct(Product product);
    Product showProduct(Product product);
    Product findProduct(Product product);
}
