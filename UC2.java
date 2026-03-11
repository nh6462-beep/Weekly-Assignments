/**
 * UC2: OOPS Banner Display Implementation
 * 
 * Use Case 2 - ASCII Art Banner with Individual Print Statements
 * This class extends UC1 by displaying "OOPS" as a large ASCII art banner.
 * 
 * Demonstrates:
 * - Multi-line console output
 * - ASCII art design patterns
 * - Manual string formatting with * and spaces
 * - Multiple System.out.println() statements
 * 
 * Banner Design:
 * Uses * characters and spaces to create 4 letters (O, O, P, S)
 * arranged in a 6-line × 20-character grid format
 * 
 * Goal: Display OOPS as a decorative ASCII art banner
 * 
 * @author OOPSBannerApp Team
 * @version 2.0
 * @since 2026-02-17
 */
public class UC2 {
    
    /**
     * Main method - Entry point of the Java application
     * 
     * Displays the OOPS banner by printing individual lines of ASCII art.
     * Each println() statement outputs one line of the banner.
     * 
     * @param args Command-line arguments (not used in UC2)
     */
    public static void main(String[] args) {
        // Line 1: Top borders of all letters O, O, P, S
        System.out.println(" ***  ***  ***  ****");
        
        // Line 2: Upper middle section of letters
        System.out.println("*   **   **    *   *");
        
        // Line 3: Middle section (distinctive for each letter)
        System.out.println("*   **   ** **  *   *");
        
        // Line 4: Lower middle section
        System.out.println("*   **   **    *   *");
        
        // Line 5: Lower section continuation
        System.out.println("*   **   **    *   *");
        
        // Line 6: Bottom borders of all letters
        System.out.println(" *** ***  ***  ****");
    }
}
