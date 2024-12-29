
package com.example.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "productid") // Maps 'productId' to 'product_id' column
    private int productId;

    @Column(name = "productname") // Maps 'productName' to 'product_name' column
    private String productName;

    @Column(name = "description") // Maps 'description' to 'description' column
    private String description;

    @Column(name = "forsale") // Maps 'forSale' to 'for_sale' column
    private int forSale;
}