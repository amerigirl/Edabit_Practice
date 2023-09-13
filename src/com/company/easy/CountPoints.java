package com.company.easy;

public class CountPoints {
    public static int footballPoints(int wins, int draws, int loses) {
		/*Create a function that takes the number of wins, draws and losses and
		  calculates the number of points a football team has obtained so far.
						wins get 3 points
						draws get 1 point
						losses get 0 points
					*/

        /*
        1. create the function with proper params
        2. create a loop for the wins and another one for the draws (losses will always get zero)
        3.create a total wins and add everything up?
        */

        int totalWins = 0;
        int totalDraws = 0;

        for (int i = 0; i < wins; i++){
         totalWins = wins * 3;
        }

        totalDraws = draws;

        int totalPoints = totalWins + totalDraws;

        return totalPoints;

    }


//        int totalWins = 0;
//        int totalDraws = 0;
//
//        for (int i = 0; i < wins; i++){
//            totalWins = wins * 3;
//        }
//
//        for (int i = 0; i < draws; i++){
//            totalDraws = draws * 1;
//        }
//
//        int totalNumber = totalWins + totalDraws;
//        return totalNumber;
//
}
