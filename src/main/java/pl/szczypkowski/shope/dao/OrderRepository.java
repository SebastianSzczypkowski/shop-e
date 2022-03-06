package pl.szczypkowski.shope.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.szczypkowski.shope.entity.Order;

@RepositoryRestResource
public interface OrderRepository  extends JpaRepository<Order,Long> {


}
