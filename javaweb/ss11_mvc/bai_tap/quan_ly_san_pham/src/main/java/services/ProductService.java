package services;

import models.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> showList() {
        return productRepository.showList();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
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
