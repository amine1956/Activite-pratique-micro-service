package org.sid.microservice.reposetories;

import org.sid.microservice.entities.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustmerReposetory extends JpaRepository<Custmer,Long> {
}
