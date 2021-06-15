/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sindhuja
 *
 */
public class SplitJava {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String splitstring="aaa;bbbb;vccc;dddd;ffff";
	String[] arrSplt=splitstring.split(";",-2);
		
	
		arrSplt=splitstring.split(";",-2);
		
		for(int i=0;i<arrSplt.length;i++)
		{
		System.out.println("The split word is:"+arrSplt[i]);}
		
		

	}

}

