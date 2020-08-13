import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;

class PossibleWordFromPhoneDigit {
     static String str[]={ " " , " " ,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenth of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " digits present in the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<String> res=possibleWords(arr, n);

        System.out.println("\n\n Result :");
        for (String string : res) {
            System.out.print(string+" ");
        }
    }


    public static ArrayList<String> possibleWords(int a[], int N) {

        ArrayList<String> possibleWord=new ArrayList<String>();

        StringBuffer msg=new StringBuffer();

        getResults(0,a,msg,possibleWord);

        return possibleWord;
        
    }

    public  static void getResults(int index, int arr[], StringBuffer msg, ArrayList<String>possibleWord) {

        if(index==arr.length){

            possibleWord.add(msg.toString());
            System.out.println("Inside of the result mathod, the output is: "+ msg);
            return;
        }
        
        for(int i=0;i<str[arr[index]].length();i++){

            msg.append(str[arr[index]].charAt(i));
            getResults(index+1, arr, msg, possibleWord);
            msg.deleteCharAt(index);
        }
    }

}