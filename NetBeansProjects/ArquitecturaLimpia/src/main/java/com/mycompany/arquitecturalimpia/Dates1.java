/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquitecturalimpia;

import java.util.*;
import java.text.*;
import java.time.format.*;
import java.util.Date;
import java.time.LocalDateTime;


/**
 *
 * @author saram
 */
public class Dates1 {
    
    public Date dateFormatting(){
        Date date = null;
        DateFormat format = new SimpleDateFormat("dd/M/yy");
        try {
            date = format.parse("17/04/2004");
        } catch (ParseException e) {
            e.printStackTrace(); //opcional
            System.out.println("Me equivoque de fecha: "+ e.getMessage());
        }
        System.out.println("17/04/2004");
        System.out.println(date);
        return date;
    }
    
    public void addYears(long years){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH..mm..ss");
        LocalDateTime date = LocalDateTime.now();
        date = date.plusYears(years);
        System.out.println(date);
    }
}
