package operatorVariables_02;

import java.util.Scanner;

public class VariablesAndOperators_03 {
    public static void main(String[] args) {
        //🔵 Arithmetic Operators (10 questions)
        //1. Write a program to add two numbers.

        int firstNum = 20;
        int secondNum = 30;

        int adding = firstNum + secondNum;
        System.out.println(adding);

        //2. Write a program to subtract two numbers.

        int  subtract = firstNum - secondNum;
        System.out.println(subtract);

        //3. Write a program to multiply two numbers.

        int multiply = firstNum * secondNum;
        System.out.println(multiply);

        //4. Write a program to divide two numbers.

        int divide = firstNum / secondNum;
        System.out.println(divide);

        //5. Write a program to find the remainder of two numbers.

        int reminder = firstNum % secondNum;
        System.out.println(reminder);

        //6. Find the result of (45 + 78) - (34 * 2) using Java.

        int firstValue = 45;
        int secondValue = 78;
        int plus = firstValue + secondValue;

        int thirdValue = 34 ;
        int fourthValue = 2 ;
        int  multiple = thirdValue * fourthValue;

        int subtractingBoth = plus - multiple;
        System.out.println(subtractingBoth);

        //one more solution with optimized version
        int a = (45+78)-(34*2);
        System.out.println(a);

        //7. Calculate the average of three numbers.

        int one = 12;
        int two = 14;
        int three = 18;

        int sum = one + two + three;
        int average = sum / 3;
        System.out.println(average);

        //one more solution with optimized version
/*        int a = 12, b = 14 , c = 18;
        double average = (a+b+c)/3;
        System.out.println(average);*/


        //8. Write a program to calculate the area of a rectangle (length * breadth).

        int length = 45 , breadth = 50;

        int areaRectangle = length * breadth;
        System.out.println(areaRectangle);

          /*  int l = 45 , b = 50, area = l*b;
            System.out.println(area);*/

        //9. Write a program to calculate the simple interest.    S.I. = (P × R × T)/100

        int principle = 13, rate = 19,time = 40;

        int SI = (principle * rate * time)/100;
        System.out.println(SI);


        //10. Write a program to swap two numbers using a third variable.
        int elementOne = 12;
        int elementTwo = 18;

        // Swapping logic
        int elementThird = elementOne; // store elementOne value temporarily
        elementOne = elementTwo;        // assign elementTwo value to elementOne
        elementTwo = elementThird;      // assign old elementOne value to elementTwo


        //🔵 Assignment Operators (8 questions)

        //11. Write a program to add 10 to a number using += operator.

        int  ten = 20;
        ten += 10;
        System.out.println("After adding 10: " + ten);


        //12. Write a program to subtract 5 from a number using -= operator.

        short subtractingFive = 10;
        subtractingFive -= 5;
        System.out.println("After subtract five" + subtractingFive);


        //13. Multiply a number by 3 using *= operator.

        byte  multiplyingThree = 30;
        multiplyingThree *= 3;
        System.out.println("After multiply 3" + multiplyingThree);


        //14. Divide a number by 2 using /= operator.

        int divideingByTwo = 150;
        divideingByTwo /= 2;
        System.out.println("After Devide By Two" + divideingByTwo);

        //15. Find remainder after dividing a number by 5 using %= operator.

        int ModuloByFive = 234;
        ModuloByFive %= 5;
        System.out.println("After Modulo By Five" + ModuloByFive);

        //16. Initialize a variable, add another number to it, and print the final value.

        int InitializingA_Variable = 20;
        InitializingA_Variable += 10;
        System.out.println("Printing Final Value"  + InitializingA_Variable);

        //17. Initialize a number, subtract twice its value and print it.

        int number = 30;
        number -= 10;
        number -= 15;
        System.out.println(number);

        //18. Initialize two variables, update the first variable by multiplying it with the second and print.

        int FirstVariable = 500;
        int SecondVariable = 400;

        FirstVariable *= SecondVariable;
        System.out.println(FirstVariable);


        //🔵 Relational Operators (8 questions)

        //19.  Write a program to check if two numbers are equal.

        int firstNumber = 12, secondNumber = 13;
        System.out.println( firstNumber == secondNumber);


        //20. Write a program to check if two numbers are not equal.
        System.out.println(firstNumber != secondNumber);


        //21. Check whether a number is greater than another number.

        System.out.println( 5>3);

        //22.  Check whether a number is smaller than another number.

        System.out.println( 10 < 4);

        //23. Check whether a number is greater than or equal to another number.

        System.out.println( 5 > 4 || 5 == 4);

        //24.  Check whether a number is less than or equal to another number.

        System.out.println( 400 < 800 || 400 == 800 );

        //25. Take two inputs from the user and compare which one is greater.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int InputOne = sc.nextInt();
        System.out.println("Enter Second Number");
        int InputTwo = sc.nextInt();


        if (InputOne > InputTwo){
            System.out.println("InputOne Is Greater "+ InputOne);
        } else if (InputTwo > InputOne) {
            System.out.println("InputTwo is Greater " + InputTwo);
        }else{
            System.out.println("Both Number Are Equal");
        }


        //26. Take three numbers and find the largest among them.

        int x = 30;
        int y = 45;
        int z = 34;

        if (x > y && x >z){
            System.out.println("X is Greater " +x);
        } else if (y>x && y>z) {
            System.out.println("Y is Greater " +y);
        }else {
            System.out.println("Z is Greater " +z);
        }

        //🔵 Logical Operators (8 questions)

        //27. Write a program to check if a number is between 10 and 20 using logical &&.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int numberOne= sc.nextInt();

        if (numberOne >= 10 && numberOne <= 20  ){
            System.out.println("In between 10 to 20 ");
        }else {
            System.out.println("not Equal to ten and twenty");
        }

        //28. Check if a number is less than 10 or greater than 50 using logical ||.

        if (numberOne < 10 || numberOne > 50 )
            System.out.println( "Print Logic Is Fine");

        //29. Take age as input, check if age is greater than 18 and less than 60 using &&.
        Scanner InputScanner = new Scanner(System.in);
        System.out.println("Enter Your AGe");
        int age = InputScanner.nextInt();

        if (age > 18 && age < 60)
            System.out.println("He Can Drive");

        //30. Take two boolean variables and apply logical AND (&&) operation.

        boolean varOne = true;
        boolean varTwo = false;
        if (varOne == true && varTwo == false){
            System.out.println("Its Working Fine");
        }

        //31. Take two boolean variables and apply logical OR (||) operation.
        if (varOne == true || varTwo == true) {
            System.out.println("Logical OR works");
        }
        //32. Take a boolean input and invert it using logical NOT (!).

        boolean input = true;

        boolean inverted = !input;
        System.out.println("Inverted value:"+inverted);


        //33.Check whether a student passed all subjects using &&.

        System.out.println("Enter marks in Maths: ");
        int maths = sc.nextInt();

        System.out.println("Enter marks in Science: ");
        int science = sc.nextInt();

        System.out.println("Enter marks in English: ");
        int english = sc.nextInt();

        if (maths >= 33 && science >= 33 && english >= 33) {
            System.out.println("Passed in all subjects");
        } else {
            System.out.println("Did not pass in all subjects");
        }


        //34.Check whether a student failed in any subject using ||.

        if (maths < 33 || science < 33 || english < 33) {
            System.out.println("Failed in at least one subject");
        } else {
            System.out.println("Passed in all subjects");
        }



        // 🔵 Increment/Decrement Operators (8 questions)
        //35. Write a program to demonstrate post-increment (a++).
        int postIncrement = 30;
        postIncrement++;
        //36.Write a program to demonstrate pre-increment (++a).
        ++postIncrement;

        //37. Write a program to demonstrate post-decrement (a--).
        int postDecrement = 40;
        postDecrement--;

        //38.Write a program to demonstrate pre-decrement (--a).
        --postDecrement;

        //39.Take a number, increment it twice and print the final value.
        int increment = 100;
        increment++;
        ++increment;

        //40.Take a number, decrement it three times and print the final value.
        int decrement = 200;
        decrement--;
        decrement--;

        //41.Combine increment and arithmetic operation in one statement.
        int combinedIncrement = 100;
        combinedIncrement += 1;


        //42. Combine decrement and arithmetic operation in one statement.
        int combinedDecrement = 200;
        combinedDecrement -= 1;

        //🔵 User Input (8 questions)
        //43. Take user's name as input and print it.
        Scanner user = new Scanner(System.in);
        System.out.println("Give The Name");
        String name = user.nextLine();
        System.out.println(name);

        //44. Take user's age as input and check if the user is an adult (age >= 18).
        Scanner userAGe = new Scanner(System.in);
        System.out.println("Give Your AGe");
        int AGe = userAGe.nextInt();
        if (AGe >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
        }
        //45. Take two numbers as input and print their sum.

        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("First Number");
        int oneNumber = inputNumbers.nextInt();
        System.out.println("Second Number");
        int twoNumber = inputNumbers.nextInt();

        int sumOfTwoNumber = oneNumber+twoNumber;
        System.out.println(sumOfTwoNumber);

        //46. Take length and breadth as input and print area of rectangle.
        Scanner lb = new Scanner(System.in);
        int l = lb.nextInt();
        int b = lb.nextInt();
        int areaOfRectangle = l*b;
        System.out.println(areaOfRectangle);

        //47. Take principal, rate and time as input and calculate simple interest.
        Scanner simpleInterest = new Scanner(System.in);
        int  principal = simpleInterest.nextInt();
        int  Rate = simpleInterest.nextInt();
        int Time = simpleInterest.nextInt();

        int si = (principal*Rate*Time)/100;
        System.out.println(si);


        //48. Take three numbers as input and find the average.
        Scanner ThreeNumber = new Scanner(System.in);
        int numberone = ThreeNumber.nextInt();
        int numbertwo = ThreeNumber.nextInt();
        int numberthree = ThreeNumber.nextInt();

        int total = (numberone+numbertwo+numberthree)/3;
        System.out.println(total);


        //49. Take radius as input and calculate the area of a circle (area = π * r * r).

        Scanner radius = new Scanner(System.in);
        double pie = 3.14;
        double inputRadius = radius.nextInt();
        double areaOfCircle = pie * inputRadius * inputRadius;
        System.out.println(areaOfCircle);


        //50. Take marks of 5 subjects and calculate the total and average marks.

        Scanner subjects = new Scanner(System.in) ;
        System.out.println("maths= ");
        int Maths = subjects.nextInt();
        int Physics = subjects.nextInt();
        System.out.println("Physics= ");
        int Biology = subjects.nextInt();
        System.out.println("Biology= ");
        int  Chemestry = subjects.nextInt();
        System.out.println("Chemestry= ");
        int Hindi = subjects.nextInt();
        System.out.println("Hindi= ");

        int sumOfSubjects = (Maths + Physics + Biology + Chemestry + Hindi) /5;
        System.out.println(sumOfSubjects);

    }
}
