package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
	private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.exercises = new ArrayList<>();
        this.type = type;
        this.exerciseCount = exerciseCount;

    }
    public void addExercise(Exercise exercise){
        if (this.exercises.size()< this.exerciseCount){
        this.exercises.add(exercise);
        }
    }
    public boolean removeExercise(String name, String muscle){
        for (Exercise exercise : exercises){
            if (exercise.getName().equals(name)&&exercise.getMuscle().equals(muscle)){
                this.exercises.remove(exercise);
                return true;

            }
        }
        return false;
    }
    public  Exercise getExercise(String name, String muscle){
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }

        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise(){
        return this.exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).get();

    }

    public int getExerciseCount(){
        return exercises.size();
    }
	public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout type: %s%n", this.type));
        for (Exercise exercise: exercises){

        sb.append(String.format("Exercise: %s%n", exercise.toString()));

        }
        return sb.toString();
    }


}
