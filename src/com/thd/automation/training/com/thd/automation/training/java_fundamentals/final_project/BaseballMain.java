package com.thd.automation.training.com.thd.automation.training.java_fundamentals.final_project;

/**
 * Created by rrolando on 11/24/16.
 */
public class BaseballMain {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int counter = 0;
        BaseballGame game1 = new BaseballGame();

        //String[] cubs = {"Fowler","Schwarber","Bryant","Rizzo","Zobrist","Russell","Contreras","Heyward","Baez"};
        //String[] indians = {"Santana","Kipnis","Lindor","Napoli","Ramirez","Chisenhall","Davis","Crisp","Perez"};

        game1.setTeam1("Cubs");
        game1.setTeam2("Indians");
        //game1.setHomeTeam(indians);
        //game1.setVisitingTeam(cubs);
        do {
            game1.generateGame();
            counter++;
        }while(counter<1000);
        //game1.generateChampionship();

        final long endTime = System.currentTimeMillis();

        System.out.println("\n "+ startTime + "\n" + endTime + "\nTotal execution time: " + (endTime - startTime));
    }
}
