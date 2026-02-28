/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mypackage.hello;

import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class NameHandler {
    
    private String name;
    private String birthdate; 
    private int age;
    

    public NameHandler() {
        name = null; 
        birthdate = null;
        age = 0;
    }

    
    public int calculo(){
       int current_day = LocalDate.now().getDayOfMonth();
       int current_month = LocalDate.now().getMonthValue();
       int day = Integer.parseInt(birthdate.substring(8));
       int month = Integer.parseInt(birthdate.substring(5,7));
       int year = Integer.parseInt(birthdate.substring(0,4));
       age = 2026-year; 
       if (current_month < month ) {
            age--;
        }else if(current_month == month){
            if (current_day < day) {
               age--;
           }
       }
       return age;
    }
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthday
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthday the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return calculo();
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
            
    
   
}
