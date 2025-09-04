package mall;

import shop.Shop;

public class MallRunner {
public static void main(String[] args){
    System.out.println("main started");

    Shop shop = new Shop();
    Shop shop1 = new Shop();
    Shop shop2 = new Shop();
    Shop shop3 = new Shop();
    Shop shop4 = new Shop();
    Shop shop5 = new Shop();
    Shop shop6 = new Shop();
    Shop shop7 = new Shop();
    Shop shop8 = new Shop();
    Shop shop9 = new Shop();
    Shop shop10 = new Shop();
    Shop shop11 = new Shop();
    Shop shop12 = new Shop();

    shop.setShopName("Trendy Fashions");
    shop.setShopId(101);
    shop.setLocation("MG Road, Bangalore");
    shop.setShopOwner("Ramesh Kumar");
    shop.setMallName("Phoenix Marketcity");

    shop1.setShopName("Trendy Fashions");
    shop1.setShopId(101);
    shop1.setLocation("MG Road, Bangalore");
    shop1.setShopOwner("Ramesh Kumar");
    shop1.setMallName("Phoenix Marketcity");

    shop2.setShopName("Tech World");
    shop2.setShopId(102);
    shop2.setLocation("Brigade Road, Bangalore");
    shop2.setShopOwner("Anita Sharma");
    shop2.setMallName("Orion Mall");

    shop3.setShopName("Fresh Mart");
    shop3.setShopId(103);
    shop3.setLocation("Jayanagar, Bangalore");
    shop3.setShopOwner("Suresh Reddy");
    shop3.setMallName("Forum Mall");

    shop4.setShopName("Book Haven");
    shop4.setShopId(104);
    shop4.setLocation("Whitefield, Bangalore");
    shop4.setShopOwner("Meera Iyer");
    shop4.setMallName("VR Mall");

    shop5.setShopName("Gadget Galaxy");
    shop5.setShopId(105);
    shop5.setLocation("Koramangala, Bangalore");
    shop5.setShopOwner("Vikram Singh");
    shop5.setMallName("Garuda Mall");

    shop6.setShopName("Style Hub");
    shop6.setShopId(106);
    shop6.setLocation("Indiranagar, Bangalore");
    shop6.setShopOwner("Priya Nair");
    shop6.setMallName("Mantri Square");

    shop7.setShopName("Home Essentials");
    shop7.setShopId(107);
    shop7.setLocation("HSR Layout, Bangalore");
    shop7.setShopOwner("Rohit Mehta");
    shop7.setMallName("Royal Meenakshi Mall");

    shop8.setShopName("Sporty Life");
    shop8.setShopId(108);
    shop8.setLocation("Banashankari, Bangalore");
    shop8.setShopOwner("Kavita Joshi");
    shop8.setMallName("GT World Mall");

    shop9.setShopName("Jewels & Gems");
    shop9.setShopId(109);
    shop9.setLocation("Malleshwaram, Bangalore");
    shop9.setShopOwner("Sameer Khan");
    shop9.setMallName("Mantri Square");

    shop10.setShopName("Food Fiesta");
    shop10.setShopId(110);
    shop10.setLocation("Hebbal, Bangalore");
    shop10.setShopOwner("Neha Verma");
    shop10.setMallName("Elements Mall");

    shop11.setShopName("Kids World");
    shop11.setShopId(111);
    shop11.setLocation("Rajajinagar, Bangalore");
    shop11.setShopOwner("Arun Prakash");
    shop11.setMallName("Orion Mall");

    shop12.setShopName("Sporty Life");
    shop12.setShopId(108);
    shop12.setLocation("Banashankari, Bangalore");
    shop12.setShopOwner("Kavita Joshi");
    shop12.setMallName("GT World Mall");


    Mall mall = new Mall();
    mall.addShop(shop);
    mall.addShop(shop1);
    mall.addShop(shop2);
    mall.addShop(shop3);
    mall.addShop(shop4);
    mall.addShop(shop5);
    mall.addShop(shop6);
    mall.addShop(shop7);
    mall.addShop(shop8);
    mall.addShop(shop9);
    mall.addShop(shop10);
    mall.addShop(shop11);
mall.addShop(shop12);

    mall.getShopDetails();
    System.out.println("main ended");
}
}
