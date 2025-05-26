package com.example.demoGestoriaPizzeria.Repository;

import com.example.demoGestoriaPizzeria.Model.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComboRepository extends JpaRepository<Combo, Long> {



}