package com.mydvdstore.service;

import com.mydvdstore.model.tables.pojos.Rental;

import java.util.List;

public interface RentalService {

    public void Save(Rental rental);
    public Rental findById(int id);
    public List<Rental> findAll();
    public List<Rental> findEntries(int firstResult, int maxResult);
    public long countAll();
    public void update(Rental rental);
    public void  delete(Rental rental);
}
