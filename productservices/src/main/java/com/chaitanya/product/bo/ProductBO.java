package com.chaitanya.product.bo;

import com.chaitanya.product.dto.Product;

public interface ProductBO {
	
	public void create (Product product);
	
	public Product findProduct(int id);

}
