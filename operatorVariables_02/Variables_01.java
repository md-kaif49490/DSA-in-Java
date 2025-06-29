package operatorVariables_02;

public class Variables_01 {
    public static void main(String[] args) {


        int age = 40;   //java is a case-sensitive language
        int aGe = 30;
        System.out.println(age==aGe);  // false Because age and aGe is two different variables name


        // Declaration of Variables ✅
        int secondMarksOfStudents = 23; //camelCase allowed
        int third$marks$of$students = 30; // dollar sign allowed
        int _fourth_marks_of_student = 40;  // underscore allowed

        // DataTypes (primitive dataTypes) ✅
        boolean isPassed = false;
        int count = 12;
        byte marks = 11;
        short student = 3333;
        float pi = 3.14f;  //by default decimal number in java is double so when we use float then we should use value with f ex:- 33.14f so convert double to float
        System.out.println(marks);
        double secondPi = 232.33333;
        char character = 'A'; // char uses single quotes and only one character at a time.
        System.out.println(character);

        //DataTypes(Non-Primitive dataTypes ) ✅

        //String, Array, Class, Interface, Enum, Object, Wrapper, Collection .


        //TypeCasting ✅

        //Data type implicit conversion  (widening) *********
        // implicit conversion is easily conversion

        int number = 42;
        long numberAssining = number;
        System.out.println(numberAssining);


        //Data type explicit conversion (narrowing) *********
        long Counts = 1344444333111111111L;
        int exCount = (int)Counts;  //typeCasting
        System.out.println(exCount);  //lossy conversion perform because the number is too big for int



        char   Charater = 'a';
        int  conversionChar = Charater;

        System.out.println(conversionChar); // prints ASCII value of 'a'


/*
         byte	1 byte
         short	2 bytes
         int	4 bytes
         long	8 bytes
         float	4 bytes
         double	8 bytes
         char	2 bytes (because Java uses Unicode)
*/


        // single line comment use shortcut ctrl+/
        /*   multi line comment  use shortcut ctrl + shift +/  */

    }
}
