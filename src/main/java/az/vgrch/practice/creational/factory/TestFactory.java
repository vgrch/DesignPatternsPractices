package az.vgrch.practice.creational.factory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("8gb", "CoreI3", "640gb", "PC");
        System.out.println("PC : " + pc.toString());

        Computer server = ComputerFactory.getComputer("64gb", "QuadCore", "50tb", "server");
        System.out.println("Server : " + server.toString());
    }
}
