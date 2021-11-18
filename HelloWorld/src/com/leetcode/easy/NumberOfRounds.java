package com.leetcode.easy;

public class NumberOfRounds {
	public static int numberOfRounds(String startTime, String finishTime) {
        int startMinute, startHour;
        startMinute = Integer.parseInt(startTime.substring(3,5));
        startHour = Integer.parseInt(startTime.substring(0,2));
        int finishMinute, finishHour;
        finishMinute = Integer.parseInt(finishTime.substring(3,5));
        finishHour = Integer.parseInt(finishTime.substring(0,2));
        int games = 0;
        
        if (startMinute > 0 && startMinute <= 15)
        {
        	startMinute = 15;
        }
        else if (startMinute > 15 && startMinute <= 30)
        {
        	startMinute = 30;
        }
        else if (startMinute > 30 && startMinute <= 45)
        {
        	startMinute = 45;
        }
        else if (startMinute > 45 && startMinute <= 59)
        {
        	startMinute = 00;
        	startHour ++;
        }
        else
        {
        	startMinute = 00;
        }
        
        if (finishMinute >= 0 && finishMinute < 15)
        {
        	finishMinute = 0;
        }
        else if (finishMinute >= 15 && finishMinute < 30)
        {
        	finishMinute = 15;
        }
        else if (finishMinute >= 30 && finishMinute < 45)
        {
        	finishMinute = 30;
        }
        else if (finishMinute >= 45 && finishMinute <= 59)
        {
        	finishMinute = 45;
        }
                	
        if(finishMinute == 0)
        {
        		finishMinute = 60;
        }
        
        if(startMinute < finishMinute)
        {
        	int temp = finishMinute - startMinute;
        	games = games + temp/15;
        	if(games == 4)
        	{
        		startHour++;
        	}
        }
        else if (startMinute > finishMinute)
        {

        	int temp = startMinute - finishMinute;
        	games = games + temp/15;
        	startHour ++;
        }
        
        if(startHour > 23)
        {
        	startHour = 0;
        }
        
        if(finishHour == 0)
        {
        	finishHour = 23;
        }
        
        if(startHour  < finishHour)
        {
        	int temp =  finishHour - startHour;
        	games = games + temp*4;
        }
        else if (startHour > finishHour)
        {
        	int temp = 24 - startHour;
        	temp =  temp + finishHour;
        	games = games + temp*4;
        }
        
        return games;
    }
}
