package Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {
    public static void main(String[] args) {
        String str = "The main story arc concerns Harry's struggle against Lord Voldemort, a dark wizard who intends to become immortal, " +
                "overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles (non-magical people).";

       String[] arrStr = str.split("\\s");

        for (String elem : arrStr ) {
            if(elem.equalsIgnoreCase("as") || elem.equalsIgnoreCase("the") || elem.equalsIgnoreCase("and")){
                elem = "Java";
            }
            System.out.print(elem + " ");
        }

    }
}
