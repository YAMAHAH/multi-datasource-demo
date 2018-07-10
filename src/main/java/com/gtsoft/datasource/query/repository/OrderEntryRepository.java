package com.gtsoft.datasource.query.repository;

import com.gtsoft.datasource.query.entries.OrderEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderEntryRepository extends MongoRepository<OrderEntry, String> {
}
