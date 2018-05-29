package az.vgrch.practice.creational.abstrac_factory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        Computer server = ComputerFactory.getComputer(new ServerFactory("8GB", "500GB", "Core2Duo"));
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "50GB", "Celeron"));

        System.out.println("pc " + pc.toString());
        System.out.println("server " + server.toString());
    }
}
