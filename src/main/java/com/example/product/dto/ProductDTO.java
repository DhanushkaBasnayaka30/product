package com.example.product.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private int id;              // Updated order to match the 'Product' entity
    private int productId;       // Updated order to match the 'Product' entity
    private String productName;  // Updated order to match the 'Product' entity
    private String description;  // Updated order to match the 'Product' entity
    private int forSale;         // Updated order to match the 'Product' entity
}