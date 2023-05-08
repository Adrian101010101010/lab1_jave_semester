package service;

import ua.lviv.iot.algo.part1.lab1.Plane;
import  ua.lviv.iot.algo.part1.lab1.PlaneRepository;
import org.springframework.stereotype.Service;

import javax.ws.rs.NotFoundException;
import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneServicee {

    private final PlaneRepository planeRepository;

    public PlaneServiceImpl(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @Override
    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }

    @Override
    public Plane getPlaneById(Long id) {
        return planeRepository.findById(id).orElseThrow(() -> new NotFoundException("Plane not found with id " + id));
    }

    @Override
    public Plane createNewPlane(Plane plane) {
        planeRepository.save(plane);
        return plane;
    }

    @Override
    public Plane updatePlaneById(Long id, Plane updatedPlane) {
        Plane plane = getPlaneById(id);
        plane.setName(updatedPlane.getName());
        plane.setModel(updatedPlane.getModel());
        plane.setYear(updatedPlane.getYear());
        plane.setManufacturer(updatedPlane.getManufacturer());
        plane.setSeats(updatedPlane.getSeats());
        // plane.setEngines(updatedPlane.getEngines());
        plane.setMaxSpeed(updatedPlane.getMaxSpeed());
        //  plane.setMaxDistance(updatedPlane.getMaxDistance());
        // plane.setPrice(updatedPlane.getPrice());
        planeRepository.save(plane);
        return plane;
    }

    @Override
    public void deletePlaneById(Long id) {
        Plane plane = getPlaneById(id);
        planeRepository.delete(plane);
    }
}
