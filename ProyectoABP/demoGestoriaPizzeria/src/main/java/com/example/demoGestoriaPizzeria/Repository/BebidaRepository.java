package com.example.demoGestoriaPizzeria.Repository;

import com.example.demoGestoriaPizzeria.Model.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Long> {

}