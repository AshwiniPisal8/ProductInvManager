package com.igc.productinvmanager.service;

import com.igc.productinvmanager.entity.ProductEntity;
import com.igc.productinvmanager.model.ProductModel;

import java.util.List;

public interface IProductService {

    public ProductModel addProduct(ProductModel productModel);

    public List<ProductEntity> getAllProducts();

    public String updateProduct(Integer id,ProductModel productModel);

    public String deleteProduct(Integer id);

    public ProductModel getProductById(Integer id);
}
