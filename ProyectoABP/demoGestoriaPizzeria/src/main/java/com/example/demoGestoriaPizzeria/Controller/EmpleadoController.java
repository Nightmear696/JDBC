package com.example.demoGestoriaPizzeria.Controller;

//import com.example.demoGestoriaPizzeria.Model.Empleado;
//import com.example.demoGestoriaPizzeria.Services.EmpleadoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/empleados")
//public class EmpleadoController {
//
//    @Autowired
//    private EmpleadoService empleadoService;
//
//    @GetMapping
//    public List<Empleado> obtenerTodosLosEmpleados() {
//        return empleadoService.obtenerTodosLosEmpleados();
//    }
//
//    @GetMapping("/{id}")
//    public Empleado obtenerEmpleadoPorId(@PathVariable Long id) {
//        return empleadoService.obtenerEmpleadoPorId(id);
//    }
//
//    @PostMapping
//    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
//        return empleadoService.crearEmpleado(empleado);
//    }
//
//    @PutMapping("/{id}")
//    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
//        return empleadoService.actualizarEmpleado(id, empleado);
//    }
//
//    @DeleteMapping("/{id}")
//    public void desactivarEmpleado(@PathVariable Long id) {
//        empleadoService.desactivarEmpleado(id);
//    }
//
////    @GetMapping("/puesto/{puesto}")
////    public List<Empleado> obtenerEmpleadosPorPuesto(@PathVariable String puesto) {
////        return empleadoService.obtenerEmpleadosPorPuesto(puesto);
////    }
//}