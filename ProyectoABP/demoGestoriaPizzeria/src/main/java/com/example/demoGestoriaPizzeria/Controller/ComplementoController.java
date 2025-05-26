package com.example.demoGestoriaPizzeria.Controller;

//import com.example.demoGestoriaPizzeria.Model.Complemento;
//import com.example.demoGestoriaPizzeria.Services.ComplementoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/complementos")
//public class ComplementoController {
//
//    private final ComplementoService complementoService;
//
//    @Autowired
//    public ComplementoController(ComplementoService complementoService) {
//        this.complementoService = complementoService;
//    }
//
//    @GetMapping
//    public List<Complemento> obtenerTodosLosComplementos() {
//        return complementoService.obtenerTodosLosComplementos();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Complemento> obtenerComplementoPorId(@PathVariable Long id) {
//        return complementoService.obtenerComplementoPorId(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Complemento> crearComplemento(@RequestBody Complemento complemento) {
//        Complemento nuevoComplemento = complementoService.crearComplemento(complemento);
//        return ResponseEntity.ok(nuevoComplemento);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Complemento> actualizarComplemento(
//            @PathVariable Long id,
//            @RequestBody Complemento complementoActualizado) {
//        try {
//            Complemento complemento = complementoService.actualizarComplemento(id, complementoActualizado);
//            return ResponseEntity.ok(complemento);
//        } catch (RuntimeException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminarComplemento(@PathVariable Long id) {
//        try {
//            complementoService.eliminarComplemento(id);
//            return ResponseEntity.noContent().build(); // 204 No Content (éxito)
//        } catch (Exception e) {
//            return ResponseEntity.notFound().build(); // 404 Not Found (si no existe)
//        }
//    }
//}