package com.company.easy;

public class CountPoints {
    public static int footballPoints(int wins, int draws, int loses) {
		/*Create a function that takes the number of wins, draws and losses and
		  calculates the number of points a football team has obtained so far.
						wins get 3 points
						draws get 1 point
						losses get 0 points
					*/

        int totalWins = 0;
        int totalDraws = 0;

        for (int i = 0; i < wins; i++){
            totalWins = wins * 3;
        }

        for (int i = 0; i < draws; i++){
            totalDraws = draws * 1;
        }

        int totalNumber = totalWins + totalDraws;
        return totalNumber;
    }
}
