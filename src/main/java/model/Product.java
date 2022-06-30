package model;

import lombok.*;

@Data
@AllArgsConstructor
public class Product {
    int id;
    String name;
    Integer price;
}