package br.com.jse.after.srp;

public enum EmployeeEnum {

    DEVELOPER(new BaseZeroCommaSixPercent()),
    DBA(new BaseZeroCommaNinePercent()),
    TESTER(new BaseZeroCommaFivePercent());

    public Calculable calculable;

    EmployeeEnum(Calculable calculable){
        this.calculable = calculable;
    }

    public Calculable getCalc() {
        return calculable;
    }

    public void setCalc(Calculable calculable) {
        this.calculable = calculable;
    }
}
