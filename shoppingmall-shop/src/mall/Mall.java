package mall;

import shop.Shop;

public class Mall {
    Shop[] shops = new Shop[13];
    int index;

    public boolean addShop(Shop shop) {
        boolean isShopAdded = false;
        if (shop != null) {
            shops[index++] = shop;
            isShopAdded = true;
        } else {
            System.out.println("Invalid Shop details");
        }
        return isShopAdded;
    }

    public void getShopDetails() {
        System.out.println("list of shops are");
        for (Shop shop : shops) {
            System.out.println("shop name  is: " + shop.getShopName());
            System.out.println("shop id is:" + shop.getShopId());
            System.out.println("shop location is:" + shop.getLocation());
            System.out.println("shop owner is:" + shop.getShopOwner());
            System.out.println("mall name is:" + shop.getMallName());
            System.out.println("-----------------------------------");
        }
    }
}
