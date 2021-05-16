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
    private String metal, companyID;

    public Product(int depotId, String companyId, int productId, String product) {
        this.depotId = depotId;
        this.companyID = companyId;
        this.productId = productId;
        this.metal = product;
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
        return "Product{" + "price=" + price + ", delivery=" + delivery + ", depotId=" + depotId + ", productId=" + productId + ", metal=" + metal + ", companyID=" + companyID + '}';
    }

    public int getPrice() {
        return price;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getDepotId() {
        return depotId;
    }

    public int getProductId() {
        return productId;
    }

//    public String getProduct() {
//        return product;
//    }

    public String getCompanyID() {
        return companyID;
    }

}
