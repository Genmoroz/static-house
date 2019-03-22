package com.frost.house.dao.interfaces;

/**
 * The contract for all electrical devices.
 */
public interface AbstractElectric {

    void turnOn(AbstractElectricity electricity);

    void turnOff();
}
