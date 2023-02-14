public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
       int arrayMax = arr[0]; //sets the first value of the array as max
       
       for(int i = 0; i < arr.length; i++){
        if(arr[i] > arrayMax){ //if value of current array index is greater than the current MAX, then arrayMax is updated to the current array index value
            arrayMax = arr[i];
        }
       }
       
       return arrayMax; //returns the array max value after finishing updates through the loop
     }
}
