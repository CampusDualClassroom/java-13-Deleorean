package com.campusdual.classroom;

public class FuelTank {

    private int actualFuel = 10;

    public void showDetails() {

        System.out.println("La capacidad actual es de " +
                getActualFuel() + " litros.");
    }

    public int getActualFuel() {
        return actualFuel;
    }

    public void setActualFuel(int newFuel) {
        if (newFuel < 0) {
            System.out.println("Non se pode introducir un valor negativo");
        } else {
            actualFuel = newFuel;
        }
    }
}
