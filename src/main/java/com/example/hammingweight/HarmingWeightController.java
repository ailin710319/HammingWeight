package com.example.hammingweight;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
public class HarmingWeightController {

    HarmingWeight a=new HarmingWeight();
    @RequestMapping("/api/hamming")
    public int harmingstring(String string){
        return a.calculateHammingWeight(string);
    }
}



