import java.util.Scanner;

class FrequencyInSortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int ar[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            ar[i]=x;
        } 

        System.out.println("Output :");
        printFreq(ar);
    

    
}

public static void printFreq(int arr[]){

    int freq=1;                              //because we have consider that index 0 element hass already proccessed
    int i=0;                                 //2nd element of array.

     
        for(i=1;i<arr.length;i++){

            if(arr[i]==arr[i-1]){
                freq++;

                if(i==arr.length-1){
                
                    System.out.println(arr[i-1]+" freq "+freq);
                }
    
    
            }

        
            else{
                System.out.println(arr[i-1]+" freq "+freq);

                freq=1;

            }


        }
     

     
}

}