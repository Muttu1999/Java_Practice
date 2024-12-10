package InterMediate.Bstraction.abstraction.athlet;

import java.util.Random;

public class BasketBallPlayer extends Athlete{

    private double doublefreeThrowPerCentage;
    private double pointsPerGame;

    public BasketBallPlayer(String name, String nickname, int yearBorn, String team, int numerOfCompetations, double doublefreeThrowPerCentage, double pointsPerGame) {
        super(name, nickname, yearBorn, team, numerOfCompetations);
        this.doublefreeThrowPerCentage = doublefreeThrowPerCentage;
        this.pointsPerGame = pointsPerGame;
    }

    public BasketBallPlayer(String name, String nickname, int yearBorn, String team, int numerOfCompetations) {
        super(name, nickname, yearBorn, team, numerOfCompetations);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getBio() {
        super.getBio();
    }

    @Override
    public void compete() {
        super.compete();
    }

    @Override
    public String getTeam() {
        return super.getTeam();
    }

    @Override
    public void setTeam(String team) {
        super.setTeam(team);
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextDouble()*100 > doublefreeThrowPerCentage){
            System.out.println(super.getName() +"failed to score free thrw");

        }else {
            System.out.println(super.getName()+ "scored free throw." );
        }


        }
    }

