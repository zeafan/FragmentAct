package com.example.mohamedg.fragmentact;
public class Customer {
    public String Name;
    public String LatinName;
    public String BarCode;
    public String Notes;
    public Customer() {
        Name = "";
        LatinName = "";
        BarCode = "";
        Notes = "";
    }

    public Customer(String name, String latinName, String barCode, String notes) {
        Name = name;
        LatinName = latinName;
        BarCode = barCode;
        Notes = notes;
    }
}
