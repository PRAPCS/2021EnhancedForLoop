class Main {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};

    //Keeps track of location and you are able to modify it.
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }

    //Enhanced For-Loop - cycle through the whole array - cannot modify the array
    int max = 0;
    for(int x:arr){
      //System.out.println(x);
      if(x>max)
      max = x;
    }

    System.out.println("The max is: "+max);
  


  }
}