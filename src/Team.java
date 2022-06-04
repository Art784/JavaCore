public class Team {
    private String teamName;
    String[] participants = new String[4];
    private String infoAllMembers;
    private String finished;


    public Team(String teamName, String[] participants, String infoAllMembers, String finished) {
        this.teamName = teamName;
        this.participants = participants;
        this.infoAllMembers = infoAllMembers;
        this.finished = finished;
    }

    public void finished() {
            System.out.println("[" + teamName + ", " + finished + "]");
        }

public void infoAllTeam() {
    System.out.println("[" + teamName + ", " + infoAllMembers + "]");
}

public String getInfoAllMembers() {
        return infoAllMembers;
}
public String getFinished() {
        return finished;
}

}
