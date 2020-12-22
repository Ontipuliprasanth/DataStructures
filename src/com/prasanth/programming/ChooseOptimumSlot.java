package com.prasanth.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChooseOptimumSlot {
	
	

  
  public static void main(String[] args) {
		String rawData="Mon 01:00-23:00\r\n"
				+ "Tue 01:00-23:00\r\n"
				+ "Wed 01:00-23:00\r\n"
				+ "Thu 01:00-23:00\r\n"
				+ "Fri 01:00-23:00\r\n"
				+ "Sat 01:00-23:00\r\n"
				+ "Sun 01:00-21:00";
		  String[] data=rawData.split(" ");
        List<MeetingSlot> ms=new ArrayList<MeetingSlot>();
	        for(int i=0;i<data.length;i=i+2)
	        {
	        	ms.add(new MeetingSlot(data[i], data[i+1]));
	        }
	        
	        Collections.sort(ms);
	        
	        for(int i=0;i<ms.size();i++)
	        {
	        	System.out.println(ms.get(i).day+""+ms.get(i).time);
	        }
    	        
	        
	}

}
 class MeetingSlot implements Comparable<MeetingSlot>{
	  
	  String day;
	  String time;
	  public MeetingSlot(String day, String time)
	  {
		  this.day=day;
		  this.time=time;
	  }
	  
//	int getMyDaySort(String day1,String day2)
//	{
//		
//	}
	@Override
	public int compareTo(MeetingSlot o) {
		// TODO Auto-generated method stub
		return o.day.compareTo(this.day);
	}
	  
	  
	
	  
}
