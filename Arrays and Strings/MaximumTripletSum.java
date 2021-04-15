package triplets;
import java.util.*;
import java.io.*; 
import java.math.*; 
  
public class Sum { 
  
    // Function to calculate maximum triplet sum 
    static int maxTripletSum(int arr[], int n) 
    { 
        
    	int cnt = 0; 
    	  
        for(int i = 0; i < n; i++)
        {	
           for(int j = i + 1; j < n; j++) 
           {   
              for(int k = j + 1; k < n; k++) 
              {      
                 // If it satisfy the 
                 // given conditions 
                 
            	  if (arr[i] < arr[j] &&  
                     arr[j] < arr[k]) 
                 { 
                     System.out.println(arr[i]+" "+arr[j]+" "+arr[k]); 
                 } 
              }    
           }	
        }
       
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 2, 5, 3, 1, 4, 9 }; 
        int n = arr.length; 
        System.out.println(maxTripletSum(arr, n)); 
    } 
} 
