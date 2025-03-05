import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeDecoder {
    public static void main(String[] args) {
        Map<Character, String> morseMap = new HashMap<>();
        String morse;

        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");

        String flag = new String();

        Scanner sc = new Scanner(System.in);
        morse = sc.nextLine();
        String[] eachMorse = morse.split(" ");
        for (int i = 0; i < eachMorse.length; i++) {
            char ch = getKeyByValue(morseMap, eachMorse[i]);
            flag += ch;
        }
        System.out.println(flag);
    }
    public static char getKeyByValue(Map<Character, String> morseMap, String value) {
        for (Map.Entry<Character, String> entry : morseMap.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
