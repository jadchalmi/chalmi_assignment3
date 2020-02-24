package chalmi_problem1;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
public static Scanner sc = new Scanner(System.in);

static int randomNumberOne;

static int studentAnswer;

static int randomNumberTwo;



public static void main(String[] args) {



do {
quiz();
isAnswerCorrect();
}while(false);

}

public static int quiz() {
Random rand = new Random();
randomNumberOne = rand.nextInt(10);
randomNumberTwo = rand.nextInt(10);

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

public static void displayInorrectResponse() {
do{
System.out.printf(RanNeg());
retakeQuiz();

}while(studentAnswer != randomNumberOne*randomNumberTwo);
System.out.println(RanPos());
}
public static void displayCorrectResponse(){
System.out.print(RanPos());
}
public static void isAnswerCorrect() {
if(studentAnswer != randomNumberOne*randomNumberTwo) {
displayInorrectResponse();
}
else {
displayCorrectResponse();
}
}

}
