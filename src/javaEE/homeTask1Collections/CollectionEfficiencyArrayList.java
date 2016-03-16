package javaEE.homeTask1Collections;

import java.util.ArrayList;
import java.util.Random;


public class CollectionEfficiencyArrayList {
    ArrayList<Integer> arrayList;
    Random generator = new Random();


    public double timeSpentAdd() {
        ArrayList<Integer> arrayList;
        double timeSpent = 0;

        for (int j = 0; j <= 100; j++) {
            arrayList = new ArrayList();

            double startTime = System.currentTimeMillis();

            for (int i = 0; i <= 100000; i++) {
                arrayList.add(i, 193);
            }
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentGet() {
        double timeSpent = 0;
        ArrayList<Integer> arrayList;

        for (int j = 0; j <= 100; j++) {
            arrayList = new ArrayList();


            for (int i = 0; i <= 100000; i++) {
                arrayList.add(i, 193);
            }
            double startTime = System.currentTimeMillis();
            arrayList.get(9999);
            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentRemove() {
        double timeSpent = 0;
        ArrayList<Integer> arrayList = null;

        for (int j = 0; j <= 100; j++) {
            arrayList = new ArrayList();

            for (int i = 0; i <= 100000; i++) {
                arrayList.add(i, 193);

            }
            double startTime = System.currentTimeMillis();
            arrayList.remove(9);

            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }

    public double timeSpentContains() {
        double timeSpent = 0;
        ArrayList<Integer> arrayList = null;

        for (int j = 0; j <= 100; j++) {
            arrayList = new ArrayList();

            for (int i = 0; i <= 100000; i++) {
                arrayList.add(i, 193);

            }
            double startTime = System.currentTimeMillis();
            arrayList.contains(10);

            timeSpent += System.currentTimeMillis() - startTime;
        }
        timeSpent /= 100;
        return timeSpent;
    }


}
