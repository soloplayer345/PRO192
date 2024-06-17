
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyUtilities implements IUtilities {

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        if (value.length() >= 2 && value.length() <= 10 && Mylibs.allDigit(value)) {
            return Integer.parseInt(value);
        } else {
            return value.length();
        }
    }

    @Override
    public String removeDuplicatedWords(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }
        Mylibs.toTitleCase(value);
        StringBuilder sb = new StringBuilder();
        String[] words = value.split("\\s+"); // Split by whitespace

        for (int i = 0; i < words.length; i++) {
            boolean foundDuplicate = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    foundDuplicate = true;
                    break;
                }
            }
            if (!foundDuplicate) {
                sb.append(words[i]).append(" ");
            }
        }

        return Mylibs.toTitleCase(sb.toString().trim());
    }

    @Override
    public int checkFormatString(String value) {
        String pattern = "^[A-Z]{3}\\.[0-9]{6}\\.[@#\\$]$";
        if (value.isBlank() || !value.trim().matches(pattern)) {
            return value.length();
        } else {
            String[] part = value.split("\\.");
            return Integer.parseInt(part[1]);
        }
    }

    @Override
    public double sumNumbers(String value) {
        double sum = 0.0;
        Pattern pattern = Pattern.compile("\\d+(?:\\.\\d+)?"); // Regex to find digits with optional decimal point
        Matcher matcher = pattern.matcher(value.trim());
        while (matcher.find()) {           
            String numberStr=matcher.group();
            sum+=Double.parseDouble(numberStr);
        }
        return sum;
    }
}
