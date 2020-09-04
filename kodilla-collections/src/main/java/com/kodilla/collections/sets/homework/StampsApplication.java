package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
    Set<Stamps> stamps = new HashSet<>();
    stamps.add(new Stamps("Penny Black", 10.0, "Yes"));
    stamps.add(new Stamps("Queen", 12.0, "No"));
    stamps.add(new Stamps("King", 9.2, "Yes"));
    stamps.add(new Stamps("Penny Black", 10.0, "Yes"));

        System.out.println(stamps.size());
        for(Stamps stamp : stamps)
            System.out.println(stamp);
    }

}
