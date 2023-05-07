package service;

import com.example.lab6.Plane;

import java.util.List;

public interface PlaneServicee {
    List<Plane> getAllPlanes();

    Plane getPlaneById(Long id);

    Plane createNewPlane(Plane plane);

    Plane updatePlaneById(Long id, Plane updatedPlane);

    void deletePlaneById(Long id);
}
