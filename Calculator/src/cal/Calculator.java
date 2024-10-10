package cal;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //data input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first Number :");
        int fn = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter your argument(type only +,-,*,/):");
        String ar = sc1.nextLine();

        if ("+".equals(ar) || "-".equals(ar) || "*".equals(ar) || "/".equals(ar)) {
            System.out.println("Please enter your second Number :");
            int ln = sc.nextInt();

            //puts numbers in to a array
            int num[] = new int[2];
            num[0] = fn;
            num[1] = ln;

            if ("+".equals(ar)) {
                int result;
                result = cal.add(num, ar);
                System.out.println("Your Answer is: " + result);
                //retry part
                System.out.println("");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("If you want to retry enter 1");
                System.out.println("or you want to quit enter 2");
                int value = sc2.nextInt();
                if (value == 1 || value == 2) {
                    if (value == 1) {
                        main(args);
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.out.println("You can only type 1 or 2");
                }
            }
            if ("-".equals(ar)) {
                int result;
                result = cal.min(num, ar);
                System.out.println("Your Answer is: " + result);
                //retry part
                System.out.println("");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("If you want to retry enter 1");
                System.out.println("or you want to quit enter 2");
                int value = sc2.nextInt();
                if (value == 1 || value == 2) {
                    if (value == 1) {
                        main(args);
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.out.println("You can only type 1 or 2");
                }
            }
            if ("*".equals(ar)) {
                int result;
                result = cal.multi(num, ar);
                System.out.println("Your Answer is: " + result);
                //retry part
                System.out.println("");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("If you want to retry enter 1");
                System.out.println("or you want to quit enter 2");
                int value = sc2.nextInt();
                if (value == 1 || value == 2) {
                    if (value == 1) {
                        main(args);
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.out.println("You can only type 1 or 2");
                }
            }
            if ("/".equals(ar)) {
                int result;
                result = cal.devi(num, ar);
                if (result == 0) {
                    System.out.println("Your secont number must not be 0");
                    //retry part
                    System.out.println("");
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("If you want to retry enter 1");
                    System.out.println("or you want to quit enter 2");
                    int value = sc2.nextInt();
                    if (value == 1 || value == 2) {
                        if (value == 1) {
                            main(args);
                        } else {
                            System.exit(0);
                        }
                    } else {
                        System.out.println("You can only type 1 or 2");
                    }
                } else {
                    System.out.println("Your Answer is: " + result);
                    //retry part
                    System.out.println("");
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("If you want to retry enter 1");
                    System.out.println("or you want to quit enter 2");
                    int value = sc2.nextInt();
                    if (value == 1 || value == 2) {
                        if (value == 1) {
                            main(args);
                        } else {
                            System.exit(0);
                        }
                    } else {
                        System.out.println("You can only type 1 or 2");
                    }
                }
            }
        } else {
            System.out.println("You can only enter \"+\" or \"-\" or \"*\" or \"/\"");
            //retry part
            System.out.println("");
            Scanner sc2 = new Scanner(System.in);
            System.out.println("If you want to retry enter 1");
            System.out.println("or you want to quit enter 2");
            int value = sc2.nextInt();
            if (value == 1 || value == 2) {
                if (value == 1) {
                    main(args);
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("You can only type 1 or 2");
            }
        }

    }

    private int add(int num[], String ar) {
        int fn = num[0];
        int ln = num[1];
        int r = fn + ln;
        return r;

    }

    private int min(int num[], String ar) {
        int fn = num[0];
        int ln = num[1];
        int r = fn - ln;
        return r;
    }

    private int multi(int num[], String ar) {
        int fn = num[0];
        int ln = num[1];
        int r = fn * ln;
        return r;
    }

    private int devi(int num[], String ar) {

        int fn = num[0];
        int ln = num[1];
        try {
            int r = fn / ln;
            return r;
        } catch (ArithmeticException e) {
            int r = 0;
            return r;
        }
    }

}
