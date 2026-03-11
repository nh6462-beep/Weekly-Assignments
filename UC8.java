import java.util.HashMap;
import java.util.Map;

public class UC8 {
    
    static class CharacterPatternMap {
        private char character;
        private String[] lines;
        
        public CharacterPatternMap(char character, String[] lines) {
            this.character = character;
            this.lines = lines;
        }
        
        public char getCharacter() {
            return character;
        }
        
        public String getLine(int lineIndex) {
            if (lineIndex >= 0 && lineIndex < lines.length) {
                return lines[lineIndex];
            }
            return "";
        }
        
        public String[] getLines() {
            return lines;
        }
    }
    
    static Map<Character, CharacterPatternMap> initializePatterns() {
        Map<Character, CharacterPatternMap> patterns = new HashMap<>();
        
        String[] patternO = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        
        String[] patternP = {
            "***  ",
            "*    ",
            "* ** ",
            "**   ",
            "**   ",
            "***  "
        };
        
        String[] patternS = {
            "****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "****"
        };
        
        patterns.put('O', new CharacterPatternMap('O', patternO));
        patterns.put('P', new CharacterPatternMap('P', patternP));
        patterns.put('S', new CharacterPatternMap('S', patternS));
        
        return patterns;
    }
    
    static void renderBanner(String word, Map<Character, CharacterPatternMap> patterns) {
        int totalLines = 6;
        
        for (int line = 0; line < totalLines; line++) {
            StringBuilder banner = new StringBuilder();
            
            for (char ch : word.toCharArray()) {
                CharacterPatternMap pattern = patterns.get(ch);
                if (pattern != null) {
                    banner.append(pattern.getLine(line));
                }
            }
            
            System.out.println(banner.toString());
        }
    }
    
    public static void main(String[] args) {
        Map<Character, CharacterPatternMap> characterPatterns = initializePatterns();
        renderBanner("OOPS", characterPatterns);
    }
}
