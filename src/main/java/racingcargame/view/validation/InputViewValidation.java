package racingcargame.view.validation;

public class InputViewValidation {

    private static final int NEGATIVE_POINT = 0;

    public static void validNegativeNumber(int input) {
        if (input < NEGATIVE_POINT) {
            throw new IllegalArgumentException();
        }
    }
}