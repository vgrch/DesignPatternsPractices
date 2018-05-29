package az.vgrch.practice.creational.singleton;

public class LazyInitializedSingleton {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setInstance(LazyInitializedSingleton instance) {
        LazyInitializedSingleton.instance = instance;
    }

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance(){
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
