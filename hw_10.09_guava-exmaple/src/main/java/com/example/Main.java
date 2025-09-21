package com.example;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

class Main
{
    public static void main(String[] args)
    {
        LinkedListMultimap<String, String> productCategories = LinkedListMultimap.create();

        productCategories.put("Electronics", "Phone");
        productCategories.put("Electronics", "Laptop");
        productCategories.put("Electronics", "Tablet");
        productCategories.put("Accessories", "Headphones");
        productCategories.put("Accessories", "Charger");

        for (String category : productCategories.keySet())
        {
            System.out.println(category + ":");
            for (String product : productCategories.get(category))
            {
                System.out.println(" - " + product);
            }
        }

        System.out.println("\nAll entries in insertion order:");
        for (Multimap.Entry<String, String> entry : productCategories.entries())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
