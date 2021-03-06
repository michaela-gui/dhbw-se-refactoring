package net.schimweg.dhbw.se.refactoring;

import java.util.Vector;

public class Customer {
    private final String name;

    private final Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public Vector<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return new Statement(this).toString();
    }

}
    
