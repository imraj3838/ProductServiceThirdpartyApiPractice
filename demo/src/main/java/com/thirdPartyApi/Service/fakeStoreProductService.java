package com.thirdPartyApi.Service;

import com.thirdPartyApi.dtos.fakeStoreProductDto;
import com.thirdPartyApi.models.Product;
import com.thirdPartyApi.models.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public abstract class fakeStoreProductService implements productService {

    private RestTemplate restTemplate;

    private product convertFakeStoreProductToProduct(fakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setId(fakeStoreProductDto.getId());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        product.setCategory(new category());
        product.getCategory().setName(fakeStoreProductDto.getCategory())
    }
    @Autowired
    public fakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }



    @Override
    public Product getSingleProduct(Long id){
         fakeStoreProductDto productDto = restTemplate.getForObject(
                url: "https://fakestoreapi.com/products/1" + id;
               fakeStoreProductDto.class

        )
    }
}
