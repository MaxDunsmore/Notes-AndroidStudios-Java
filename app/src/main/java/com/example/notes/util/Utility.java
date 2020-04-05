package com.example.notes.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    public static String getCurrentTimeStamp(){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("d/mm/yyyy");
            Date date = new Date();
            String currentDate = dateFormat.format(date);
            return currentDate;
        }catch (Exception e){
            return null;
        }
    }
}
