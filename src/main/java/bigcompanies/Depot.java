/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigcompanies;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Depot {
//    Product p;

    ArrayList<Product> products;
    ArrayList<Product> nativeProducts = new ArrayList<>();
    ArrayList<String> ExternalProducts1;
    ArrayList<String> ExternalProducts2;
    int cash, stockNP, stockEP1, stockEP2;
//    String companyId;

    public Depot(String companyId, int depotId) {
//        this.companyId = companyId;
//        this.depotId = depotId;
//        this.depotId = depotId;
        cash = randomThisGuy(50, 100);
        System.out.println("Cash: " + cash);
        stockNP = randomThisGuy(15, 50);        //limit of stock for native products
        System.out.println("Stock Native Prod.: " + stockNP);
        stockEP1 = randomThisGuy(3, 40);        //limit of stock for external products company 1*
        System.out.println("Stock External Prod.1: " + stockEP1);
        stockEP2 = randomThisGuy(3, 40);        //limit of stock for external products company 2*
        System.out.println("Stock External Prod.2: " + stockEP2);

        createNativeProdList(stockNP, depotId, companyId);
    }

    private int randomThisGuy(int i, int ii) {
        int min = i;
        int max = ii;
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
//        System.out.println("Random: " + random);

        return random;
    }

//    public String getCompanyId() {
//        return companyId;
//    }
    private void createNativeProdList(int stockNP, int depotId, String companyId) {
        System.out.println("Native Products List:");

        for (int i = 0; i < stockNP; i++) {
            int productId = 0;
            productId = checkIfIsEmpty(productId);

            String product = null;
            product = checkCompany(product, companyId);

//            System.out.println(productId + " " + product);
            Product p = new Product(depotId, companyId, productId, product);
            nativeProducts.add(p);
            System.out.println(p.toString());
        }
    }

    private int checkIfIsEmpty(int productId) {
        if (nativeProducts.isEmpty()) {
            productId = 1;
        } else {
            productId = nativeProducts.size() + 1;
        }

        return productId;
    }

    private String checkCompany(String product, String companyId) {

        if (companyId.equalsIgnoreCase("BigA")) {
            product = "Gold";
        } else if (companyId.equalsIgnoreCase("BigB")) {
            product = "Silver";
        } else {
            product = "Copper";
        }

        return product;
    }

}
