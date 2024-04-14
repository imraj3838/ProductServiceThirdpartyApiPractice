package com.thirdPartyApi.Service;

import com.thirdPartyApi.models.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class fakeStoreProductService implements productService {


    @Override
    public Product getSingleProduct(){
        System.out.println("I am coming from product Service");
        return null;
    }
}
