package ua.lviv.iot.algo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.lab6.Plane;
import service.PlaneServicee;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    private final PlaneServicee planeService;

    @Autowired
    public PlaneController(PlaneServicee planeService) {
        this.planeService = planeService;
    }

    @GetMapping("")
    public List<Plane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plane> getPlaneById(@PathVariable Long id) {
        Plane plane = planeService.getPlaneById(id);
        return ResponseEntity.ok(plane);
    }

    @PostMapping("")
    public ResponseEntity<Plane> createNewPlane(@Valid @RequestBody Plane plane) {
        Plane createdPlane = planeService.createNewPlane(plane);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPlane);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plane> updatePlaneById(@PathVariable Long id, @Valid @RequestBody Plane plane) {
        Plane updatedPlane = planeService.updatePlaneById(id, plane);
        return ResponseEntity.ok(updatedPlane);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePlaneById(@PathVariable Long id) {
        planeService.deletePlaneById(id);
        return ResponseEntity.noContent().build();
    }
}