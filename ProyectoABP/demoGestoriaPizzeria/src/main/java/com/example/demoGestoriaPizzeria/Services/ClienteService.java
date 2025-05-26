//package com.example.demoGestoriaPizzeria.Services;
//
//import com.example.demoGestoriaPizzeria.Model.Cliente;
//import com.example.demoGestoriaPizzeria.Model.Pedido;
//import com.example.demoGestoriaPizzeria.Repository.ClienteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ClienteService {
//
//    @Autowired
//    private ClienteRepository clienteRepository;
//
//    public List<Cliente> obtenerTodosLosClientes() {
//        return clienteRepository.findAll();
//    }
//
//    public Optional<Cliente> obtenerClientePorId(Long id) {
//        return clienteRepository.findById(id);
//    }
//
//    public Cliente crearCliente(Cliente cliente) {
//        return clienteRepository.save(cliente);
//    }
//
//    public Cliente actualizarCliente(Long id, Cliente clienteActualizado) {
//        return clienteRepository.findById(id)
//                .map(clienteExistente -> {
//                    clienteExistente.setNombre(clienteActualizado.getNombre());
//                    clienteExistente.setEmail(clienteActualizado.getEmail());
//                    clienteExistente.setTelefono(clienteActualizado.getTelefono());
//                    clienteExistente.setDireccion(clienteActualizado.getDireccion());
//                    return clienteRepository.save(clienteExistente);
//                })
//                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + id));
//    }
//}