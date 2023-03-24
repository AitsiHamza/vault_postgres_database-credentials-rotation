package com.virat.fetchdatabasesecrets.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CATEGORIES_TB")
public class Category {
    @Id
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productList;
}
