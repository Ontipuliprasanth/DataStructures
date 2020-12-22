package com.prasanth.basicProgs.Logical;

import java.util.ArrayList;
import java.util.List;


public class AirLineCodeTest {
   
	static String TAG_MIXED_AC_OAL_ITENERY="MIXED_AC_OAL_ITENERY";
	static String LIST_TIERIII_AIRLINE_CODES[]={"QK", "EVS", "AGE", "ZX" };
	static String TAG_PURE_AC_ITENERY="PURE_AC_ITENERY";
	static String TAG_MIXED_AC_TIERIII_ITENERY="MIXED_AC_TIERIII_ITENERY";
	static String TAG_PURE_TIERIII_ITENERY="PURE_TIERIII_ITENERY";

	
	private static String getItenaryFlightType(List<String> airlineCodes) {
		  String itenaryFlightType="TAG_MIXED_AC_TIERIII_ITENERY"; 
		  boolean isACFlightsExists=false;
		for(int codeIndex=0;codeIndex<airlineCodes.size();codeIndex++)
		{
			boolean isOALFlightsExists=false;

			if(airlineCodes.get(codeIndex).equalsIgnoreCase("AC") &&!(itenaryFlightType.equalsIgnoreCase(TAG_PURE_TIERIII_ITENERY) || itenaryFlightType.equalsIgnoreCase(TAG_MIXED_AC_TIERIII_ITENERY)))
			{
				itenaryFlightType=TAG_PURE_AC_ITENERY;
				isACFlightsExists=true;
			}
			for(int tireIIIIndex=0;tireIIIIndex<LIST_TIERIII_AIRLINE_CODES.length;tireIIIIndex++)
			{
				isOALFlightsExists=true;
			//	System.out.println("AIrline"+airlineCodes.get(codeIndex)+ "  Itenary Data"+LIST_TIERIII_AIRLINE_CODES[tireIIIIndex]);
				if(airlineCodes.get(codeIndex).equalsIgnoreCase(LIST_TIERIII_AIRLINE_CODES[tireIIIIndex]))
				{ 
					if(isACFlightsExists)
					{
						itenaryFlightType=TAG_MIXED_AC_TIERIII_ITENERY;
					}
					else if(!(itenaryFlightType.equalsIgnoreCase(TAG_PURE_AC_ITENERY) || itenaryFlightType.equalsIgnoreCase(TAG_MIXED_AC_TIERIII_ITENERY)))
					{
						itenaryFlightType=TAG_PURE_TIERIII_ITENERY;			
					}
					isOALFlightsExists=false;
					//System.out.println("equal"+"AIrline"+airlineCodes.get(codeIndex)+ "  Itenary Data"+LIST_TIERIII_AIRLINE_CODES[tireIIIIndex]);
					break;
				}
			}
			if (isOALFlightsExists) {
				return TAG_MIXED_AC_OAL_ITENERY;
			}
		}
	      return itenaryFlightType;
	}
	
	public static void main(String[] args) {
		
		List<String> airLineCodes=new ArrayList<String>();
		airLineCodes.add("ZX");
		airLineCodes.add("EVS");
		airLineCodes.add("AC");
		airLineCodes.add("QK");
		System.out.println(getItenaryFlightType(airLineCodes));
		airLineCodes.add("AGE");
		System.out.println(getItenaryFlightType(airLineCodes));
		airLineCodes.add("KK");
		System.out.println(getItenaryFlightType(airLineCodes));
	}
}
