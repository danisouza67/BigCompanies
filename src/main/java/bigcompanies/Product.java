/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigcompanies;

/**
 *
 * @author Dani
 */
public class Product {

    private int price, delivery, depotId, productId;
    private String product, companyID;

    public Product(int depotId, String companyId, int productId, String product) {
        this.depotId = depotId;
        this.companyID = companyId;
        this.productId = productId;
        this.product = product;
        price = randomThisGuy(1, 10);
        delivery = randomThisGuy(1, 10);
        

    }

    private int randomThisGuy(int i, int ii) {
        int min = i;
        int max = ii;
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
//        System.out.println("Random: " + random);

        return random;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", delivery=" + delivery + ", depotId=" + depotId + ", productId=" + productId + ", product=" + product + ", companyID=" + companyID + '}';
    }

}
