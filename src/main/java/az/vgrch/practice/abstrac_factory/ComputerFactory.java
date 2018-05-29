package az.vgrch.practice.abstrac_factory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory abstractFactory){
        return abstractFactory.createComputer();
    }
}
