public class Course {
    String[] obstacles = {"Wall", "Pit", "River", "Pipe"};
    private String go;

    public Course(String[] obstacles, String go) {
        this.obstacles = obstacles;
        this.go = go;
    }

    public Course() {

    }

    public void toTheLane() {
        System.out.println("[" + go + "]");
    }
}
