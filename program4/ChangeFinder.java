/*
 * Author: Christopher Miller, Connor Morrison
 * Date: 04/13/18
 * Overview: Uses a greedy algorithm to return a array of change.
 */

package program4;


import java.util.ArrayList;

public final class ChangeFinder {

	public static int[] getChange(int change, int[]coins) {
		ArrayList<Integer> changeList = new ArrayList<Integer>(); 
		if(change == 0) {
			throw new IllegalArgumentException("No change is needed from 0 cents");
		}
		while(change != 0) {
			if(change >= coins[3])
			{
				changeList.add(coins[3]);
				change -=coins[3];
			}
			else if(change >= coins[2]) {
				changeList.add(coins[2]);
				change -=coins[2];
			}
			else if(change >= coins[1]) {
				changeList.add(coins[1]);
				change -=coins[1];
			}
			else if(change >= coins[0]) {
				changeList.add(coins[0]);
				change -=coins[0];
			}
		}
		int list[] = new int[changeList.size()];
		for(int i=0; i<changeList.size(); i++){
			list[i] = changeList.get(i).intValue();
		}
		
		return list;
	}

}
