package com.example.demoGestoriaPizzeria.Model;
import com.example.demoGestoriaPizzeria.Model.Producto;
import com.example.demoGestoriaPizzeria.Enums.enumBebidaTamaño;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Bebida extends Producto {
    private String nombre; // "Refresco", "Agua", "Cerveza"

    @Enumerated(EnumType.STRING)
    private enumBebidaTamaño tamano;
    private boolean disponible;
}