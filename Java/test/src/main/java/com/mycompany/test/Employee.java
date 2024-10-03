/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;
import java.util.Scanner;
/**
 *
 * @author Dat
 */
public class Employee {
    private String ID, name;
    protected int salary;
    Scanner scanner = new Scanner(System.in);
    
    public Employee(){
        super();
    }
    
    public Employee(String ID, String name, int salary){
        super();
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    
    public String getEmployee(){
        return ID;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void input(){
        System.out.print("ID: ");
        ID = scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Salary: ");
        salary = scanner.nextInt();
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee Numbers: ");
        int numEmployee = scanner.nextInt();
        Employee[] Staff = new Employee[numEmployee];
        
        System.out.println("Input Employee Info: ");
        for(int i = 0; i < numEmployee; i++){
            Staff[i].input();
        }
        
        System.out.println("Employee Info: ");
        for(int i = 0; i < numEmployee; i++){
            System.out.println(Staff[i].toString());
        }
    }
    
    @Override
    public String toString(){
        return "ID: " + this.ID + ", Name: " + this.name + 
                ", Salary: " + this.salary;
    }
}