package az.vgrch.practice.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

    public static void main(String[] args) {

        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        System.out.println("instance1 = " + instance1.toString());

        EagerInitializedSingleton instance2 = null;
        try {
            Constructor<?>[] declaredConstructors = EagerInitializedSingleton.class.getDeclaredConstructors();

            for (Constructor constructor:declaredConstructors){
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
                System.out.println("Instance2 = " + instance2);
            }

            System.out.println(instance1.equals(instance2));
            System.out.println(instance1.equals(EagerInitializedSingleton.getInstance()));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {

        }

    }

}
