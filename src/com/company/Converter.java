package com.company;




import java.util.TreeMap;

    public class Converter {
        TreeMap<Character, Integer> rom = new TreeMap<Character, Integer>();


        public Converter() {
            rom.put('I', 1);
            rom.put('V', 5);
            rom.put('X', 10);
            rom.put('L', 50);
            rom.put('C', 100);
            rom.put('D', 500);
            rom.put('M', 1000);




        }

        public boolean isRoman(String number){
            //"V"->'V'
            return rom.containsKey(number.charAt(0));
        }




    }

