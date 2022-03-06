package pl.szczypkowski.shope.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szczypkowski.shope.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

;}
