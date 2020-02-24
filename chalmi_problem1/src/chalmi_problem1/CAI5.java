package chalmi_problem1;

import java.util.Random;
import java.util.Scanner;

public class CAI5 {
public static Scanner sc = new Scanner(System.in);
static int rand_num1;
static int rand_num2;
static int student_ans;

static int difficulty_Level = 1;
static int digitRange = 10;

static int arthmicType = 1;






public static void main(String[] args) {


boolean shouldAsknext = false;



/*create instance of Random class and generate
two positive integers that are of single digits.
*/

do {

int checkNum = 9;
double howMuchRight = 0 ;

System.out.println("Which difficulty? 1 - 4");
String ans = sc.nextLine();
difficulty_Level = Integer.parseInt(ans);


System.out.printf("Which type of arthmic promblem would you like? 1-5");
String ansAth = sc.nextLine();
arthmicType = Integer.parseInt(ansAth);


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
System.out.printf("Your score: " + score + " Congratulations, you are ready to go to the next level \n" );

}
else{
System.out.printf("Your score: " + score + " Please ask your teacher for extra help /n " );

}

checkNum = 9;
howMuchRight = 0;
System.out.printf("Do you want to be asked another 10 questions Type Y - for yes N - for no");
String ansRedo = sc.nextLine();
//asks the user is they would like to retake the test
if(ansRedo.compareToIgnoreCase("Y") == 0){shouldAsknext = true;}
if(ansRedo.compareToIgnoreCase("N") == 0){shouldAsknext = false;}



}while(shouldAsknext);

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
rand_num1 = rand.nextInt(digitRange);
rand_num2 = rand.nextInt(digitRange);
//print statement asking the user math question
askQuestion();
String ans = sc.nextLine();

try {
student_ans = Integer.parseInt(ans);
} catch (Exception c) {
System.out.print("wrong input " + c + "\n");
}
return student_ans;
}








public static int retakeQuiz() {

System.out.printf("\nHow much is " + rand_num1 + " times " + rand_num2 +  "\n" );
String ans = sc.nextLine();
try {
student_ans = Integer.parseInt(ans);

} catch (Exception e) {
System.out.print("Sorry invalid response " + e + "\n");
}

return student_ans;
}







public static void askQuestion() {
// modified the ask question method to pick which type of arithmetic problem they would like to be asked
if(arthmicType == 5)
{
Random rand = new Random();
arthmicType = rand.nextInt(5);
}

switch(arthmicType){
case 1:
System.out.printf("How much is " + rand_num1 + " plus " + rand_num2 +  "\n" );
break;
case 2:
System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );

break;
case 3:
System.out.printf("How much is " + rand_num1 + " minus " + rand_num2 +  "\n" );

break;
case 4:
Random rand = new Random();
rand_num2 = rand.nextInt(digitRange - 2) + 2;

System.out.printf("How much is " + rand_num1 + " divided " + rand_num2 +  "\n" );

break;

default:
System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );

break;

}

}







public static String RanPos(){
Random rand = new Random();
rand_num1 = rand.nextInt(4);
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
rand_num1 = rand.nextInt(4);
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





public static void displayInorrectResponse() {
//System.out.printf(RanNeg());

}






public static void displayCorrectResponse(){
//System.out.print(RanPos());
}









public static boolean isAnswerCorrect() {

switch(arthmicType){
case 1:



if(student_ans != rand_num1+rand_num2) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}  




case 2:



if(student_ans != rand_num1*rand_num2) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}


case 3:



if(student_ans != rand_num1-rand_num2) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}




case 4:



if(student_ans != rand_num1/rand_num2) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}






default:


if(student_ans != rand_num1*rand_num2) {
displayInorrectResponse();
return false;
}
else {
displayCorrectResponse();
return true;
}



}



}

}