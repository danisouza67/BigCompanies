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
public class CompanyBigB {

    private static final CompanyBigB instance = new CompanyBigB();

    private ArrayList<Depot> depot = null;
    private int depotId;
    private final String companyId;

    private CompanyBigB() {
        
        System.out.println("\n\n\nWelcome to Big Company B!!");
        companyId = "BigB";

        depot = new ArrayList<>();

        if (depot.isEmpty()) {
            depotId = 1;
        } else {
            depotId = depot.size() + 1;
        }
        
        for (int i = 1; i < 51; i++) {
            System.out.println("\nDepot BigB: " + i);
            depot.add(new Depot(companyId, depotId));
            depotId++;
        }
    }

    public static CompanyBigB getInstance() {

        return instance;
    }

}
