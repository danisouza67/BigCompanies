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
public class CompanyBigC {

    private static final CompanyBigC instance = new CompanyBigC();

    private ArrayList<Depot> depot = null;
    private int depotId;
    private final String companyId;
    
    private CompanyBigC() { 
        
        System.out.println("\n\n\nWelcome to Big Company B!!");
        companyId = "BigC";

        depot = new ArrayList<>();

        if (depot.isEmpty()) {
            depotId = 1;
        } else {
            depotId = depot.size() + 1;
        }
        
        for (int i = 1; i < 51; i++) {
            System.out.println("\nDepot BigC: " + i);
            depot.add(new Depot(companyId, depotId));
            depotId++;
        }
    }

    public static CompanyBigC getInstance() {

        return instance;
    }

}
