package org.itstep.liannoi.spot.storage.products.models;

import java.util.List;

public class ProductsListViewModel {
    private List<ProductModel> products;

    public ProductsListViewModel(List<ProductModel> products) {
        this.products = products;
    }
}