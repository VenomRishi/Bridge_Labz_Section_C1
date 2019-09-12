package com.bridgelabz.arrays;

import com.bridgelabz.utility.ArraysUtility;

public class SortDeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cardType = { "hearts", "tiles", "pikes", "clovers" };
		char[] cardNumbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd' };
		String[] cardsArray = new String[52];
		int start = 0, end = 12, j1 = 0;
		// for combination of cardType and cardNumbers
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}
		ArraysUtility.shuffleCardsDeck(cardsArray);
		String[] arrnew=new String[6];
		for (int i = 0; i < 6; i++) {
			//System.out.print(cardsArray[i]+ " ");
			arrnew[i]=cardsArray[i];
		}
		for (int i = 0; i < arrnew.length-1; i++) {
			for (int j = 0; j < arrnew.length-i-1; j++) {
				int n1=arrnew[j].length()-1;
				int n2=arrnew[j+1].length()-1;
				if(arrnew[j].charAt(n1)>arrnew[j+1].charAt(n2)) {
					String temp=arrnew[j];
					arrnew[j]=arrnew[j+1];
					arrnew[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(arrnew[i]+ " ");
		}
		
		
	}

}
