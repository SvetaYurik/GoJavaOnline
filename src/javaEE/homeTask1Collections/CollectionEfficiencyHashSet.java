package javaEE.homeTask1Collections;

import java.util.HashSet;


public class CollectionEfficiencyHashSet {
    public double timeSpentAdd() {
        double timeSpent = 0;
        HashSet<Integer> hashSet;

        for (int j = 0; j <= 100; j++) {
            hashSet = new HashSet();

            double startTime = System.currentTimeMillis();

            for (int i = 0; i <= 10000; i++) {
                hashSet.add(i);
            }
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentGet() {
        double timeSpent = 0;
        HashSet<Integer> hashSet;

        for (int j = 0; j <= 100; j++) {
            hashSet = new HashSet<>();


            for (int i = 0; i <= 10000; i++) {
                hashSet.add(i);
            }
            double startTime = System.currentTimeMillis();
            hashSet.getClass();
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentRemove() {
        double timeSpent = 0;
        HashSet<Integer> hashSet = null;

        for (int j = 0; j <= 100; j++) {
            hashSet = new HashSet<>();

            for (int i = 0; i <= 10; i++) {
                hashSet.add(i);

            }
            double startTime = System.currentTimeMillis();
            hashSet.remove(0);

            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

}
