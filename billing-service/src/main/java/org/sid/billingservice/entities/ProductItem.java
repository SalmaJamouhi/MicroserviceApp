package org.sid.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.sid.billingservice.model.Customer;
import org.sid.billingservice.model.Product;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantity;
    private double price;
    private Long productID;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Bill bill;

    @Transient //pas persistant
    private Product product;
}
