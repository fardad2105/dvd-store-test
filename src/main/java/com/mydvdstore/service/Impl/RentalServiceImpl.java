package com.mydvdstore.service.Impl;

import com.mydvdstore.model.tables.daos.RentalDao;
import com.mydvdstore.model.tables.pojos.Rental;
import com.mydvdstore.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {


    @Autowired
    private RentalDao rentalDao;

    @Override
    public void Save(Rental rental) {

        rentalDao.insert(rental);

    }

    @Override
    public Rental findById(int id) {
        return rentalDao.findById(id);
    }

    @Override
    public List<Rental> findAll() {

        //Table<Record5<Short,Short, Timestamp,Timestamp,Short>> subquery1 =

//        rentalDao.getTable().as((Table<?>) Inventory.INVENTORY.INVENTORY_ID,Inventory.INVENTORY.STORE_ID,
//                com.dvdstore.jooq.tables.Rental.RENTAL.RENTAL_DATE,
//                com.dvdstore.jooq.tables.Rental.RENTAL.RETURN_DATE,
//                com.dvdstore.jooq.tables.Rental.RENTAL.CUSTOMER_ID);

        return rentalDao.findAll();

    }

    @Override
    public List<Rental> findEntries(int firstResult, int maxResult) {
        return rentalDao.fetchByInventoryId();
    }

    @Override
    public long countAll() {
        return rentalDao.count();
    }

    @Override
    public void update(Rental rental) {
         rentalDao.update(rental);
    }

    @Override
    public void delete(Rental rental) {
        rentalDao.delete(rental);
    }
}
