package myapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class MapMain {
    
    public static void main(String[] args){

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wila");
        names.add("betty");

        Map<String, BankAccount> accts = new HashMap<>();
        
        for (String: n) {
            BankAccount acct = new BankAccount(n);
            accts.put(acct.getAccountID(), acct);
        }

        
        
        //BankAccount fred = new BankAccount("fred");
        //BankAccount barney = new BankAccount("barney");
        //BankAccount wilma = new BankAccount("wilma");
        //BankAccount betty = new BankAccount("betty");

        //create a simple map
        //Map<String, BankAccount> accts = new HashMap<>();
        //accts.put(fred.getAccountID(), fred);
        //accts.put(barney.getAccountID(), barney);
        //accts.put(wilma.getAccountID(), wilma);
        //accts.put(betty.getAccountID(), betty);

        System.out.printf("size: %d\n", accts.size());
        //System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountID()));
        System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

        Set<String> keys = accts.keySet();
        Collection<BankAccount> values = accts.values();
        
        BankAccount acct;
        for (String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name is %s\n", acctId, acct);




        }

    }

}