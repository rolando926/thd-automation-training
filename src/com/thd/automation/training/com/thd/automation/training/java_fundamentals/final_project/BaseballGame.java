package com.thd.automation.training.com.thd.automation.training.java_fundamentals.final_project;

import java.util.ArrayList;

/**
 * Created by rrolando on 11/24/16.
 */
public class BaseballGame extends Utilities {

    /*********************************************
     ****  Fields. All private for encapsulation.
     *********************************************/

    private String team1, team2;
    private boolean isTied = false;
    private int visitingTeamHitter = 1;
    private int homeTeamHitter = 1;
    private int[] bases = new int[3];
    private String[] visitingTeam = new String[9];
    private String[] homeTeam = new String[9];
    private ArrayList<String> TeamStats = new ArrayList<String>();
    private int[] score = {0,0};


    /******************************
     ****  Constructors
     ******************************/

    BaseballGame(){
        this.team1 = "Visiting Team";
        this.team2 = "Home Team";

        for(int i = 1; i <= 9; i++){
            visitingTeam[i-1] = "Player" + i;
            homeTeam[i-1] = "Player" + i;
        }

        //generateGame();
    }

    BaseballGame(String[] VisitingTeam, String[] HomeTeam){
        this.visitingTeam = VisitingTeam;
        this.homeTeam = HomeTeam;
    }

    /******************************
     ****  Getters and Setters
     ******************************/

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String[] getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String[] visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public String[] getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String[] homeTeam) {
        this.homeTeam = homeTeam;
    }

    /*************************************
     ****  Generate Championship Method
     *************************************/

    public void generateChampionship(){
        int counter = 0;
        int counterHomeTeam = 0;
        int counterVisitingTeam = 0;
        do{
            System.out.println("***********************************");
            System.out.println("************ Game " + (counter+1) + " ***************");
            System.out.println("***********************************\n");
            generateGame();
            if(score[0] > score[1]){
                counterVisitingTeam++;
            }
            else{
                counterHomeTeam++;
            }
            System.out.println("\n");

            //Reset score to 0-0
            score[0] = 0;
            score[1] = 0;
            TeamStats.clear();
            counter++;
        }while(counter < 7 && counterHomeTeam < 4 && counterVisitingTeam < 4);

        if (counterHomeTeam == 4){
            System.out.println("\n\n--------- "+ this.team2 +" are the Champions! ---------");
        }
        else{
            System.out.println("\n\n--------- "+ this.team1 +" are the Champions! ---------");

        }

        System.out.println(this.team1 + ": " + counterVisitingTeam);
        System.out.println(this.team2+ ": " + counterHomeTeam);
    }

    /******************************************************
     ****  Generate Full Game Method
     ****  Generates 9 innings of game and more if tied.
     ****  Prints Final Report
     ******************************************************/

    public void generateGame(){
        int counter = 0;

        // Lets generate a new game
        do{
            generateFullInning(counter+1);
            counter++;
        }while (counter < 9);

        // Continue playing if game is tied after 9 innings
        if(score[0] == score[1]){
            isTied = true;
        }
        while(isTied){
            generateFullInning(counter + 1);
            if(score[0] != score[1]){
                isTied = false;
            }
        }
        System.out.println("--------- Game Score ---------");
        System.out.println(team1+ ": " + score[0]);
        System.out.println(team2+ ": " + score[1]);

        System.out.println("\n--------- Game Stats ---------");
        printArrayList(TeamStats);

    }

    /*****************************************************************
     ****  Generates full inning based on Visitor and Home team call
     ****  Adds information to ArrayList
     *****************************************************************/

    private void generateFullInning(int inning){
        String visitingTeam, homeTeam;

        // Play a full inning method 1
        //visitingTeam = generateHalfInning(visitingTeamHitter, this.visitingTeam, true);
        //homeTeam = generateHalfInning(homeTeamHitter, this.homeTeam, false);

        //Play a full inning method 2
        visitingTeam = generateArrayHalfInning(visitingTeamHitter, this.visitingTeam, true);
        homeTeam = generateArrayHalfInning(homeTeamHitter, this.homeTeam, false);

        // Add stats for each team per inning
        if(visitingTeam != "") {
            TeamStats.add("Inning "+ inning + "("+ this.team1 +"): " +visitingTeam);
        }

        if(homeTeam != "") {
            TeamStats.add("Inning "+ inning + "("+ this.team2 +"): " +homeTeam);
        }

    }

    /******************************************************
     ****  Generates the 3 outs and keeps record of scores.
     ****  Keeps record of who is next to bat.
     ******************************************************/

    private String generateHalfInning(int hitter, String[] team, boolean isVisiting){
        int outs = 0;
        int randomNum;
        int runs = 0;
        String action = "";

        //Initialize bases
        bases[0] = 0;
        bases[1] = 0;
        bases[2] = 0;

        do{
            randomNum = generateRandomNumber(100);

            // Generate action and record action
            if(randomNum <= 17){
                action += team[hitter] + ": " + "single; ";

                // Move runners
                runs = moveRunners(1);
            }
            else if(randomNum > 17 && randomNum <= 24){
                action += team[hitter] + ": " + "double; ";

                // Move runners
                runs = moveRunners(2);
            }
            else if(randomNum > 24 && randomNum <= 26){
                action += team[hitter] + ": " + "triple; ";

                // Move runners
                runs = moveRunners(3);
            }
            else if(randomNum > 26 && randomNum <= 30){
                action += team[hitter] + ": " + "home-run; ";

                // Move runners
                runs = moveRunners(4);
            }
            else{
                outs++;
                runs = 0;
            }

            // Set correct score
            if (isVisiting){
                score[0] += runs;
            }
            else{
                score[1] += runs;
            }

            // Set correct value for hitter order
            if(hitter < 8) {
                hitter++;
            }
            else{
                hitter = 1;
            }

        }while(outs != 3);

        //Set correct value for team's hitter
        if(isVisiting){
            visitingTeamHitter = hitter;
        }
        else{
            homeTeamHitter = hitter;
        }

        return action;
    }


    /******************************************************
     ****  Moves runner through bases via conditionals.
     ****  Returns inning scores
     ******************************************************/

    public int moveRunners(int move){
        int score = 0;

        // Move runner from third base
        if (bases[2] == 1){
            bases[2] = 0;
            score++;
        }

        // Move runner from second base
        if (bases[1] == 1){
            bases[1] = 0;
            if (move == 1){
                bases[2] = 1;
            }
            else{
                score++;
            }
        }

        // Move runner from first base
        if (bases[0] == 1){
            bases[0] = 0;
            if (move == 1){
                bases[1] = 1;
            }
            else if (move == 2){
                bases[2] = 1;
            }
            else{
                score++;
            }
        }

        // If home run
        if (move == 4){
            score++;
        }

        // Move batter to base
        if (move != 4) {
            bases[move - 1] = 1;
        }

        return score;
    }


    /*********************************************************
     ****  Generates half inning using the push array method.
     ****  Keeps record of who is next to bat.
     *********************************************************/

    public String generateArrayHalfInning(int hitter, String[] team, boolean isVisiting){
        int outs = 0;
        int randomNum;
        int runs = 0;
        String action = "";

        //Initialize bases
        bases[0] = 0;
        bases[1] = 0;
        bases[2] = 0;

        do{
            randomNum = generateRandomNumber(100);
            if(randomNum <= 17){
                action += team[hitter] + ": " + "single; ";
                runs = calculateRunsMoveRunners(0);
                for(int i = 2; i < 0 ; i--){
                    bases[i] = bases[i-1];
                }
                bases[0] = 1;
            }
            else if(randomNum > 17 && randomNum <= 24){
                action += team[hitter] + ": " + "double; ";
                runs = calculateRunsMoveRunners(1);
                if(bases[0] != 0){
                    bases[2] = 1;
                }
                bases[1] = 1;

            }
            else if(randomNum > 24 && randomNum <= 26){
                action += team[hitter] + ": " + "triple; ";
                runs = calculateRunsMoveRunners(2);
                bases[2] = 1;

            }
            else if(randomNum > 26 && randomNum <= 30){
                action += team[hitter] + ": " + "home-run; ";
                runs++;
                runs = calculateRunsMoveRunners(2);
            }
            else{
                outs++;
                runs = 0;
            }

            // Set correct score
            if (isVisiting){
                score[0] += runs;
            }
            else{
                score[1] += runs;
            }

            // Set correct value for hitter order
            if(hitter < 8) {
                hitter++;
            }
            else{
                hitter = 1;
            }

        }while(outs != 3);

        //Set correct value for team's hitter
        if(isVisiting){
            visitingTeamHitter = hitter;
        }
        else{
            homeTeamHitter = hitter;
        }

        return action;
    }

    /******************************************************
     ****  Child method to push array method.
     ****  Pushes array based on hits. Returns runs.
     ******************************************************/

    public int calculateRunsMoveRunners(int move){
        int runs = 0;
        for(int i = 2; i >= (2-move); i--){
            if(bases[i] == 1){
                runs++;
                bases[i] = 0;
            }
        }
        return runs;
    }
}
