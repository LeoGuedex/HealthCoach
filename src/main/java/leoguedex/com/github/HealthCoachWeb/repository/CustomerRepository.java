package leoguedex.com.github.HealthCoachWeb.repository;

import leoguedex.com.github.HealthCoachWeb.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
