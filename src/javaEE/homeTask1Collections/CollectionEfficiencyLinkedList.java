package javaEE.homeTask1Collections;

import java.util.LinkedList;

public class CollectionEfficiencyLinkedList {
    public double timeSpentAdd() {
        double timeSpent = 0;
        LinkedList<Integer> linkedList;

        for (int j = 0; j <= 100; j++) {
            linkedList = new LinkedList();

            double startTime = System.currentTimeMillis();

            for (int i = 0; i <= 100000; i++) {
                linkedList.add(i, 193);
            }
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentGet() {
        double timeSpent = 0;
        LinkedList<Integer> linkedList;

        for (int j = 0; j <= 100; j++) {
            linkedList = new LinkedList();


            for (int i = 0; i <= 100000; i++) {
                linkedList.add(i, 193);
            }
            double startTime = System.currentTimeMillis();
            linkedList.get(9999);
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentRemove() {
        double timeSpent = 0;
        LinkedList<Integer> linkedList = null;

        for (int j = 0; j <= 100; j++) {
            linkedList = new LinkedList();

            for (int i = 0; i <= 100000; i++) {
                linkedList.add(i, 193);

            }
            double startTime = System.currentTimeMillis();
            linkedList.remove(0);

            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentContains() {
        double timeSpent = 0;
        LinkedList<Integer> linkedList = null;

        for (int j = 0; j <= 100; j++) {
            linkedList = new LinkedList<>();

            for (int i = 0; i <= 100000; i++) {
                linkedList.add(i, 193);

            }
            double startTime = System.currentTimeMillis();
            linkedList.contains(10);

            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

}
