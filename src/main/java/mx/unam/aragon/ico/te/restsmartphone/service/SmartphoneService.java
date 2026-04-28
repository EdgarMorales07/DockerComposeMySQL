package mx.unam.aragon.ico.te.restsmartphone.service;

import mx.unam.aragon.ico.te.restsmartphone.model.Smartphone;

import java.util.List;

public interface SmartphoneService {
    List<Smartphone> obtenerTodos();
    Smartphone obtenerPorId(Integer id);
    Smartphone guardar(Smartphone smartphone);
    Smartphone actualizar(Smartphone smartphone);
    Smartphone eliminar(Integer id);
}
