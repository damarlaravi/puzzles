package com.lucky;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int value = in.nextInt();
            hashMap.put(value, name);
        }
        ArrayList<String> resultList = printMap(hashMap);
            if(resultList.size() > 0){
                for(int i = 0; i< resultList.size(); i++) {
                if( i == 0)
                    continue;
                else {
                    String[] prev = (resultList.get(i - 1).toString()).split("=");
                    String[] current = (resultList.get(i).toString()).split("=");
                    int prevNumber = Integer.parseInt(prev[0]);
                    int currentNumber = Integer.parseInt(current[0]);
                    //String.out.println(" fadf "+ prevNumber)
                    if(prevNumber < currentNumber){
                        System.out.print(prev[1].toString());
                    } else {
                        System.out.print(current[1].toString());
                    }
                }
            }
        } else {
             System.out.println("-1");
        }
        
        in.close();
    }
    
    public static ArrayList<String> printMap(Map<Integer, String> mp) {
        ArrayList<String> addedList = new ArrayList<String>();
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            
            if (pair.getValue()!= null && String.valueOf(pair.getKey()).contains("4") && String.valueOf(pair.getKey()).contains("7")){
                //System.out.println(pair.getKey() + " = " + pair.getValue());
                addedList.add(pair.getKey() + "=" + pair.getValue());
            }

            it.remove(); // avoids a ConcurrentModificationException
        }
        
        return addedList;
    }
    
}
