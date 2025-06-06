//package com.example.demoGestoriaPizzeria.Services;
//
//import com.example.demoGestoriaPizzeria.Enums.enumEstadoPedido;
//import com.example.demoGestoriaPizzeria.Model.Empleado;
//import com.example.demoGestoriaPizzeria.Model.Pedido;
//import com.example.demoGestoriaPizzeria.Model.Producto;
//import com.example.demoGestoriaPizzeria.Repository.PedidoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PedidoService {
//
//    @Autowired
//    private PedidoRepository pedidoRepository;
//
//    @Autowired
//    private EmpleadoService empleadoService;
//
//    public List<Pedido> obtenerTodosLosPedidos() {
//        return pedidoRepository.findAll();
//    }
//
//    public Optional<Pedido> obtenerPedidoPorId(Long id) {
//        return pedidoRepository.findById(id);
//    }
//
//    public Pedido crearPedido(Pedido pedido) {
//        pedido.setFechaPedido(LocalDateTime.now());
//        pedido.setEstado(enumEstadoPedido.PENDIENTE);
//        pedido.setPrecio(pedido.calcularTotal());
//        return pedidoRepository.save(pedido);
//    }
//
//    public Pedido actualizarPedido(Long id, Pedido pedidoActualizado) {
//        return pedidoRepository.findById(id)
//                .map(pedidoExistente -> {
//                    pedidoExistente.setCliente(pedidoActualizado.getCliente());
//                    pedidoExistente.setEstado(pedidoActualizado.getEstado());
//                    pedidoExistente.setRepartidor(pedidoActualizado.getRepartidor());
//                    // El precio se recalcula basado en los productos
//                    pedidoExistente.setPrecio(pedidoExistente.calcularTotal());
//                    return pedidoRepository.save(pedidoExistente);
//                })
//                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con id: " + id));
//    }
//
//    public void eliminarPedido(Long id) {
//        pedidoRepository.deleteById(id);
//    }
//
//    public List<Pedido> obtenerPedidosPorEstado(enumEstadoPedido estado) {
//        return pedidoRepository.findByEstado(estado);
//    }
//
//    public Pedido cambiarEstadoPedido(Long id, enumEstadoPedido nuevoEstado) {
//        return pedidoRepository.findById(id)
//                .map(pedido -> {
//                    pedido.cambiarEstado(nuevoEstado);
//                    return pedidoRepository.save(pedido);
//                })
//                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con id: " + id));
//    }
//
//    public Pedido asignarRepartidor(Long pedidoId, Long repartidorId) {
//        Pedido pedido = pedidoRepository.findById(pedidoId)
//                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con id: " + pedidoId));
//
//        empleadoService.obtenerEmpleadoPorId(repartidorId)
//                .ifPresent(repartidor -> {
//                    pedido.setRepartidor(repartidor);
//                    repartidor.asignarPedido(pedido);
//                });
//
//        return pedidoRepository.save(pedido);
//    }
//
//    public Pedido agregarProducto(Long pedidoId, Producto producto, int cantidad) {
//        return pedidoRepository.findById(pedidoId)
//                .map(pedido -> {
//                    pedido.addProducto(producto, cantidad);
//                    pedido.setPrecio(pedido.calcularTotal());
//                    return pedidoRepository.save(pedido);
//                })
//                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con id: " + pedidoId));
//    }
//}