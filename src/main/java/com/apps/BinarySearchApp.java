package com.apps;

import com.example.BinarySearch;
import com.exceptions.CanNotFindNumber;
import com.exceptions.NotEvenANumber;

public class BinarySearchApp {
    public static void main(String[] args) {
        BinarySearch aSearch=new BinarySearch();
        aSearch.arraySort();
        String result=null;

        // CannotFindNumber  1
        result= BinarySearchApp.testSearch(aSearch,"20");
        System.out.println("Number not present in between  "+result);
        if(result.equals("NOTFOUND") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");

        //number less than min  2
        result= BinarySearchApp.testSearch(aSearch,"1");
        System.out.println("Number not found less than least number "+result);
        if(result.equals("NOTFOUND") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");

        // number is in the middle 3
        result= BinarySearchApp.testSearch(aSearch,"12");
        System.out.println("Number present case one  "+result);
        if(result.equals("4"))
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");
  //    number is greate than biggest number  4
        result= BinarySearchApp.testSearch(aSearch,"79");
        System.out.println("Not Found bigger than biggest number  "+result);
        if(result.equals("NOTFOUND") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");
        //number which is less than mid number 5
        result = BinarySearchApp.testSearch(aSearch,"9");
        System.out.println("test 5  "+result);
        if(result.equals("3") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");
        //  the number which is greater than mid number  6
        result= BinarySearchApp.testSearch(aSearch,"23");
        System.out.println("test 6  "+result);
        if(result.equals("6") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");
        // it is the last number  7
        result= BinarySearchApp.testSearch(aSearch,"63");
        System.out.println("test 7  "+result);
        if(result.equals("8") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");
        // found number  8
        /// it is the first number
        // it is the least number of the array
        result= BinarySearchApp.testSearch(aSearch,"2");
        System.out.println("test 8 "+result);
        if(result.equals("0") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");
        //not even a number  9
        result= BinarySearchApp.testSearch(aSearch,"number");
        System.out.println("test  9  "+result);
        if(result.equals("NOTANUMBER") )
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");

    }
private static String testSearch(BinarySearch aSearch,String number){
        String result;
        try {
            result=new Integer(aSearch.numberSearch(number)).toString();
        }catch (NotEvenANumber exp){
            result="NOTANUMBER";

        }catch (CanNotFindNumber exp){
            result="NOTFOUND";
        }
        return result;

        }

        }
