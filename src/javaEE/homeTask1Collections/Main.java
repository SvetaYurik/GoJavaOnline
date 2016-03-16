package javaEE.homeTask1Collections;

public class Main {
    public static void main(String[] args) {
        CollectionEfficiencyArrayList arrayList = new CollectionEfficiencyArrayList();
        CollectionEfficiencyLinkedList linkedList = new CollectionEfficiencyLinkedList();
        CollectionEfficiencyHashSet hashSet = new CollectionEfficiencyHashSet();
        CollectionEfficiencyTreeSet treeSet = new CollectionEfficiencyTreeSet();

        System.out.println("        " + "ArrL " + "LinL " + "HasS " + "TreS ");
        System.out.println("Add     " + arrayList.timeSpentAdd() + " |" + linkedList.timeSpentAdd() + " |" + hashSet.timeSpentAdd() + " |" + treeSet.timeSpentAdd());
        System.out.println("Get     " + arrayList.timeSpentGet() + "  |" + linkedList.timeSpentGet() + " |" + hashSet.timeSpentGet() + "  |" + treeSet.timeSpentGet());
        System.out.println("Remove  " + arrayList.timeSpentRemove() + " |" + linkedList.timeSpentRemove() + " |" + hashSet.timeSpentRemove() + " |" + treeSet.timeSpentRemove());
        System.out.println("Contains" + arrayList.timeSpentContains() + " |" + linkedList.timeSpentContains() + " |" + "    " + " |" + "    ");

    }
}
