package com.app.springbootjdbconly.repository;

import com.app.springbootjdbconly.model.Customer;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.sql.ResultSet;

@Repository
public class CustomerRepository extends AutoCRUD<Customer, String> {
    @Override
    protected String getTableName() {
        return "customer";
    }

    @Override
    protected Customer mapResultSetToEntity(ResultSet resultSet) {
        try {
            return new Customer(
                    resultSet.getString("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
