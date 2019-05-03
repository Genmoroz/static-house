package com.frost.house.model.implementations;

import com.frost.house.model.interfaces.AbstractHouse;

/**
 * Main house for this project.
 */
public class House implements AbstractHouse {

    @Override
    public boolean onLight() {
        return false;
    }

    @Override
    public boolean offLight() {
        return false;
    }

    @Override
    public boolean onElectricalWiring() {
        return false;
    }

    @Override
    public boolean offElectricalWiring() {
        return false;
    }

    @Override
    public boolean onPlumbing() {
        return false;
    }

    @Override
    public boolean offPlumbing() {
        return false;
    }

    @Override
    public boolean openAllDoors() {
        return false;
    }

    @Override
    public boolean closeAllDoors() {
        return false;
    }

    @Override
    public boolean onAllDevices() {
        return false;
    }

    @Override
    public boolean offAllDevices() {
        return false;
    }

    @Override
    public boolean lock() {
        return false;
    }

    @Override
    public boolean unlock() {
        return false;
    }
}