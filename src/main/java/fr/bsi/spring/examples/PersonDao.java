package fr.bsi.spring.examples;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by habib on 28/09/2017.
 */
@Component
public interface PersonDao extends JpaRepository<Person, Long> {
}
