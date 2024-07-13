package Problem;

public class Problem {
    private String description;
    private TypeOfProblem type;
    private boolean isSolved;

    public Problem(String description, TypeOfProblem type){
        this.description = description;
        this.type = type;
    }
    public static String getDescription(String description){
        return description;
    }

}
