/*
 * Author: Christopher Miller, Connor Morrison
 * Date: 04/13/18
 * Overview: Uses dynamic programming to return a array of change.
 */

package program4;


import java.util.ArrayList;

public final class ChangeFinder {

	public static int[] getChange(int change, int[]coins) {
		ArrayList<Integer> changeList = new ArrayList<Integer>(); 
		if(change == 0 || coins.length == 0) {
			throw new IllegalArgumentException("No change is needed from 0 cents");
		}
		int[] changeSolutions = new int[change+2];
		changeSolutions[0] = 0;
		changeSolutions[1] = 1;
		changeSolutions = getChangeSolutions(change, 2, coins, changeSolutions);
		int[] minCoinList = new int[changeSolutions[change]];
		return getCoinList(change, coins, changeSolutions, minCoinList);
	}

	public static int[] getChangeSolutions(int change, int start, int[]coins, int[]changeList) {
		int minCoins = change;
		for(int coin : coins) {
			if(start-coin>=0 && changeList[start-coin]+1<minCoins) {
				minCoins = changeList[start-coin]+1;
			}
		}
		changeList[start] = minCoins;
		if(changeList[change] ==0) {
			return(getChangeSolutions(change, start+1, coins, changeList));
		}
		else {
			return changeList;
		}
	}
	
	public static int[] getCoinList(int change, int[]coins, int[]changeSolutions, int[] minCoinList) {
		int minCoins = change;
		int minCoin = 100;
		for(int coin : coins) {
			if(start-coin>=0 && changeList[start-coin]+1<minCoins) {
				minCoins = changeList[start-coin]+1;
			}
		}
	}
}
