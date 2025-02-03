// Chapter 6 Game Zone exercise

import javax.swing.JOptionPane;
public class RandomGuess
{
public static void main(String[] args)
{
  // Variables and objects
  final int LOW = 1;
  final int HIGH = 10;
  int magicNumber = (int) Math.random() * HIGH + LOW;
  int userGuess;
  int attempts = 1;
  String msg;
// System.out.println(magicNumber);
//Input phase
userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH));  // reads non integer data and puts it into a integer

//Processing phase
while(userGuess != magicNumber) // != not equal to
{
if(userGuess > magicNumber)
{
 msg = "Sorry your guess was too high!";

} else
{
 msg = "Sorry your guess was too low!";
}
userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + " and " + HIGH));  // reads non integer data and puts it into a integer
attempts += 1;  // increment the attempts variable before the guess is checked again



}
// Output phase
    JOptionPane.showMessageDialog(null, "YOU WON \nThe magic number was: " + magicNumber + "\nThe amount of times you've tried is " + attempts);

}

}