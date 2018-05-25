package az.vgrch.practice.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {

    public static void main(String[] args) {
        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
        instance.setName("Vugar");
        System.out.println(instance.getName());
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        System.out.println(instance1.getName());

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 19; i++) {

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + LazyInitializedSingleton.getInstance().getName());
                }
            });
        }


    }
}
