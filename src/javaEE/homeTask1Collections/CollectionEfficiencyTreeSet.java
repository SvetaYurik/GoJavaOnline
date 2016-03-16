package javaEE.homeTask1Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionEfficiencyTreeSet {
    public double timeSpentAdd() {
        double timeSpent = 0;
        TreeSet<Integer> treeSet;

        for (int j = 0; j <= 100; j++) {
            treeSet = new TreeSet();

            double startTime = System.currentTimeMillis();

            for (int i = 0; i <= 10000; i++) {
                treeSet.add(i);
            }
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentGet() {
        double timeSpent = 0;
        TreeSet<Integer> treeSet;

        for (int j = 0; j <= 100; j++) {
            treeSet = new TreeSet<>();


            for (int i = 0; i <= 10000; i++) {
                treeSet.add(i);
            }
            double startTime = System.currentTimeMillis();
            treeSet.getClass();
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentRemove() {
        double timeSpent = 0;
        TreeSet<Integer> treeSet;

        for (int j = 0; j <= 100; j++) {
            treeSet = new TreeSet<>();

            for (int i = 0; i <= 10; i++) {
                treeSet.add(i);

            }
            double startTime = System.currentTimeMillis();
            treeSet.remove(0);

            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

}
