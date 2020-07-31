import java.util.Scanner;

class WhoHasTheMajority {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enthe the size of array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the  array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int a=sc.nextInt();
            arr[i]=a;
        }

        System.out.println("X :");
        int x=sc.nextInt();

        System.out.println("Y :");
        int y=sc.nextInt();

        System.out.println("Output :");

        System.out.println(majorityWins(arr,sizeOfArray,x,y));
    }


    public static int majorityWins(int ar[],int n,int X,int Y){
        int count_x=0;
        int count_y=0;
      
        for(int i=0;i<n;i++){
            if(ar[i]==X){
                count_x++;
            }
        }

        for(int i=0;i<n;i++){
            if(ar[i]==Y){
                count_y++;
            }
        }

        if(count_x>count_y){
            return X;
        }

        if(count_x<count_y){
            return Y;
        }

        else{
            if(X<Y){
                return X;
            }

            else{
                return Y;
            }
        }

    }

   

    
}