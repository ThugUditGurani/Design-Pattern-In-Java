package com.designpattern.builderdesign;

import java.util.Scanner;

public class BuilderDesignPattern {
    public static void main(String[] args){
        System.out.println("Builder Pattern: ");
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Enter Company- ");
//            String company = scanner.nextLine();
//            System.out.println("Enter Operating System- ");
//            String operatingSystem = scanner.nextLine();
//            System.out.println("Enter RAM Size -");
//            String ramSize = scanner.nextLine();
//            System.out.println("Enter Harddisk Size- ");
//            String hardSize = scanner.nextLine();
//            System.out.println("Enter System Type -");
//            String systemType = scanner.nextLine();
//
//            Computer computer = new Computer.ComputerBuilder(company,operatingSystem)
//                    .setRamSize(ramSize)
//                    .setHardDiskSize(hardSize)
//                    .setSystemType(systemType)
//                    .build();
//            System.out.println(computer);
//
//            System.out.println("Do you want to build new Computer: Y/N -");
//            if(scanner.nextLine().equalsIgnoreCase("Y")){
//                break;
//            }
//
//        }

                    Computer computer = new Computer.ComputerBuilder("NCR","Operating")
                    .setRamSize("ramSize")
                    .setHardDiskSize("hardSize")
                    .setSystemType("systemType")
                    .build();
            System.out.println(computer);
    }
}


class Computer{
    String company;
    String operatingSystem;
    String ramSize;
    String hardDiskSize;
    String systemType;

    private Computer(ComputerBuilder computerBuilder){
        this.company = computerBuilder.company;
        this.operatingSystem = computerBuilder.operatingSystem;
        this.ramSize = computerBuilder.ramSize;
        this.hardDiskSize = computerBuilder.hardDiskSize;
        this.systemType = computerBuilder.systemType;
    }

    static class ComputerBuilder{
        String company;
        String operatingSystem;
        String ramSize;
        String hardDiskSize;
        String systemType;

        ComputerBuilder(String company,String operatingSystem){
            this.company = company;
            this.operatingSystem = operatingSystem;
        }

        ComputerBuilder setRamSize(String ramSize){
            this.ramSize = ramSize;
            return this;
        }

        ComputerBuilder setHardDiskSize(String hardDiskSize){
            this.hardDiskSize = hardDiskSize;
            return this;
        }

        ComputerBuilder setSystemType(String systemType){
            this.systemType = systemType;
            return this;
        }

        Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", hardDiskSize='" + hardDiskSize + '\'' +
                ", systemType='" + systemType + '\'' +
                '}';
    }
}