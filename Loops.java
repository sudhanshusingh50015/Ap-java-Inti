import java.util.*;
public class Loops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

                //PRINT THE FIRST NETURA NUMBER

//        int n = sc.nextInt();
//        int sum = 0;
//        int i=1;
//        while(i<=n){
//            sum += i;
//            i++;
//        }
//        System.out.println("sum is :" + sum);

                //START FOR LOOP EX:-
//        for(int i=1; i<=15; i++){
//            System.out.println("suvirsitha");
//        }

                        //PRINT SQUIRE
//        int n =2;
//        for(int i=0; i<=n; i++){
//
//                System.out.println(" * * * * * ");
//            }

//        int n=0;
////        while(n<=5){
////            System.out.println("*****");
////            n++;
////        }


                            //PRINT REVARSE NUMBER

//        int n=2250015;
//        while(n > 0){
//            int LastDigit = n%10;
//            System.out.print(LastDigit);
//            n=n/10;
//        }


                                    //Do WHILE LOOP

//        int n=1;
//        do{
//            System.out.println("Hello World");
//            n++;
//        } while (n <= 6);

//       int n = 1;
//      do {
//          System.out.println("Suvirsitha");
//          n++;
//      } while (n <= 10);

//            for(int i =1; i<=5; i++){
//                if(i == 4){
//                    break;
//                }
//                System.out.println(i);
//            }
//                System.out.println("Loop Reach");4

                            //USER ENTER THE NUMBER UNDER 20;


//        do{
//            System.out.println("Enter the Number");
//            int n = sc.nextInt();
//
//            if(n % 10 ==0){
//                break;
//            }
//            System.out.println("I Love You");
//        }while(true);

//        int number = sc.nextInt();
//        if(number % 2 ==0){
//            System.out.println("even");
//        }else{
//            System.out.println("Odd");
//    }

//                    CONTINUE STATEMENT

//        for(int i=1; i<=10; i++){
//            if(i==5){
//                continue;
//            }
//            System.out.print(i+" ");
//        }



        int n = sc.nextInt();

        if(n ==2 ){
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for(int i =2; i<=n-1; i++) {
                if(n % i == 0) {
                    isPrime= false;
                }
            }

            if(isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

        }

    }

