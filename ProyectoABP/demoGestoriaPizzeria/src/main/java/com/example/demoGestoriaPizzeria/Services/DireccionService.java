//package com.example.demoGestoriaPizzeria.Services;
//
//import com.example.demoGestoriaPizzeria.Model.Direccion;
//import com.example.demoGestoriaPizzeria.Repository.DireccionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DireccionService {
//
//    private final DireccionRepository direccionRepository;
//
//    @Autowired
//    public DireccionService(DireccionRepository direccionRepository) {
//        this.direccionRepository = direccionRepository;
//    }
//
//    public List<Direccion> obtenerTodasLasDirecciones() {
//        return direccionRepository.findAll();
//    }
//
//    public Optional<Direccion> obtenerDireccionPorId(Long id) {
//        return direccionRepository.findById(id);
//    }
//
//    public Direccion crearDireccion(Direccion direccion) {
//        return direccionRepository.save(direccion);
//    }
//
//    public Direccion actualizarDireccion(Long id, Direccion direccionActualizada) {
//        return direccionRepository.findById(id)
//                .map(direccionExistente -> {
//                    direccionExistente.setCalle(direccionActualizada.getCalle());
//                    direccionExistente.setNumero(direccionActualizada.getNumero());
//                    direccionExistente.setCiudad(direccionActualizada.getCiudad());
//                    direccionExistente.setCodigoPostal(direccionActualizada.getCodigoPostal());
//                    return direccionRepository.save(direccionExistente);
//                })
//                .orElseThrow(() -> new RuntimeException("Dirección no encontrada con id: " + id));
//    }
//
//    public void eliminarDireccion(Long id) {
//        direccionRepository.deleteById(id);
//    }
//
//    public List<Direccion> buscarDireccionesPorCiudad(String ciudad) {
//        return direccionRepository.findByCiudad(ciudad);
//    }
//
//    public List<Direccion> buscarDireccionesPorCodigoPostal(String codigoPostal) {
//        return direccionRepository.findByCodigoPostal(codigoPostal);
//    }
//}