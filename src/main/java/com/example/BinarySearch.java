package com.example;

import com.exceptions.CanNotFindNumber;
import com.exceptions.NotEvenANumber;

public class BinarySearch {
    int[] numbers={9,7,18,5,23,12,2,63, 45};
//    int [] numbers = {7, 9, 15, 19};2,5,7,9,12,18,23,45,63
//    int [] numbers = {7, 9, 15, 19, 25};
    int[] sortedArray=new int[numbers.length];
    int temp,i,j;
    public void arraySort(){
       for ( i=0;i<numbers.length;i++){
          for ( j=0;j<numbers.length-1;j++){
             if(numbers[j]>numbers[j+1]) {
                 temp = numbers[j];
                 numbers[j] = numbers[j + 1];
                 numbers[j + 1] = temp;
             }
          }
       }
//       for (i=0;i<numbers.length;i++){
//          System.out.println("now the array is sorted :"+numbers[i]);
//       }
       for (i=0;i<numbers.length;i++){
          sortedArray[i]=numbers[i];
//          System.out.println("the sorted array is : "+sortedArray[i]);
       }
    }
    public int numberSearch(String number) throws NotEvenANumber, CanNotFindNumber {
        int searchNumber;
        int low=0;
        //int index=-1;
        int high=sortedArray.length-1;
        int mid=(low+high)/2;

        try{
            searchNumber=Integer.parseInt(number);
        }catch(NumberFormatException exp){
            throw new NotEvenANumber();
        }

        while (low<=high) {
            if (sortedArray[mid] == searchNumber) {
               // System.out.println("element is at " + mid + " index position");
                return mid;
                //break;
            } else if (sortedArray[mid] < searchNumber) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        if(low>high) {

                throw new CanNotFindNumber();
            }
        return -1;
    }
}

