

import java.util.Arrays;



class Main {
  public static void main(String[] args) {
    //Given an input of an int[] arr and int sum, 
    // return true if there is a pair of numbers within arr
    // with the sum equal to our sum input
    // otherwise return false
    //Elements/ints can repeat with in the array
    
    //Brute force
    // Have 2 for-loops for scanning every possible pair 
    //Cons
    // This is not efficient with a runtime of O(n^2)
    //Implementation

    int[] arr = {3, 3, 6, 7, 9};
    int sum = 8;
    System.out.println("Checking if array contains a pair with the sum of " + sum);
    System.out.println(checkArrayContainsSum2(arr, sum));
  }

  //O(n^2) TOO SLOWWW
  static boolean checkArrayContainsSum(int[] arr, int sum){
    for (int i = 0; i < arr.length - 1; i++){
      for (int j = i+1; j < arr.length; j++){ 
        int ans = arr[i] + arr[j];
        System.out.println("arr["+i+"]:"+ arr[i] + " + arr["+j+"]:" + arr[j] + " = " + ans);
        if(ans == sum){
          System.out.println("Answer: ");
          return true;
        }
      }
    }
    System.out.println("Answer:");
    return false;
  }

  static boolean checkArrayContainsSum2(int[] arr, int sum){
    // search for the compliment of the number at index i
    for (int i = 0; i < arr.length && arr[i] < sum;i++){
      int compliment = sum - arr[i];
      System.out.println("arr["+i+"]:"+ arr[i] );
      System.out.println("Compliment:"+ compliment);
      if (Arrays.binarySearch(arr, compliment) > 0){
        System.out.println("Answer:");
        return true;
      }
    }
    System.out.println("Answer:");
    return false; 
  }

  
}