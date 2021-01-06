package datc2020.proiect.CityDangersAlert.controllers;

import datc2020.proiect.CityDangersAlert.dto.Alerte;
import datc2020.proiect.CityDangersAlert.dto.AlerteDTO;
import datc2020.proiect.CityDangersAlert.repos.AlerteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlerteController {
    private final AlerteRepo alerteRepo;

    @Autowired
    public AlerteController(AlerteRepo alerteRepo) {
        this.alerteRepo = alerteRepo;
    }

    @GetMapping
    public String hello(){
        return "hello azure";
    }

    @CrossOrigin
    @GetMapping("/alerte")
    public ResponseEntity<Iterable<Alerte>> getAlerte() {
        Iterable<Alerte> alerte = alerteRepo.findAll();
        return ResponseEntity.ok(alerte);
    }

    @CrossOrigin
    @PostMapping("/alerte")
    public ResponseEntity<AlerteDTO> setAlerte(@RequestBody AlerteDTO alerte) {

        return ResponseEntity.ok(alerte);
    }
}










