public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: Store banner lines in a String array
        String[] bannerLines = {
            String.join("", " ***", "  ", "***", "  ", "***", "  ", "****"),
            String.join("", "*   *", "*   *", "*    ", "*   *"),
            String.join("", "*   *", "*   *", "* ** ", "*   *"),
            String.join("", "*   *", "*   *", "**   ", "*   *"),
            String.join("", "*   *", "*   *", "**   ", "*   *"),
            String.join("", " ***", "  ", "***", "  ", "***", "  ", "****")
        };
        
        // UC4: Use enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
