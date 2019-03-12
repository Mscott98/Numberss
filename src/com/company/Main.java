package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 3;
        String NumberString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter In A number");
        number = scanner.nextInt();
        switch (number) {
            case 1:
                NumberString = "Inchi";
                break;
            case 2:
                NumberString = "ni";
                break;
            case 3:
                NumberString = "San";
                break;
            case 4:
                NumberString = "Shi";
                break;
            case 5:
                NumberString = "Go";
                break;
            case 6:
                NumberString = "Roku";
                break;
            case 7:
                NumberString = "Shichi";
                break;
            case 8:
                NumberString = "hachi";
                break;
            case 9:
                NumberString = "Kyuu";
                break;
            case 10:
                NumberString = "Juu";
                break;
            default:
                NumberString = "That was a wrong Entry ";

        }
        System.out.println(NumberString);
    }

}