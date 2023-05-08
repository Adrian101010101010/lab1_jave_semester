package ua.lviv.iot.algo.part1.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class PlaneRepository implements JpaRepository<Plane, Long> {

    @Override
    public Plane save(Plane plane) {
      return null;
    }

    @Override
    public Plane saveAndFlush(Plane plane) {
      return null;  }

    @Override
    public void deleteById(Long id) {

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Plane> getAllPlanes() {
        String sql = "SELECT * FROM planes";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Plane.class));
    }


}