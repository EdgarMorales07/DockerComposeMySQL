package mx.unam.aragon.ico.te.restsmartphone.repository;

import mx.unam.aragon.ico.te.restsmartphone.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
}
