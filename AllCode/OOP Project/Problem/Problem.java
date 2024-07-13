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
    public static TypeOfProblem getType(TypeOfProblem type){
        return type;
    }
}
