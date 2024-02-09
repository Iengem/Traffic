package Offenders.TrafficManager.Repository;

import Offenders.TrafficManager.Model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffenderRepository extends JpaRepository<People,Long> {
}
