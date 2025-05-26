//package com.example.demoGestoriaPizzeria.Services;
//
//import com.example.demoGestoriaPizzeria.Model.Bebida;
//import com.example.demoGestoriaPizzeria.Repository.BebidaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class BebidaService {
//
//    private final BebidaRepository bebidaRepository;
//
//    @Autowired
//    public BebidaService(BebidaRepository bebidaRepository) {
//        this.bebidaRepository = bebidaRepository;
//    }
//
//    public List<Bebida> obtenerTodasLasBebidas() {
//        return bebidaRepository.findAll();
//    }
//
//    public Optional<Bebida> obtenerBebidaPorId(Long id) {
//        return bebidaRepository.findById(id);
//    }
//
//    public Bebida crearBebida(Bebida bebida) {
//        return bebidaRepository.save(bebida);
//    }
//
//    public Bebida actualizarBebida(Long id, Bebida bebidaActualizada) {
//        return bebidaRepository.findById(id)
//                .map(bebidaExistente -> {
//                    bebidaExistente.setNombre(bebidaActualizada.getNombre());
//                    bebidaExistente.setTamano(bebidaActualizada.getTamano());
//                    bebidaExistente.setDisponible(bebidaActualizada.isDisponible());
//                    bebidaExistente.setPrecio(bebidaActualizada.getPrecio());
//                    return bebidaRepository.save(bebidaExistente);
//                })
//                .orElseThrow(() -> new RuntimeException("Bebida no encontrada con id: " + id));
//    }
//
//    public void eliminarBebida(Long id) {
//        bebidaRepository.deleteById(id);
//    }
//
////    public List<Bebida> obtenerBebidasPorTamano(Bebida.TamanoEnum tamano) {
////        return bebidaRepository.findByTamano(tamano);
////    }
//
//    public List<Bebida> obtenerBebidasDisponibles() {
//        return bebidaRepository.findByDisponibleTrue();
//    }
//}