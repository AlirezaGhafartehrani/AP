package org.university.core;

public class ServiceEmployee extends AbstractEmployee {

    protected Double workingYears;
    protected boolean promotable;

    public ServiceEmployee() {
        workingYears = 0.0;
        promotable = false;
    }

    @Override
    public Double calCurrentIncome() {
        return workingYears;
    }

    @Override
    public boolean isPromotable() {
        return promotable;
    }
}
