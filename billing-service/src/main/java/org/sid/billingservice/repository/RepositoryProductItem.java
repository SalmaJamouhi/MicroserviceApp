package org.sid.billingservice.repository;

import org.sid.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface RepositoryProductItem extends JpaRepository<ProductItem, Long> {
    //permet de consulter la list des productItems
    Collection<ProductItem> findByBillId(Long id);

}
