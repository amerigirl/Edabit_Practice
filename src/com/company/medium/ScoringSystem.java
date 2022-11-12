package com.company.medium;

public class ScoringSystem {
    /*Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system.
    A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital letters,
    return an array of the players' scores.
    * */


    public static int[] calculateScores(String initials) {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        for(int i = 0; i < initials.length(); i++) {
            if(initials.charAt(i) == 'A') {
                aCount++;
            }

            if(initials.charAt(i) == 'B'){
                bCount++;
            }

            if(initials.charAt(i) == 'C'){
                cCount++;
            }
        }

        return new int[] {aCount, bCount, cCount};
    }
}
