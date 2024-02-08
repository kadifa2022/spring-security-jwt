package com.cydeo.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueURLsPerCustomer {


    public static void main(String[] args) {
            // Define customer ID list
            Set<String> customerIDList = new HashSet<>();
            customerIDList.add("12345");
            customerIDList.add("34567");
            customerIDList.add("87654");

            // Define a map to store unique URLs visited by each customer
            Map<String, Set<String>> customerURLs = new HashMap<>();

            // Read the log file
            try (BufferedReader br = new BufferedReader(new FileReader("logfile.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Split the line into timestamp, URL, and customer ID
                    String[] parts = line.split(", ");
                    String customerID = parts[2];
                    String url = parts[1];

                    // Add URL to the set of URLs for this customer
                    customerURLs.computeIfAbsent(customerID, k -> new HashSet<>()).add(url);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Print the count of unique URLs for each customer
            for (String customerID : customerIDList) {
                int uniqueURLs = customerURLs.getOrDefault(customerID, new HashSet<>()).size();
                System.out.println(customerID + ", " + uniqueURLs);
            }
        }
    }

