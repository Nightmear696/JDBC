package com.example.demoGestoriaPizzeria.Controller;

//import com.example.demoGestoriaPizzeria.Model.Pedido;
//import com.example.demoGestoriaPizzeria.Services.PedidoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/pedidos")
//public class PedidoController {
//
//    @Autowired
//    private PedidoService pedidoService;
//
//    @GetMapping
//    public List<Pedido> obtenerTodosLosPedidos() {
//        return pedidoService.obtenerTodosLosPedidos();
//    }
//
//    @GetMapping("/{id}")
//    public Pedido obtenerPedidoPorId(@PathVariable Long id) {
//        return pedidoService.obtenerPedidoPorId(id);
//    }
//
//    @PostMapping
//    public Pedido crearPedido(@RequestBody Pedido pedido) {
//        return pedidoService.crearPedido(pedido);
//    }
//
//    @PutMapping("/{id}")
//    public Pedido actualizarPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
//        return pedidoService.actualizarPedido(id, pedido);
//    }
//
//    @DeleteMapping("/{id}")
//    public void eliminarPedido(@PathVariable Long id) {
//        pedidoService.eliminarPedido(id);
//    }
//
//    @GetMapping("/estado/{estado}")
//    public List<Pedido> obtenerPedidosPorEstado(@PathVariable String estado) {
//        return pedidoService.obtenerPedidosPorEstado(estado);
//    }
//}