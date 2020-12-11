import java.util.Scanner;

class IntersectionOfTwoSortedArrayNaiveSoln {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the 1st array : ");
        int n=sc.nextInt();
        System.out.println("Enter the 1st array : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            a[i]=x;
        }

        System.out.println("Enter the length of the 2nd array : ");
        int m=sc.nextInt();
        System.out.println("Enter the 2nd array : ");
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            b[i]=x;
        }

        sc.close();

        System.out.println("Output : ");
        getResult(a, b, n, m);
    }

    public static void getResult(int a[],int b[], int n,int m){

        for(int i=0;i<n;i++){
            
            //To avoid dublicate element present in same array.
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }

            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                
                }
            }
        }

    }
}
