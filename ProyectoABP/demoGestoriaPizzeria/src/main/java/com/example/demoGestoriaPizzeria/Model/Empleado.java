package com.example.demoGestoriaPizzeria.Model;

import com.example.demoGestoriaPizzeria.Enums.enumPuestoTrabajador;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private enumPuestoTrabajador puesto;

    private double sueldo;
    private boolean activo;

    @OneToMany(mappedBy = "repartidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos;

    public void asignarPedido(Pedido pedido) {
        if (pedidos == null) {
            pedidos = new ArrayList<>();
        }
        pedidos.add(pedido);
        pedido.setRepartidor(this);
    }

    public List<Pedido> getPedidosAsignados() {
        return pedidos;
    }

    public String getPuesto() {
        return puesto.toString();
    }
}