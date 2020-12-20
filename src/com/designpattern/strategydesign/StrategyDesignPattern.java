package com.designpattern.strategydesign;

import java.util.Scanner;

public class StrategyDesignPattern {
    public static void main(String args[]) throws IllegalAccessException {
        System.out.println("Strategy Design Pattern");
        Context context = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Suggested Authentication Options");
            System.out.println("1- Using Password");
            System.out.println("2- Using Social");
            System.out.println("3- Using Token");
            System.out.println("Please Choose- ");
            String option = scanner.nextLine();
            switch (option){
                case "1":
                    context = new Context(new PasswordBasedAuthentiation());
                    break;
                case "2":
                    context =new Context(new SocialAuthentication());
                    break;
                case "3":
                    context = new Context(new TokenbasedAuthentication());
                    break;
                default:
                    throw new IllegalAccessException("Invalid Options - "+option);
            }
            context.executeStrategy();
            System.out.println("Do you want to continue: Y/N -");
            if (scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
