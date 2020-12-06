package net.marcelektro;

public class Main {

    public static void main(String[] args) {
        String pog = "HELLO  THERE ARE      WAYYYYY TOOO      MANY           SPACES                              RIP    OOF              SAD";

        System.out.println(trimSpaces(pog));
    }

    public static String trimSpaces(String textToTrim) {
        return textToTrim.trim().replaceAll(" +", " ");
    }
}
