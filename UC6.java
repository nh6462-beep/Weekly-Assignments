public class UC6 {
    
    static String buildLine1() {
        return String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
    }
    
    static String buildLine2() {
        return String.join("", "*   *", "*   *", "*    ", "*   *");
    }
    
    static String buildLine3() {
        return String.join("", "*   *", "*   *", "* ** ", "*   *");
    }
    
    static String buildLine4() {
        return String.join("", "*   *", "*   *", "**   ", "*   *");
    }
    
    static String buildLine5() {
        return String.join("", "*   *", "*   *", "**   ", "*   *");
    }
    
    static String buildLine6() {
        return String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
    }
    
    public static void main(String[] args) {
        String[] bannerLines = {
            buildLine1(),
            buildLine2(),
            buildLine3(),
            buildLine4(),
            buildLine5(),
            buildLine6()
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
