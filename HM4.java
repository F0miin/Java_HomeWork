static void main(String[] args) {
    //Task 1 
    /*
    for (int i = 1; i <= 10; i++) {
        IO.println(i);
    }
    
    //Task 2
    int wrt = 2;
    for (int i = 1; i <= 10; i++) {
        IO.println(i * wrt);
    }
    
    //Task 3
    
    int num1 = Integer.parseInt(IO.readln("Provide first number: "));
    int num2 = Integer.parseInt(IO.readln("Provide second number: "));
    
    if (num1 > 0 && num2 > 0) {
        IO.println("Both numbers are positive and their difference is: " + (num1 - num2));
    } else if (num1 < 0 && num2 < 0) {
        IO.println("Both numbers are negative and their sum is: " + (num1 + num2));
    }
    
    //Task 4
    
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    char ch = scanner.next().charAt(0);
    
    if (ch == 'a' || ch == 'e' || ch == 'i' ||
    ch == 'o' || ch == 'u') {
    
    System.out.println("Vowel");
    
    } else if (Character.isLetter(ch)) {
    
    System.out.println("Consonant");
    
    } else {
    
    System.out.println("Not a letter");
    }
    
    scanner.close();
    
    
    //Task 5
    
    int d = 2;
    while (d <= 10) {
    IO.println("this is while: " + d);
    d *= 2;
    }
    
    int x = 2;
    
    do {
    IO.println("This is do while: " + x);
    } while (x < 2);
    
    //Task 6
    
    //int a = 5;
    
    if (a <= 0) { 
    System.out.println("Negative " + a); 
    a = a * -1; 
    System.out.println("Absolute value is: " + a); 
    } else { 
    System.out.println("Positive" + a); 
    System.out.println("Absolute  value is: " + a); 
    }
    
    
    if (a <= 0) { 
    System.out.println("Negative"); 
    a = a * -1; 
    System.out.println("Absolute value is: " + a); 
    } 
    if (a >= 0) { 
    System.out.println("Positive"); 
    System.out.println("Absolute value is: " + a); 
    }
    */
    //Task 7

    String studentNumber = IO.readln("Provide number: ");
    // 37702

    int numberSum = 0;

    for (int i = 0; i < studentNumber.length(); i++) {
        numberSum += Character.getNumericValue(studentNumber.charAt(i));
    }

    IO.println("Sum of all numbers: " + numberSum);

    /*
    3 7 0 2
    0 1 2 3
    
    numberSum =3
    
    1 for{
    index = 0
    studentNumber[index] = 3
    
    numberSum + 3
    
    numberSum ==== 3
    }
    
    2 for{
    index = 1
    studentNumber[index] = 7
    
    numberSum + 7
    
    numberSum ==== 3
    }
    
    
    //Task 8
    
    int number;
    int amount = 0;
    int sumAmount = 0;
    
    do {
        number = Integer.parseInt(IO.readln("Provide number: "));
        sumAmount += number;
        if (number != 0) {
            amount++;
        }
    
    } while (number != 0);
    System.out.println("number of iterations: " + amount);
    System.out.println("Sum: " + sumAmount);
    
    //Task 9
    
    // 1/2*0=1
    
    double infiniteSeries = 1.0;
    
    System.out.println(infiniteSeries);
    
    for (int n = 0; n < 9; n++) {
        infiniteSeries /= 2;
        System.out.println(infiniteSeries);
    }
    //Task 10
    
    for (int charNumber = 75; charNumber <= 150; charNumber++) {
        System.out.println((char) charNumber + " - " + charNumber);
    }
        */
    // Task 11

    double first = Math.random();
    double second = Math.random();
    double third = Math.random();

    System.out.println("First number: " + first);
    System.out.println("Second number: " + second);
    System.out.println("Third number: " + third);

    if (first > 0.2 && second > 0.2 && third > 0.2) {

        System.out.println("Value of first three random numbers are greater then 0.2");
    } else {
        System.out.println("At least one of the first three numbers is not greater than 0.2");
    }

    first = second;
    second = third;
    third = Math.random();

    System.out.println("Fourth number: " + third);

    if (first > 0.2 && second > 0.2 && third > 0.2) {
    System.out.println("Value of next three random numbers are greater then 0.2");
    } else {
        System.out.println("At least one of the next three numbers is not greater than 0.2");
    }

    first = second;
    second = third;
    third = Math.random();

    System.out.println("Fith number: " + third);

    if (first > 0.2 && second > 0.2 && third > 0.2) {
    System.out.println("Value of last three random numbers are greater then 0.2");
} else {
    System.out.println("At least one of the last three numbers is not greater than 0.2");
}

//Task 12

    int day = 27;
    int month = 10;
    int totalDays = day;

    if (month >= 2) {
        totalDays += 31;
        }

    if (month >= 3) {
        totalDays += 28;
        }

    if (month >= 4) {
        totalDays += 31;
        }

    if (month >= 5) {
        totalDays += 30;
        }

    if (month >= 6) {
        totalDays += 31;
        }

    if (month >= 7) {
        totalDays += 30;
        }

    if (month >= 8) {
        totalDays += 31;
        }

    if (month >= 9) {
        totalDays += 31;
        }

    if (month >= 10) {
        totalDays += 30;
        }

    if (month >= 11) {
        totalDays += 31;
        }

    if (month >= 12) {
        totalDays += 30;
        }

        System.out.println("Days since the beginning of the year: " + totalDays);
    
}
