package com.glo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
   
    public static List<Integer> rotLeft(List<Integer> a, int d) {
    
        int rotations = d % a.size();

       
        List<Integer> rotated = new ArrayList<>();
       
        for (int i = rotations; i < a.size(); i++) {
       
            rotated.add(a.get(i));
        }
    
        for (int i = 0; i < rotations; i++) {
         
            rotated.add(a.get(i));
        }
    
        return rotated;
    }
}

