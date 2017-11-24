package teljstedt.com.swcmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teljstedt.com.swcmp.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
