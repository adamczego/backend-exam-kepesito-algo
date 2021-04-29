package hu.nive.ujratervezes.adddigits;

import java.util.Arrays;



public class AddDigits {

    public static int addDigits(String input) {

        if (input == null || input.equals("")) return -1;

        String digitString = String.join("", input.replaceAll("\\D+", "").split(""));

        if (digitString.equals("")) return 0;

        return
            Arrays.stream(digitString.split(""))
            .map(Integer::parseInt)
            .reduce(Integer::sum)
            .orElse(0);

    }

}
