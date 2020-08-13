import javax.swing.JOptionPane;

class TOHStackOverflow {

    //open class

    public void Answer(int numOfDisks, String Peg1, String Peg2, String Peg3, int Moves)
    {//open public void Answer

        Moves++;

        if (numOfDisks == 1)
        {//open if

            //Moves++;      
            System.out.println("\nNumber of Moves so far: " + Moves + "\nMove disk on Peg " + Peg1 + " to Peg " + Peg3);

        }//close if

        else
        {//open else

            //Moves++;
            Answer(numOfDisks - 1, Peg1, Peg3, Peg2, Moves);
            System.out.println("\nNumber of Moves so far: " + Moves + "\nMove disk on Peg " + Peg1 + " to Peg " + Peg3);
            //Moves++;
            Answer(numOfDisks - 1, Peg2, Peg1, Peg3, Moves);

         }//close else
    

    }//close public void Answer

    public static void main (String[]args)
    {//open main

        TOHStackOverflow TOH = new TOHStackOverflow();
        String numOfDisks = JOptionPane.showInputDialog(null, "Enter a number!");
        int NumberOfDisks = Integer.parseInt(numOfDisks);
        System.out.println("\nNumber of disks chosen: " + NumberOfDisks);
        int Moves = 0;
        TOH.Answer(NumberOfDisks, "1", "2", "3", Moves);

    }//close main

}//close TowerOfHanoi class

    