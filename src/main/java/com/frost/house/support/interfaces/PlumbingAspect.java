package com.frost.house.support.interfaces;

/**
 * The contract for all plumbing systems
 * As Planned, this must be used as Aspect
 */
public interface PlumbingAspect extends AbstractSanitary, AbstractElectrical {

    /**
     * The invoking of this method will turn plumbing system on
     *
     * @return - true if the turning plumbing system on was successfully, false if failed
     */
    boolean switchOn();

    /**
     * The invoking of this method will turn plumbing system off
     *
     * @return - true if the turning plumbing system off was successfully, false if failed
     */
    boolean switchOff();

    /**
     * @return - the pressure of water
     */
    float getPressure();

    /**
     * @return - the facility of Water
     */
    Water getWater();

    /**
     * Setting the facility of Water
     */
    void setWater(Water water);
}
