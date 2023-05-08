package service;

import ua.lviv.iot.algo.part1.lab1.Plane;

import java.util.List;

public interface PlaneServicee {
    /**
     * @return AllPlanes
     */
    List<Plane> getAllPlanes();

    /**
     * @param id search id
     * @return long id
     */
    Plane getPlaneById(Long id);

    /**
     * @param plane NewPlane
     * @return plane
     */
    Plane createNewPlane(Plane plane);

    /**
     * @param id           id
     * @param updatedPlane updatedPlane
     * @return id, updatedPlane
     */
    Plane updatePlaneById(Long id, Plane updatedPlane);

    /**
     * @param id delete plane id
     */
    void deletePlaneById(Long id);
}
