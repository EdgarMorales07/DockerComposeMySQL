package mx.unam.aragon.ico.te.restsmartphone.service;

import mx.unam.aragon.ico.te.restsmartphone.model.Smartphone;
import mx.unam.aragon.ico.te.restsmartphone.repository.SmartphoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneServiceImpl implements  SmartphoneService {

    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public List<Smartphone> obtenerTodos() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone obtenerPorId(Integer id) {
        return smartphoneRepository.findById(id).orElse(null);
    }

    @Override
    public Smartphone guardar(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    @Override
    public Smartphone actualizar(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    @Override
    public Smartphone eliminar(Integer id) {
        Smartphone smartphone = smartphoneRepository.findById(id).orElse(null);
        if(smartphone != null){
            smartphoneRepository.delete(smartphone);
        }
        return smartphone;
    }
}
