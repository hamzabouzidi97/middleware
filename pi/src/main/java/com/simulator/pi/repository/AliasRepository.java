package com.simulator.pi.repository;

import com.simulator.pi.entity.Alias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long> {

    Optional<Alias> findAliasByCle(String cle);
}
