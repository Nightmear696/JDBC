package com.example.demoGestoriaPizzeria.Repository;

import com.example.demoGestoriaPizzeria.Enums.enumEstadoPedido;
import com.example.demoGestoriaPizzeria.Model.Cliente;
import com.example.demoGestoriaPizzeria.Model.Empleado;
import com.example.demoGestoriaPizzeria.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoGestoriaPizzeria.Enums.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


}