package shop;

import watch.Watch;

public class ShopRunner {
    public static void main(String[] args) {


        System.out.println("main started");


        Watch watch = new Watch();
        Watch watch1 = new Watch();
        Watch watch2 = new Watch();
        Watch watch3 = new Watch();
        Watch watch4 = new Watch();
        Watch watch5 = new Watch();
        Watch watch6 = new Watch();
        Watch watch7 = new Watch();
        Watch watch8 = new Watch();

        watch.setWatchName("Titan");
        watch.setWatchId(1);
        watch.setWatchPrice(20000);

        watch1.setWatchId(9);
        watch1.setWatchName("fastrack");
        watch1.setWatchPrice(7000);

        watch2.setWatchId(2);
        watch2.setWatchName("Fossil");
        watch2.setWatchPrice(15000);

        watch3.setWatchId(3);
        watch3.setWatchName("Rolex");
        watch3.setWatchPrice(500000);

        watch4.setWatchId(4);
        watch4.setWatchName("Casio");
        watch4.setWatchPrice(12000);

        watch5.setWatchId(5);
        watch5.setWatchName("Seiko");
        watch5.setWatchPrice(25000);

        watch6.setWatchId(6);
        watch6.setWatchName("Omega");
        watch6.setWatchPrice(300000);

        watch7.setWatchId(7);
        watch7.setWatchName("Hublot");
        watch7.setWatchPrice(700000);

        watch8.setWatchId(8);
        watch8.setWatchName("Tissot");
        watch8.setWatchPrice(18000);

        Shop shop = new Shop();
        shop.addWatch(watch);
        shop.addWatch(watch1);
        shop.addWatch(watch2);
        shop.addWatch(watch3);
        shop.addWatch(watch4);
        shop.addWatch(watch5);
        shop.addWatch(watch6);
        shop.addWatch(watch7);
        shop.addWatch(watch8);

        shop.getWatchDetails();

        System.out.println("main ended");
    }
}
