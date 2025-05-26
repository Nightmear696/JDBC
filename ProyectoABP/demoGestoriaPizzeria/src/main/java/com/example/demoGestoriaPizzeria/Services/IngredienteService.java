//package com.example.demoGestoriaPizzeria.Services;
//
//import com.example.demoGestoriaPizzeria.Model.Ingrediente;
//import com.example.demoGestoriaPizzeria.Repository.IngredienteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class IngredienteService {
//
//    private final IngredienteRepository ingredienteRepository;
//
//    @Autowired
//    public IngredienteService(IngredienteRepository ingredienteRepository) {
//        this.ingredienteRepository = ingredienteRepository;
//    }
//
//    public List<Ingrediente> obtenerTodosLosIngredientes() {
//        return ingredienteRepository.findAll();
//    }
//
//    public Optional<Ingrediente> obtenerIngredientePorId(Long id) {
//        return ingredienteRepository.findById(id);
//    }
//
//    public Ingrediente crearIngrediente(Ingrediente ingrediente) {
//        return ingredienteRepository.save(ingrediente);
//    }
//
//    public Ingrediente actualizarIngrediente(Long id, Ingrediente ingredienteActualizado) {
//        return ingredienteRepository.findById(id)
//                .map(ingredienteExistente -> {
//                    ingredienteExistente.setNombre(ingredienteActualizado.getNombre());
//                    ingredienteExistente.setCantidad(ingredienteActualizado.getCantidad());
//                    ingredienteExistente.setEsVegano(ingredienteActualizado.isEsVegano());
//                    ingredienteExistente.setEsIngredienteSinGluten(ingredienteActualizado.isEsIngredienteSinGluten());
//                    return ingredienteRepository.save(ingredienteExistente);
//                })
//                .orElseThrow(() -> new RuntimeException("Ingrediente no encontrado con id: " + id));
//    }
//
//    public void eliminarIngrediente(Long id) {
//        ingredienteRepository.deleteById(id);
//    }
//
////    public List<Ingrediente> obtenerEsIngredienteSinGluten() {
////        return ingredienteRepository.findByEsIngredienteSinGluten(true);
////    }
//public List<Ingrediente> obtenerEsIngredienteSinGluten() {
//    return ingredienteRepository.findByEsIngredienteSinGlutenTrue();
//}
//
//
//    public void actualizarStockIngrediente(Long id, double cantidad) {
//        ingredienteRepository.findById(id)
//                .ifPresent(ingrediente -> {
//                    ingrediente.setCantidad(cantidad);
//                    ingredienteRepository.save(ingrediente);
//                });
//    }
//}