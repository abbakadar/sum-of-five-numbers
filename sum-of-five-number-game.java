import java.util.Scanner;

class sum_of_five_numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        sum_of_five_numbers obj=new sum_of_five_numbers();  // Create a new object
        
        System.out.println("A Program developed by King");  // Developer's name
        System.out.println("Rules :\n" +
                "1. Only four digit numbers will be accepted\n" +
                "2. First & Second number will be entered first by the user then third number will automatically be generated by computer and will be displayed.\n" +
                "3. Fourth number should be entered by the user and the last number i.e fifth number will be generated by computer and it will also be displayed.\n"+
                "Note : Answer will be given after you have entered first two numbers and you can input any 4 digit number. :)");

        System.out.println("Enter the first number ");  // Get the input
        int n = sc.nextInt();  // Store the input
        int c1 = obj.count_digits(n);


        if (c1 == 4) {

            String ans = "2" + Integer.toString(n - 2);//Formula to write answer

            System.out.println("Enter the second number ");
            int n2 = sc.nextInt();



            int c2 = obj.count_digits(n2);
            if (c2 == 4) {
                System.out.println("\nYour answer will be : " + ans);  // Printing the answer before the calculation
                obj.number_by_computer(n2);


                System.out.println("Now it's your turn\n\nEnter the fourth number");
                int n4 = sc.nextInt();

                int c3 = obj.count_digits(n4);

                if (c3 == 4) {

                    obj.number_by_computer(n4);

                    System.out.println("Your answer is given above....:) ");
                }
                else
                    System.out.println("Please enter only four digit number..... :( ");
            }
            else
                System.out.println("Please enter only four digit number..... :( ");
        }
        else
            System.out.println("Please enter only four digit number..... :( ");

    }

    void number_by_computer(int temp1)  // Method to check number
    {
        String r ="";
        int rem, temp2 = temp1;

        while (temp1 > 0) {
            rem = temp1 % 10;
            if (rem == 0) {
                r = r+"9";
            }
            if (rem == 1) {
                r = r+"8";
            }
            if (rem == 2) {
                r = r+"7";
            }
            if (rem == 3) {
                r = r+"6";
            }
            if (rem == 4) {
                r = r+"5";
            }
            if (rem == 5) {
                r = r+"4";
            }
            if (rem == 6) {
                r = r+"3";
            }
            if (rem == 7) {
                r = r+"2";
            }
            if (rem == 8) {
                r = r+"1";
            }
            if (rem == 9) {
                r = r+"0";
            }
            temp1 = temp1 / 10;
        }
        int n_c = Integer.parseInt(r),rem1,n_comp=0;
        while(n_c>0){
            rem1 = n_c%10;
            n_comp = n_comp*10+rem1;
            n_c=n_c/10;
        }
        System.out.println("\nYou have Entered " + temp2 + "\nso my number is " + n_comp);

    }

    int count_digits(int temp) {
        int cnt = 0;
        while (temp > 0) {
            cnt++;
            temp = temp / 10;
        }
        return cnt;  // Returning count value
    }


}

