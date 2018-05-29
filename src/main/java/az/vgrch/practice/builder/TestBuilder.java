package az.vgrch.practice.builder;

import az.vgrch.practice.builder.builder_patter.Phone;

public class TestBuilder {

    public static void main(String[] args) {
        az.vgrch.practice.builder.builder_patter.Phone.Builder builder = new az.vgrch.practice.builder.builder_patter.Phone.Builder().battery("4100aMh").camera("12MP").LTEsupport(true);
        az.vgrch.practice.builder.builder_patter.Phone p = new az.vgrch.practice.builder.builder_patter.Phone(builder);


        az.vgrch.practice.builder.telescopic_constructor.Phone tp = new az.vgrch.practice.builder.telescopic_constructor.Phone("1024*768");
        System.out.println(tp);

        System.out.println(p);

    }
}
