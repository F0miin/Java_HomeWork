public class HM5 {
    static void main(String[] args) {

                // Task 1

                double f = Math.pow(2, 63);
                IO.println(f);
                int num = 15;
                char hex = '0';

                for (int i = 0; i <= num; i++) {

                    if (i <= 9) {
                        hex = (char) ('0' + i);
                    } else {
                        hex = (char) ('A' + i - 10);
                    }

                    System.out.println(i + " - " + hex);
                }

                // Task 2

                double points = Double.parseDouble(IO.readln("How many points did you get on the test? "));
                double maxPoints = Double.parseDouble(IO.readln("What is the maximum number of points for this test? "));

                double percentage = (points / maxPoints) * 100;

                // Grades from 2 to 5, where 5 is the best grade

                if (percentage >= 94.0) {
                    System.out.println("Great! Your grade for the test is 5. ");
                } else if (percentage >= 75.0) {
                    System.out.println("Your grade for the test is 4. ");
                } else if (percentage >= 55.0) {
                    System.out.println("Your grade for the test is 3. ");
                } else {
                    System.out.println("Your grade for the test is 2. ");
                }

                //Task 3

                int n = Integer.parseInt(IO.readln("What is the number on your mind? "));
                System.out.println("n = " + n);

                for (int i = 1; i <= n; i++) {
                    int power = i;
                    for (int k = 1; k <= 3; k++) {
                        power = power * i;
                        System.out.print(power + " ");
                    }
                    System.out.println();
                }

                //Task 4

                int height = 3;
                int width = 5;
                for(int j = 0; j < height; j++) {

                for (int i = 0; i < width; i++) {
                   System.out.print('*');
               }
               System.out.println();
           }
        System.out.println("STAIRCASE");
                   int height5 = Integer.parseInt(IO.readln("Provide hight: "));
                for(int j = 0; j < height5; j++) {
                int width5 = j;
                for (int i = 0; i <= width5; i++) {
                   System.out.print('*');
               }
               System.out.println();
           }

           //Task 6

           System.out.println("CHESSBOARD");
           int height6 = Integer.parseInt(IO.readln("Provide hight: "));
           int width6 = 9;

           for (int j = 0; j < height6; j++) {
               for (int i = 0; i < width6; i++) {
                   if ((i + j) % 2 == 0) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }

        //Task 7
        
        
        

        //Task 8

        System.out.println("RHOMBUS");
        int size = Integer.parseInt(IO.readln("Provide size for the pattern: "));

        int width8 = 2 * size + 1;
        int height8 = 2 * size + 1;

        for (int j = 0; j < height8; j++) {
            for (int i = 0; i < width8; i++) {
                if (i <= size) {
                    if (j < size - i || j > size + i)
                        System.out.print(". ");
                    else
                        System.out.print("* ");
                } else {
                    if (j < i - size || j > 3 * size - i)
                        System.out.print(". ");
                    else
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
