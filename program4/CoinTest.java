/*
 * Author: Christopher Miller, Connor Morrison
 * Date: 04/13/18
 * Overview: Uses a greedy algorithm to return a array of change. 
 */

package program4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CoinTest {

	@Test
	void testMinCoinsUS24() {
		int change = 24;
		int changeArray[] = {10,10,1,1,1,1};
		int coins[] = {1,5,10,25};
		assertArrayEquals(changeArray, ChangeFinder.getChange(change,coins));
	}
	
	@Test
	void testMinCoinsUS99() {
		int change = 99;
		int changeArray[] = {25,25,25,10,10,1,1,1,1};
		int coins[] = {1,5,10,25};
		assertArrayEquals(changeArray, ChangeFinder.getChange(change,coins));
	}
	
	@Test
	void testMinCoinsUS52() {
		int change = 52;
		int changeArray[] = {25,25,1,1};
		int coins[] = {1,5,10,25};
		assertArrayEquals(changeArray, ChangeFinder.getChange(change,coins));
	}
	
	@Test
	void testMinCoinsWeird16() {
		int change = 16;
		int changeArray[] = {5,5,5,1};
		int coins[] = {1,5,12,25};
		assertArrayEquals(changeArray, ChangeFinder.getChange(change,coins));
	}
	
	@Test
	void testNoCoins() {
		int change = 0;
		int coins[] = {1,5,12,25};
		Exception e = assertThrows(IllegalArgumentException.class, () -> {ChangeFinder.getChange(change,coins); });
		assertEquals("No change is needed from 0 cents", e.getMessage());
	}

}
