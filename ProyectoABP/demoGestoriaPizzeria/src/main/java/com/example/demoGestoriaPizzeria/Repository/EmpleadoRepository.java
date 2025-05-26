package com.example.demoGestoriaPizzeria.Repository;

import com.example.demoGestoriaPizzeria.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}