package org.example;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Optional;

public class WarehouseManager {
    public ArrayList<Warehouse> warehouses = new ArrayList<>();

    /**
     * Add a new warehouse to tje list of all warehouses
     *
     * @param warehouse
     */
    public void addNewWarehouse(Warehouse warehouse) throws IllegalArgumentException {
        boolean idExists = warehouses.stream().anyMatch(w -> w.getId() == warehouse.getId());
        warehouses.add(warehouse);

        if(idExists){
            throw new IllegalArgumentException("Warehouse with that ID already exists");

        }

    }

    public ArrayList<Warehouse> getAllWarehouses() {
        return warehouses;
    }
    public  void addProductToWarehouse(int warhouseId, Product product)throws FindException{
        Warehouse warehouse = getWarehouseById(warhouseId);
        warehouse.addProduct(product);
    }

    public Warehouse getWarehouseById(int id ) {
        Optional<Warehouse> optionalWarehouse = warehouses.stream()
                .filter(warehouse -> warehouse
                        .getId() == id)
                .findFirst();
        Warehouse warehouse;

        //Tif if a warehouse with the ID
        if (optionalWarehouse.isPresent()) {

            //...  return it
            return optionalWarehouse.get();

        }
        //Otherwise throw a return
            throw new FindException("Warehouse with ID not found");
        }


    }
