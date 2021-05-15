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
public class CompanyBigA {

    private static final CompanyBigA instance = new CompanyBigA();

    private ArrayList<Depot> depot = null;
    private int depotId;
    private final String companyId;

    private CompanyBigA() {
        
        System.out.println("Welcome to Big Company A!!");
        companyId = "BigA";

        depot = new ArrayList<>();

        if (depot.isEmpty()) {
            depotId = 1;
        } else {
            depotId = depot.size() + 1;
        }
        
        for (int i = 1; i < 51; i++) {
            System.out.println("\nDepot BigA: " + i);
            depot.add(new Depot(companyId, depotId));
            depotId++;
        }
    }

    public static CompanyBigA getInstance() {

        return instance;
    }

    void goShopping() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
