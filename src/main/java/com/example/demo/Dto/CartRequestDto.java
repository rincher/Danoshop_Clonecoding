package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CartRequestDto {
    private Long id;
    private String image_url;
    private String product_name;
    private String price;
    private String username;
}
