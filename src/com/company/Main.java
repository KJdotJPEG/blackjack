package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Random random = new Random();
    Scanner Input = new Scanner(System.in);

    //static variables used in functions

    static int i = 0;
    static int j = 0;
    static int[] playercard = { 0 , 0 , 0 };
    static int[] cpucard = { 0 , 0 , 0 };

    //functions

    public static int cpurandomizer() {
        cpucard[i] = random.nextInt(11);
        return cpucard[i];
    }

    public static int playerrandomizer() {
        playercard[j] = random.nextInt(11);
        return playercard[j];
    }

    public static void main(String[] args) {

        //testing the computer number generating system

        while (i <= 1) {
            cpurandomizer();
            i++;
        }

            //System.out.println("cpucard 1 = " + cpucard[0] + "\ncpucard 2 = " + cpucard[1] + "\n i am going to hide these numbers.");

            //player process

            while (j <=1) {
                playerrandomizer();
                j++;
            }

            System.out.println("your cards are: \n" + playercard[0] + "\n" + playercard[1]);

            if ((playercard[0] + playercard[1]) > 21) {
                System.out.println("Game over...\n");
            } else {
                playercard[2] = random.nextInt(11);
                System.out.println("you have been given a " + playercard[2] + ".\n");
                if ((playercard[0] + playercard[1] + playercard[2]) > 21) {
                    System.out.println("Game over...\n");


                } else {

                }
                //CPU process

                if ((cpucard[0] + cpucard[1]) > 21){
                    System.out.println("You have won! the CPU's cards exceeded 21!\n");
                } else{
                    cpucard[2] = random.nextInt(11);
                    System.out.println("The CPU has picked up another card. . . \n");
                    if ((cpucard[0] + cpucard[1] + cpucard[2]) > 21){
                        System.out.println("You have won! The CPU's cards exceeded 21!\n");
                    }else {

                    }
                    }

                // final comparison

                if ((cpucard[0]+cpucard[1]+cpucard[2]) < (playercard[0] + playercard[1] + playercard[2])){
                    System.out.println("You won!\n");
                }else if ((cpucard[0]+cpucard[1]+cpucard[2]) == (playercard[0] + playercard[1] + playercard[2])){
                    System.out.println("It's a. . . draw?\n");
                }else{
                    System.out.println("Game over . . . \n");
                }
                int playertotal = playercard[0] + playercard[1] + playercard[2];
                int cputotal = cpucard[0] + cpucard[1] + cpucard[2];

                //final total printout

                System.out.println("Total tallies: \nYour tally: " +playertotal+ "\nCPU's total: " +cputotal);


            }
        }        }