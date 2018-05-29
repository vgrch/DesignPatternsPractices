package az.vgrch.practice.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static{
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception ex){

        }
    }

    public StaticBlockSingleton getInstance(){
        return instance;
    }

}