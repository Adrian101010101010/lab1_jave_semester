package com.example.lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class PlaneRepository implements JpaRepository<Plane, Long> {
    // метод для знаходження літаку за його ID

    @Override
    public Plane save(Plane plane) {
      return null;  // код для створення нового літака
    }

    @Override
    public Plane saveAndFlush(Plane plane) {
      return null;  // код для оновлення інформації про існуючий літак
    }

    @Override
    public void deleteById(Long id) {
       // код для видалення літака за його ID

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Plane> getAllPlanes() {
        String sql = "SELECT * FROM planes";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Plane.class));
    }

    public Plane getPlaneById(Long id) {
        String sql = "SELECT * FROM planes WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Plane.class));
    }

    public void addPlane(Plane plane) {
        String sql = "INSERT INTO planes (id, name, model, year) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, plane.getId(), plane.getName(), plane.getModel(), plane.getYear());
    }

    public void updatePlane(Long id, Plane plane) {
        String sql = "UPDATE planes SET name=?, model=?, year=? WHERE id=?";
        jdbcTemplate.update(sql, plane.getName(), plane.getModel(), plane.getYear(), id);
    }

    public void deletePlane(Long id) {
        String sql = "DELETE FROM planes WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Plane> findAll() {
        return null;
    }

    @Override
    public List<Plane> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Plane> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Plane> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }



    @Override
    public void delete(Plane entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Plane> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Plane> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Plane> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Plane> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Plane> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Plane getOne(Long aLong) {
        return null;
    }

    @Override
    public Plane getById(Long aLong) {
        return null;
    }

    @Override
    public Plane getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Plane> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Plane> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Plane> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Plane> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Plane> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Plane> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Plane, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}