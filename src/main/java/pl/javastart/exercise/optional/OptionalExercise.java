package pl.javastart.exercise.optional;

import java.util.Optional;

public class OptionalExercise {

    public Optional createEmptyOptional() {
        return Optional.ofNullable(null);//Optional.empty()
    }

    public Optional createOptionalWithValue() {
        return  Optional.of(true);
    }

    public Optional<String> createOptionalWithValue(String s) {
        return Optional.of(s);
    }

    public String getOptionalValueOrDefault(Optional<String> optional, String defaultValue) {
        return optional.orElse(defaultValue);
    }
}
