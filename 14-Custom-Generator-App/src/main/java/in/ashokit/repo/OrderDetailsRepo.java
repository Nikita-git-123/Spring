package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.OrderDetailsEntity;

public interface OrderDetailsRepo extends JpaRepository<OrderDetailsEntity, String>{

}
