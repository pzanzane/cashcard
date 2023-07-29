package com.example.cashcard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CashCardRepository implements CrudRepository<CashCard, Long> {


    @Override
    public <S extends CashCard> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CashCard> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CashCard> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<CashCard> findAll() {
        return null;
    }

    @Override
    public Iterable<CashCard> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CashCard entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CashCard> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
