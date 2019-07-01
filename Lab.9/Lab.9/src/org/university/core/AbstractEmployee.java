package org.university.core;

public abstract class AbstractEmployee extends Person {
    protected Statement[] bankStatements;
    protected int counter = 0;
    protected String position;
    protected Double basicIncome;

    public void setPosition(String position) {
        this.position = position;
    }

    public void addBankStatement (Statement s){
        bankStatements[counter] = s;
        counter++;
    }

    public Statement[] getBankStatements() {
        return bankStatements;
    }

    public void setBasicIncome(Double basicIncome) {
        this.basicIncome = basicIncome;
    }

    public abstract Double calCurrentIncome();

    public abstract boolean isPromotable();




}
