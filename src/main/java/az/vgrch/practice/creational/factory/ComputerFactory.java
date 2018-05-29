package az.vgrch.practice.creational.factory;

public class ComputerFactory {


    public static Computer getComputer(String ram,String cpu,String hdd,String type){
        if (type.equalsIgnoreCase("PC")) {
            return new PC(ram, hdd, cpu);
        } else if (type.equalsIgnoreCase("SERVER")) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
