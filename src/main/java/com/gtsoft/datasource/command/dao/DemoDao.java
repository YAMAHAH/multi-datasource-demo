package com.gtsoft.datasource.command.dao;

import com.gtsoft.datasource.command.model.TestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDao extends CrudRepository<TestModel, Long> {
    TestModel findByName(String name);
}
