public class UC7 {
    
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
    
    static CharacterPatternMap createCharacterO() {
        String[] pattern = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        return new CharacterPatternMap('O', pattern);
    }
    
    static CharacterPatternMap createCharacterOSecond() {
        String[] pattern = {
            "***  ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "***  "
        };
        return new CharacterPatternMap('O', pattern);
    }
    
    static CharacterPatternMap createCharacterP() {
        String[] pattern = {
            "***  ",
            "*    ",
            "* ** ",
            "**   ",
            "**   ",
            "***  "
        };
        return new CharacterPatternMap('P', pattern);
    }
    
    static CharacterPatternMap createCharacterS() {
        String[] pattern = {
            "****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "****"
        };
        return new CharacterPatternMap('S', pattern);
    }
    
    public static void main(String[] args) {
        CharacterPatternMap charO1 = createCharacterO();
        CharacterPatternMap charO2 = createCharacterOSecond();
        CharacterPatternMap charP = createCharacterP();
        CharacterPatternMap charS = createCharacterS();
        
        for (int line = 0; line < 6; line++) {
            StringBuilder banner = new StringBuilder();
            banner.append(charO1.getLine(line));
            banner.append(charO2.getLine(line));
            banner.append(charP.getLine(line));
            banner.append(charS.getLine(line));
            System.out.println(banner.toString());
        }
    }
}
