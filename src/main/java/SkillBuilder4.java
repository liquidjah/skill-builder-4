import java.util.*;
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {
    // replace this line with your constants

    public static String findTYPattern(String s) {
        String finalResult = "";
        String endResult = "";
        char currentChar = ' ';
        boolean hasY = false;
        for (int i = 0; i < s.length(); i++) {
            if (hasY == true){
                break;
            }
            currentChar = s.charAt(i);
            if (currentChar == 't' || currentChar == 'T') {
                finalResult = finalResult + currentChar;
                for(int j = i + 1; j < s.length(); j++) {
                    currentChar = s.charAt(j);
                    if (currentChar == 'y' || currentChar == 'Y') {
                        finalResult = finalResult + currentChar;
                        endResult = finalResult;
                        hasY = true;
                        break;
                    }
                    else {
                        finalResult = finalResult + currentChar;
                    }
                }
            }
        }
        if (hasY == false){
            endResult = "";
        }
        return endResult;
    }
}
