//package com.example.demoGestoriaPizzeria.Services;
//
//import com.example.demoGestoriaPizzeria.Model.Combo;
//import com.example.demoGestoriaPizzeria.Model.Producto;
//import com.example.demoGestoriaPizzeria.Repository.ComboRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Transactional
//public class ComboService {
//
//    private final ComboRepository comboRepository;
//
//    @Autowired
//    public ComboService(ComboRepository comboRepository) {
//        this.comboRepository = comboRepository;
//    }
//
//    public List<Combo> obtenerTodosLosCombos() {
//        return comboRepository.findAll();
//    }
//
//    public Optional<Combo> obtenerComboPorId(Long id) {
//        return comboRepository.findById(id);
//    }
//
//    public Combo crearCombo(Combo combo) {
//        return comboRepository.save(combo);
//    }
//
//    public Combo actualizarCombo(Long id, Combo comboActualizado) {
//        return comboRepository.findById(id)
//                .map(comboExistente -> {
//                    comboExistente.setNombre(comboActualizado.getNombre());
//                    comboExistente.setPrecio(comboActualizado.getPrecio());
//                    comboExistente.setProductos(comboActualizado.getProductos());
//                    return comboRepository.save(comboExistente);
//                })
//                .orElseThrow(() -> new RuntimeException("Combo no encontrado con id: " + id));
//    }
//
//    public void eliminarCombo(Long id) {
//        comboRepository.deleteById(id);
//    }
//
//    public Combo agregarProductoACombo(Long comboId, Producto producto) {
//        return comboRepository.findById(comboId)
//                .map(combo -> {
//                    combo.addProducto(producto);
//                    return comboRepository.save(combo);
//                })
//                .orElseThrow(() -> new RuntimeException("Combo no encontrado con id: " + comboId));
//    }
//
//    public Combo quitarProductoDeCombo(Long comboId, Long productoId) {
//        return comboRepository.findById(comboId)
//                .map(combo -> {
//                    combo.getProductos().removeIf(p -> p.getIdProducto().equals(productoId));
//                    return comboRepository.save(combo);
//                })
//                .orElseThrow(() -> new RuntimeException("Combo no encontrado con id: " + comboId));
//    }
//
//    public double calcularPrecioCombo(Long comboId) {
//        return comboRepository.findById(comboId)
//                .map(Combo::calcularPrecio)
//                .orElseThrow(() -> new RuntimeException("Combo no encontrado con id: " + comboId));
//    }
//}