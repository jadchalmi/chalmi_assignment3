package chalmi_problem1;

import java.util.Random;
import java.util.Scanner;

public class CAI3 {
public static Scanner sc = new Scanner(System.in);

static int randomNumberOne;

static int randomNumberTwo;

static int studentAnswer;





public static void main(String[] args) {

int checkNum = 9;
double howMuchRight = 0 ;
boolean shouldAskagain = false;




/*create instance of Random class and generate
        two positive integers that are of single digits.
*/

do {


do{
quiz();
if(isAnswerCorrect())
{
howMuchRight = howMuchRight + 1;
}
checkNum = checkNum - 1;


}while(checkNum >= 0);

double result = howMuchRight/10.00;
double score = result * 100;

if(score > 75){
System.out.println("Your score: " + score + " Congratulations, you are ready to go to the next level " );

}
else{
System.out.printf("Your score: " + score + "Please ask your teacher for extra help \n " );

}

checkNum = 9;
howMuchRight = 0;

System.out.println("Do you want to be asked another 10 questions Type Y - for yes N - for no");
String ansRedo = sc.nextLine();

if(ansRedo.compareToIgnoreCase("Y") == 0){shouldAskagain = true;}
if(ansRedo.compareToIgnoreCase("N") == 0){shouldAskagain = false;}


}while(shouldAskagain);

}




public static int quiz() {
Random random = new Random();
randomNumberOne = random.nextInt(10);
randomNumberTwo = random.nextInt(10);
//print statement asking the user math question
askQuestion();
String ans = sc.nextLine();

try {
studentAnswer = Integer.parseInt(ans);
} catch (Exception c) {
System.out.print("Sorry invalid response " + c + "\n");
}
return studentAnswer;
}








public static int retakeQuiz() {

System.out.printf("\nHow much is " + randomNumberOne + " times " + randomNumberTwo +  "\n" );
String ans = sc.nextLine();
try {
studentAnswer = Integer.parseInt(ans);

} catch (Exception e) {
System.out.print("Sorry invalid response " + e + "\n");
}

return studentAnswer;
}







public static void askQuestion() {



System.out.printf("How much is " + randomNumberOne + " times " + randomNumberTwo +  "\n" );
}







public static String RanPos(){
Random rand = new Random();
int rand_num1 = rand.nextInt(4);
switch(rand_num1) {
case 0:
// code block
return "Very good!";
case 1:
// code block
return "Excellent!";
case 2:
return "Nice Work!";
// code block
case 3:
return "Keep up the good work!";
// code block
default:
return "";
}

}







public static String RanNeg(){
Random rand = new Random();
int rand_num1 = rand.nextInt(4);
switch(rand_num1) {
case 0:
// code block
return "No, Please try again.";
case 1:
// code block
return "Wrong, Try once more.";
case 2:
return "Don't give up!";
// code block
case 3:
return "No, Keep trying.";
// code block
default:
return "";
}

}



public static boolean isAnswerCorrect() {
if(studentAnswer != randomNumberOne*randomNumberTwo) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}
}

public static void displayInorrectResponse() {
//System.out.printf(RanNeg());

}






public static void displayCorrectResponse(){
//System.out.print(RanPos());
}



}