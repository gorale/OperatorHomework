package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Sort
     * @param p
     * @param o
     * @param i
     */
    public static void sort(int p,int o,int i){
        int max = p;
        if (max < o) {
            max = o;
        }
        if (max < i) {
            max = i;
        }
        System.out.println("Max digit: " + max);
        int min = p;
        if (min > o) {
            min = o;
        }
        if (min > i) {
            min = i;
        }
        int middle = (p+o+i)-(min+max);
        System.out.println("middle digit: "+middle);
        System.out.println("min digit: "+min);
    }

    /**
     * Mathematical Expression
     * @param m
     * @param n
     * @param v
     */
    public static void mathematicalExpression(double m,double n,double v){
        double d = n*n - 4*n*v;
        double x1, x2, x;
        if(d > 0){
            x1 = (-n - Math.sqrt(d)) / (2 * m);
            x2 = (-n + Math.sqrt(d)) / (2 * m);
            System.out.println("x1: "+x1+" x2: "+x2+" d>0");
        }else if(d == 0){
            x = -n / (2 * m);
            System.out.println("x: "+x+" d=0");
        }else if(d < 0){
            System.out.println("Can't be d<0");
        }

    }

    /**
     * Equals Numbers
     * @param q
     * @param w
     * @param r
     */
    public static void equalsNumbers(int q, int w, int r) {
        int count = 0;
        if (q != w && w != r) {
            if (q == w) {
                count += 2;
            }
            if (q == r) {
                count += 2;
            }
            if (w == r) {
                count += 2;
            }
        }
        if (q == w && w == r) {
            count += 3;
        }
        System.out.println("equals numbers: " + count);
    }

    /**
     * Triangle
     *
     * @param h
     * @param j
     * @param g
     */
    public static void triangle(int h, int j, int g) {
        if (h > 0 && j > 0 && g > 0) {
            if (h * h > j * j + g * g) {
                System.out.println("obtuse triangle");
            } else if (h * h < j * j + g * g) {
                System.out.println("acute triangle");
            } else if (h * h == j * j + g * g) {
                System.out.println("right triangle");
            }
        }
    }

    /**
     * Coordinate Plane
     *
     * @param x
     * @param z
     */
    public static void coordinatePlane(int x, int z) {
        if (x > 0 && z > 0) {
            System.out.println("1th quarter");
        } else if (x > 0 && z < 0) {
            System.out.println("4th quarter");
        } else if (x < 0 && z > 0) {
            System.out.println("2th quarter");
        } else if (x < 0 && z < 0) {
            System.out.println("3th quarter");
        }
    }

    /**
     * Between c and e
     *
     * @param c
     * @param e
     */
    public static void betweenCE(int c, int e) {
        if (c > 0 && e > 0) {
            if (c % 7 == 0 | e % 7 == 0) {
                if (c > e) {
                    for (int i = e + 1; i < c; i++) {
                        if (i % 2 == 1) {
                            System.out.println(i);
                        }
                    }
                }
            } else if (c > e) {
                for (int i = e + 1; i < c; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else if (c < e) {
                for (int i = c + 1; i < e; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else if (c == e) {
                System.out.println("c = e");
            }
        }
    }

    /**
     * Number a and b
     *
     * @param a
     * @param b
     */
    public static void numberAB(int a, int b) {
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if (a > 10) {
            System.out.println("a is legal b is illegal");
        } else if (b != 10) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }

        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        } else if (a > 0) {
            System.out.println("a is legal b is illegal");
        } else if (b > 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }

        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else if (a < 0) {
            System.out.println("a is legal b is illegal");
        } else if (b < 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }

        if (a > 10 && b < 1 && a % 2 == 1) {
            System.out.println("Both a and b legal");
        } else if (a > 10 && a % 2 == 1) {
            System.out.println("a is legal b is illegal");
        } else if (b < 1) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }

        if (a % 5 == 0 | b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("a is illegal or b is illegal");
        }

        if (a % 5 != 0 | b % 5 != 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("a is illegal or b is illegal");
        }


    }

    /**
     * Random number
     */
    public static void randomNumber() {
        Random ran = new Random();
        int rand = ran.nextInt();
        System.out.println("random number: " + rand);
        if (rand > -1000 && rand < 1000) {
            if (rand % 3 == 0 | rand % 5 == 0) {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }

    /**
     * Leap year
     *
     * @param y
     */
    public static void leapYear(int y) {
        if (y % 4 == 0) {
            if (y % 400 != 0 && y % 100 == 0) {
                System.out.println("no leap year");
            } else {
                System.out.println("leap year");
            }
        }
    }

    /**
     * Ice cream
     *
     * @param k
     */
    public static void iceCream(int k) {
        if (k % 3 == 0 | k % 5 == 0) {
            System.out.println("You can buy " + k + " ice cream");
        }

    }

    /**
     * Week Day
     * monday tuesday wednesday thursday friday saturday sunday
     *
     * @param number5
     */
    public static void weekDay(int number5) {
        if (number5 == 1) {
            System.out.println("Monday");
        } else if (number5 == 2) {
            System.out.println("Tuesday");
        } else if (number5 == 3) {
            System.out.println("Wednesday");
        } else if (number5 == 4) {
            System.out.println("Thursday");
        } else if (number5 == 5) {
            System.out.println("Friday");
        } else if (number5 == 6) {
            System.out.println("Saturday");
        } else if (number5 == 7) {
            System.out.println("Sunday");
        }
    }

    /**
     * Float Number
     *
     * @param number4
     */
    public static void floatNumber(float number4) {
        if (number4 == 0) {
            System.out.print("zero");
        } else if (number4 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
        if (Math.abs(number4) < 1) {
            System.out.println("small");
        } else if (Math.abs(number4) > 1_000_000) {
            System.out.println("large");
        }
    }

    /**
     * Max number
     *
     * @param number1
     * @param number2
     * @param number3
     */
    public static void maxNumber(int number1, int number2, int number3) {
        int max = number1;
        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        System.out.println("Max number: " + max);

    }

    /**
     * Multiple of 5
     *
     * @param num1
     */
    public static void multiple5(int num1) {
        if (num1 % 5 == 0) {
            System.out.println("This number is multiple of 5");
        } else {
            System.out.println("This number is not multiple of 5");
        }
    }

    /**
     *
     */
    public static void randomNum() {
        Random ran = new Random();

//        int rand = ran.nextInt();
//        System.out.println(rand);
//        if (rand >= 2 && rand <= 7) {
//            System.out.println(rand);
//        }


    }


    /**
     * Even number
     *
     * @param num
     */
    public static void evenNumber(int num) {

        if (num % 2 == 0) {
            System.out.println("This number even: " + num);
        } else {
            System.out.println("This number odd: " + num);
        }

    }

    /**
     * voting right
     *
     * @param age
     */
    public static void adultUser(int age) {

        if (age >= 18) {
            System.out.println("You have the right to vote");
        } else {
            System.out.println("You don't have the right to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voting right");
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        adultUser(age);

        System.out.println("Even number");
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        evenNumber(num);

        randomNum();
        System.out.println("Multiple of 5");
        System.out.print("Enter number: ");
        int num1 = sc.nextInt();
        multiple5(num1);

        System.out.println("Max number");
        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = sc.nextInt();
        maxNumber(number1, number2, number3);

        System.out.println("Float Number");
        System.out.print("Enter float number: ");
        float number4 = sc.nextFloat();
        floatNumber(number4);

        System.out.println("Week Day");
        System.out.print("Enter week day(1-7): ");
        int number5 = sc.nextInt();
        weekDay(number5);

        System.out.println("Ice cream");
        System.out.print("Enter k number: ");
        int k = sc.nextInt();
        iceCream(k);

        System.out.println("Leap year");
        System.out.print("Enter leap year: ");
        int y = sc.nextInt();
        leapYear(y);

        System.out.println("Random number");
        randomNumber();

        System.out.println("Number a and b");
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        numberAB(a, b);

        System.out.println("Between c and e");
        System.out.print("Enter number c: ");
        int c = sc.nextInt();
        System.out.print("Enter number e: ");
        int e = sc.nextInt();
        betweenCE(c, e);

        System.out.println("Coordinate Plane");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter coordinate x: ");
            int x = sc.nextInt();
            System.out.print("Enter coordinate y: ");
            int z = sc.nextInt();
            coordinatePlane(x, z);
        }

        System.out.println("Triangle");
        System.out.print("Enter number 1: ");
        int h = sc.nextInt();
        System.out.print("Enter number 2: ");
        int j = sc.nextInt();
        System.out.print("Enter number 3: ");
        int g = sc.nextInt();
        triangle(h, j, g);

        System.out.println("Equals Numbers");
        System.out.print("Enter number 1: ");
        int q = sc.nextInt();
        System.out.print("Enter number 2: ");
        int w = sc.nextInt();
        System.out.print("Enter number 3: ");
        int r = sc.nextInt();
        equalsNumbers(q, w, r);

        System.out.println("Mathematical Expression");
        System.out.print("Enter Expression number a: ");
        double m = sc.nextDouble();
        System.out.print("Enter Expression number b: ");
        double n = sc.nextDouble();
        System.out.print("Enter Expression number c: ");
        double v = sc.nextDouble();
        mathematicalExpression(m,n,v);

        System.out.println("Sort");
        System.out.print("Enter number 1: ");
        int p = sc.nextInt();
        System.out.print("Enter number 2: ");
        int o = sc.nextInt();
        System.out.print("Enter number 3: ");
        int i = sc.nextInt();
        sort(p,o,i);
    }
}
