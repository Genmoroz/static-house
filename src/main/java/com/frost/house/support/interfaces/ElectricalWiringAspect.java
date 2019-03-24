package com.frost.house.support.interfaces;

/**
 * The contract for all electrical wiring systems
 * As Planned, this must be used as Aspect
 */
public interface ElectricalWiringAspect {

    /**
     * The invoking of this method will switch the electrical wiring on
     *
     * @return - true if the switching the electrical wiring on was successfully, false if failed
     */
    boolean switchOn();

    /**
     * The invoking of this method will switch the electrical wiring off
     *
     * @return - true if the switching the electrical wiring off was successfully, false if failed
     */
    boolean switchOff();

    /**
     * @return - the facility of Electricity
     */
    Electricity getElectricity();

    /**
     * Setting the facility of Electricity
     */
    void setElectricity(Electricity electricity);
}
