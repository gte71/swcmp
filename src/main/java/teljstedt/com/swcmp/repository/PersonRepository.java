package teljstedt.com.swcmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teljstedt.com.swcmp.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
