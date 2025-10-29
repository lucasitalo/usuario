package com.lucasitalo.usuario.infrastructure.repository;

import com.lucasitalo.aprendendo__spring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
