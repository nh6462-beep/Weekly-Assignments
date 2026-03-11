public class UC5 {
    public static void main(String[] args) {
        String[] letterO_Top = {" ***", "  ", "***", "  ", "***", "  ", "****"};
        String[] letterO_Middle1 = {"*   *", "*   *", "*    ", "*   *"};
        String[] letterO_Middle2 = {"*   *", "*   *", "* ** ", "*   *"};
        String[] letterO_Middle3 = {"*   *", "*   *", "**   ", "*   *"};
        String[] letterO_Middle4 = {"*   *", "*   *", "**   ", "*   *"};
        String[] letterO_Bottom = {" ***", "  ", "***", "  ", "***", "  ", "****"};
        String[] bannerLines = {
            String.join("", letterO_Top),
            String.join("", letterO_Middle1),
            String.join("", letterO_Middle2),
            String.join("", letterO_Middle3),
            String.join("", letterO_Middle4),
            String.join("", letterO_Bottom)
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
