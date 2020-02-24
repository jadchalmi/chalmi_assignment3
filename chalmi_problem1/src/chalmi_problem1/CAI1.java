package chalmi_problem1;


import java.util.Random;
import java.util.Scanner;

public class CAI1 {
public static Scanner pc = new Scanner(System.in);

static int randomNumberOne;

static int randomNumberTwo;

static int StudentAnswer;



public static void main(String[] args) {




// calls the quiz & isAnswerCorrect methods
do {
quiz();
isAnswerCorrect();
}while(false);

}
   
public static int quiz() {
   // creates variable rand from random object and using nextInt function create random values for the random number one & two
Random random = new Random();
randomNumberOne = random.nextInt(10);
randomNumberTwo = random.nextInt(10);
// asks user question
askQuestion();
String ans = pc.nextLine();
// try's to catch invalid response from user
try {
StudentAnswer = Integer.parseInt(ans);
} catch (Exception c) {
System.out.print("Sorry invalid response" + c + "\n");
}
return StudentAnswer;
}


public static int retakeQuiz() {
// asks the user to re-take the same problem if student is wrong
System.out.printf("\n What is " + randomNumberOne + " times " + randomNumberTwo +  "\n" );
String ans = pc.nextLine();
try {
StudentAnswer = Integer.parseInt(ans);

} catch (Exception e) {
System.out.print("Sorry invalid response " + e + "\n");
}

return StudentAnswer;
}
public static void askQuestion() {



System.out.printf("What is " + randomNumberOne + " times " + randomNumberTwo +  "\n" );
}


// displays incorrect and correct responses, also loops incorrect response if student is wrong
public static void displayInorrectResponse() {
do{
System.out.printf("No. Please try again.");
retakeQuiz();

}while(StudentAnswer != randomNumberOne*randomNumberTwo);
System.out.println("Very good. ");
}

public static void displayCorrectResponse(){
System.out.print("Very good.\n ");
}
// checks to see is answer student inputed is correct
public static void isAnswerCorrect() {
if(StudentAnswer != randomNumberOne*randomNumberTwo) {
displayInorrectResponse();
}
else {
displayCorrectResponse();
}
}

}