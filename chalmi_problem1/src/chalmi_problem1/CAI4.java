package chalmi_problem1;

import java.util.Random;
import java.util.Scanner;

public class CAI4 {
public static Scanner sc = new Scanner(System.in);
static int randomNumberOne;
static int randomNumberTwo;
static int studentAnswer;

static int difficulty_Level = 1;
static int digitRange = 10;





public static void main(String[] args) {


boolean shouldAskagain = false;


/*create instance of Random class and generate
two positive integers that are of single digits.
*/

do {
int checkNum = 9;
double howManyRight = 0 ;

System.out.println("Which difficulty? 1 - 4");
String ans = sc.nextLine();
difficulty_Level = Integer.parseInt(ans);


do{
quiz();
if(isAnswerCorrect())
{
howManyRight = howManyRight + 1;
}
checkNum = checkNum - 1;


}while(checkNum >= 0);

double result = howManyRight/10.00;
double score = result * 100;


if(score > 75){
System.out.printf("Your score: " + score + " Congratulations, you are ready to go to the next level \n" );

}
else{
System.out.printf("Your score: " + score + " Please ask your teacher for extra help /n " );

}

checkNum = 9;
howManyRight = 0;
System.out.println("Do you want to be asked another 10 questions Type Y - for yes N - for no");
String ansRedo = sc.nextLine();


if(ansRedo.compareToIgnoreCase("Y") == 0){shouldAskagain = true;}
if(ansRedo.compareToIgnoreCase("N") == 0){shouldAskagain = false;}


}while(shouldAskagain);

}




public static int quiz() {
switch(difficulty_Level){
case 1:
digitRange = 10;
break;
case 2:
digitRange = 100;

break;
case 3:
digitRange = 1000;

break;
case 4:
digitRange = 10000;

break;
default:
digitRange = 10;
break;

}
Random rand = new Random();
randomNumberOne = rand.nextInt(digitRange);
randomNumberTwo = rand.nextInt(digitRange);
//print statement asking the user math question
askQuestion();
String ans = sc.nextLine();

try {
studentAnswer = Integer.parseInt(ans);
} catch (Exception c) {
System.out.print("Sorry invalid response" + c + "\n");
}
return studentAnswer;
}








public static int retakeQuiz() {

System.out.printf("\nHow much is " + randomNumberOne + " times " + randomNumberTwo +  "\n" );
String ans = sc.nextLine();
try {
studentAnswer = Integer.parseInt(ans);

} catch (Exception e) {
System.out.print("Sorry invalid response" + e + "\n");
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
// response 1
return "Very good!";
case 1:
// response 2
return "Excellent!";
case 2:
return "Nice Work!";
// response 3
case 3:
return "Keep up the good work!";
// response 4
default:
return "";
}

}







public static String RanNeg(){
Random rand = new Random();
int rand_num1 = rand.nextInt(4);
switch(rand_num1) {
case 0:
// response 1
return "No, Please try again.";
case 1:
// response 2
return "Wrong, Try once more.";
case 2:
return "Don't give up!";
// response 3
case 3:
return "No, Keep trying.";
// response 4
default:
return "";
}

}





public static void displayInorrectResponse() {
//System.out.printf(RanNeg());

}






public static void displayCorrectResponse(){
//System.out.print(RanPos());
}









public static boolean isAnswerCorrect() {
if(randomNumberOne*randomNumberTwo!= studentAnswer ) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}
}

}