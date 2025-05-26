package com.example.demoGestoriaPizzeria.Controller;

//import com.example.demoGestoriaPizzeria.Model.Pizza;
//import com.example.demoGestoriaPizzeria.Services.PizzaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/pizzas")
//public class PizzaController {
//
//    @Autowired
//    private PizzaService pizzaService;
//
//    @GetMapping
//    public List<Pizza> obtenerTodasLasPizzas() {
//        return pizzaService.obtenerTodasLasPizzas();
//    }
//
//    @GetMapping("/{id}")
//    public Pizza obtenerPizzaPorId(@PathVariable Long id) {
//        return pizzaService.obtenerPizzaPorId(id);
//    }
//
//    @PostMapping
//    public Pizza crearPizza(@RequestBody Pizza pizza) {
//        return pizzaService.guardarPizza(pizza);
//    }
//
//    @PutMapping("/{id}")
//    public Pizza actualizarPizza(@PathVariable Long id, @RequestBody Pizza pizza) {
//        pizza.setId(id);
//        return pizzaService.guardarPizza(pizza);
//    }
//
//    @DeleteMapping("/{id}")
//    public void eliminarPizza(@PathVariable Long id) {
//        pizzaService.eliminarPizza(id);
//    }
//}