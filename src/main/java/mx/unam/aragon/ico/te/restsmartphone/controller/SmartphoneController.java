package mx.unam.aragon.ico.te.restsmartphone.controller;

import mx.unam.aragon.ico.te.restsmartphone.model.Smartphone;
import mx.unam.aragon.ico.te.restsmartphone.service.SmartphoneService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/smartphone")
public class SmartphoneController {

    private final SmartphoneService smartphoneService;

    public SmartphoneController(SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    @GetMapping("/")
    public List<Smartphone> findAll(){
        return smartphoneService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Smartphone findById(@PathVariable Integer id){
        return smartphoneService.obtenerPorId(id);
    }

    @PostMapping("/")
    public Smartphone create(@RequestBody Smartphone smartphone){
        return smartphoneService.guardar(smartphone);
    }

    @DeleteMapping("/{id}")
    public Smartphone deleteById(@PathVariable Integer id){
        return smartphoneService.eliminar(id);
    }

}
