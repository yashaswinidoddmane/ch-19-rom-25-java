package shop;

import watch.Watch;

public class Shop {
    Watch[] watches= new Watch[9];
    int index;

    public boolean addWatch(Watch watch) {
        boolean isWatchAdded = false;
        if (watch != null) {
            watches[index++] = watch;
            isWatchAdded = true;
        } else {
            System.out.println("Invalid Watch details");
        }
        return isWatchAdded;
    }
    public void getWatchDetails(){
        System.out.println("list of watches are");
        for(Watch watch: watches){
            System.out.println("Watch name is:"+ watch.getWatchName());
            System.out.println("Watch Id is:"+ watch.getWatchId());
            System.out.println("Watch price is:"+ watch.getWatchPrice());
            System.out.println("------------------------------------");
        }
    }


}
