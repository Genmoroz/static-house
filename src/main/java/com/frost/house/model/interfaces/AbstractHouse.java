package com.frost.house.model.interfaces;

/**
 * The contract for all houses.
 */
public interface AbstractHouse {

    /**
     * The invoking of this method will switch the light on
     *
     * @return - true if the switching the light on was successfully, false if failed
     */
    boolean onLight();

    /**
     * The invoking of this method will switch the light off
     *
     * @return - true if the switching the light off was successfully, false if failed
     */
    boolean offLight();

    /**
     * The invoking of this method will switch all electrical devices off
     *
     * @return - true if switching all electrical devices off was successfully, false if failed
     */
    boolean onElectricalWiring();

    /**
     * The invoking of this method will switch all electrical devices off
     *
     * @return - true if switching all electrical devices off was successfully, false if failed
     */
    boolean offElectricalWiring();

    /**
     * The invoking of this method will turn plumbing system on
     *
     * @return - true if turning plumbing system on was successfully, false if failed
     */
    boolean onPlumbing();

    /**
     * The invoking of this method will turn plumbing system off
     *
     * @return - true if turning plumbing system off was successfully, false if failed
     */
    boolean offPlumbing();

    /**
     * The invoking of this method will open all devices
     *
     * @return - true if the opening all doors was successfully, false if failed
     */
    boolean openAllDoors();

    /**
     * The invoking of this method will close all devices
     *
     * @return - true if the closing all doors was successfully, false if failed
     */
    boolean closeAllDoors();

    /**
     * The invoking of this method will switch all devices on
     *
     * @return - true if the switching all devices on was successfully, false if failed
     */
    boolean onAllDevices();

    /**
     * The invoking of this method will switch all devices off
     *
     * @return - true if the switching all devices off was successfully, false if failed
     */
    boolean offAllDevices();

    /**
     * The invoking of this method will lock this house
     *
     * @return - true if the locking this house was successfully, false if failed
     */
    boolean lock();

    /**
     * The invoking of this method will unlock this house
     *
     * @return - true if the unlocking this house was successfully, false if failed
     */
    boolean unlock();
}
