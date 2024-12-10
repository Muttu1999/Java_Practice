package InterMediate.Bstraction.abstraction.athlet;

public class Athlete {
    private String name;
    private String nickname;
    private int yearBorn;
    private String team;
    private int numerOfCompetations;

    public Athlete(String name, String nickname, int yearBorn, String team, int numerOfCompetations) {

        this.name = name;
        this.nickname = nickname;
        this.yearBorn = yearBorn;
        this.team = team;
        this.numerOfCompetations = numerOfCompetations;
    }

    public String getName(){
        return name;
    }

    public void getBio(){
        System.out.println(name + "( " + nickname + ")");
        System.out.println("Born in " + yearBorn);
        System.out.println("Last team is " + team + " and took part in  " + numerOfCompetations + "compitations");

    }
    public void compete(){
        System.out.println(name + " took part in competion.");
        numerOfCompetations++;
    }
    public  String getTeam(){
        return team;
    }
    public void setTeam(String team){
        this.team = team;
    }
}
