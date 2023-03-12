package br.com.LightWeightAPI.domain.workoutcompound;

import br.com.LightWeightAPI.domain.exercise.MuscularGroupEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class WorkoutCompoundDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String exerciseName;
    private Integer series;
    private Integer reps;
    private MuscularGroupEnum muscularGroup;

    public WorkoutCompoundDTO() {

    }

    public WorkoutCompoundDTO(WorkoutCompound workoutCompound) {
        this.exerciseName = workoutCompound.getExercise().getName();
        this.series = workoutCompound.getSeries();
        this.reps = workoutCompound.getReps();
        this.muscularGroup = workoutCompound.getExercise().getMuscularGroup();
    }

}
