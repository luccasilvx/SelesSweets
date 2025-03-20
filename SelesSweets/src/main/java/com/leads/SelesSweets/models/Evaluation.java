package com.leads.SelesSweets.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "evaluation")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @Size(min = 1,max = 100)
    private int age;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String purchased_products;

    @Size(min = 1,max = 5)
    private int flavor_quality;

    @Size(min = 1,max = 5)
    private int product_variety;

    @Size(min = 1,max = 5)
    private int service_quality;

    @Size(min = 1,max = 5)
    private int delivery_rating;

    @Size(min = 1,max = 5)
    private String favorite_aspect;

    @Size(min = 1,max = 5)
    private String improvement_suggestion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPurchased_products() {
        return purchased_products;
    }

    public void setPurchased_products(String purchased_products) {
        this.purchased_products = purchased_products;
    }

    public int getFlavor_quality() {
        return flavor_quality;
    }

    public void setFlavor_quality(int flavor_quality) {
        this.flavor_quality = flavor_quality;
    }

    public int getProduct_variety() {
        return product_variety;
    }

    public void setProduct_variety(int product_variety) {
        this.product_variety = product_variety;
    }

    public int getService_quality() {
        return service_quality;
    }

    public void setService_quality(int service_quality) {
        this.service_quality = service_quality;
    }

    public int getDelivery_rating() {
        return delivery_rating;
    }

    public void setDelivery_rating(int delivery_rating) {
        this.delivery_rating = delivery_rating;
    }

    public String getFavorite_aspect() {
        return favorite_aspect;
    }

    public void setFavorite_aspect(String favorite_aspect) {
        this.favorite_aspect = favorite_aspect;
    }

    public String getImprovement_suggestion() {
        return improvement_suggestion;
    }

    public void setImprovement_suggestion(String improvement_suggestion) {
        this.improvement_suggestion = improvement_suggestion;
    }

}
