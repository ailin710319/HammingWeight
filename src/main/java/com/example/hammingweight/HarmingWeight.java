package com.example.hammingweight;

public class HarmingWeight {
    int hammingWeight = 0;
    public int calculateHammingWeight(String number) {

if(number !=null) {

    for (int i = 0; i < number.length(); i++) {
        if (number.charAt(i) != 0) {
            hammingWeight++;
       }
    }
}
        return hammingWeight;
    }
}
