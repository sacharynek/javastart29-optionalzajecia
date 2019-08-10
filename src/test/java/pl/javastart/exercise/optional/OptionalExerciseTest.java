package pl.javastart.exercise.optional;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OptionalExerciseTest {

    private OptionalExercise optionalExercise;

    @Before public void init() {
        optionalExercise = new OptionalExercise();
    }

    @Test public void shouldCreateEmptyOptional() {
        Optional optional = optionalExercise.createEmptyOptional();

        // then
        assertThat(optional.isPresent(), is(false));
    }

    @Test public void shouldOptionalWithValue() {
        Optional optional = optionalExercise.createOptionalWithValue();

        // then
        assertThat(optional.isPresent(), is(true));
    }

    @Test public void shouldOptionalWithGivenValue() {
        Optional<String> optional = optionalExercise.createOptionalWithValue("Test value");

        // then
        assertThat(optional.isPresent(), is(true));
        assertThat(optional.get(), is("Test value"));
    }

    @Test public void shouldOptionalWithGivenValueAndDefaultValue() {
        // given
        Optional<String> optional = Optional.of("Test value");

        // when
        String result = optionalExercise.getOptionalValueOrDefault(optional, "Default value");

        // then
        assertThat(result, is("Test value"));
    }

    @Test public void shouldOptionalWithGivenValueAndDefaultValue2() {
        // given
        Optional<String> optional = Optional.empty();

        // when
        String result = optionalExercise.getOptionalValueOrDefault(optional, "Default value");

        // then
        assertThat(result, is("Default value"));
    }

}
