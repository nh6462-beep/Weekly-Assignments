# OOPSBannerApp Copilot Instructions

## Project Overview

OOPSBannerApp is an **educational Java project** demonstrating progressive refinement of string output and manipulation through three interconnected Use Cases (UC). Each UC teaches specific Java concepts while building toward optimal string handling patterns.

## Architecture: Three-UC Progression Model

The project follows a **linear progression** where each Use Case refactors the previous:

- **UC1**: Print literal "OOPS" text to console (Java fundamentals: class structure, main method, static keyword)
- **UC2**: Display "OOPS" as ASCII art banner using individual `System.out.println()` statements (string literals, manual formatting)
- **UC3**: Refactor UC2 using `String.join()` for efficient concatenation (dependency: understand String immutability and performance concerns)

### Design Philosophy
Each UC deliberately builds on the last to teach incrementally. When modifying UC2, consider the educational goal before UC3 refactoring. When enhancing UC3, focus on efficiency patterns (avoid premature optimization in earlier UCs).

## Key Implementation Patterns

### Pattern 1: String.join() for Banner Line Construction (UC3)

**Where**: [OOPSBannerApp.java](OOPSBannerApp.java) lines 6-26

**What It Does:**
```java
String line1 = String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
```

**Why This Pattern:**
- Avoids string immutability overhead (no intermediate String objects like `"a" + "b" + "c"`)
- Treats each letter segment as independent variable (e.g., letter O: `" *** "`, letter P: `" *** "`)
- Enables future modularization: segments could move to methods or arrays

**When to Apply:**
- When concatenating multiple small strings in a single operation
- When banner segments are fixed (current use case)
- NOT appropriate for dynamic segment generation (save for UC4 refactoring)

### Pattern 2: Letter Segment Decomposition (UC3 Mental Model)

Even though UC3 doesn't fully modularize, understand the decomposition:
```
Each line represents 4 letters: O, O, P, S
Each letter occupies specific column positions with distinct patterns:
  - Lines 1, 6: Top/bottom borders (" *** " or similar)
  - Lines 2-5: Middle sections with varied left/right edges
```

When extending with new letters, follow this decomposition: define each line's segment for the new letter, then add to corresponding `String.join()` call.

## Critical Developer Workflows

### Compiling the Project
```bash
javac OOPSBannerApp.java
```

### Running the Application
```bash
java OOPSBannerApp
```

**Expected Output:**
```
 ***  ***  ***  ****
*   **   **    *   *
*   **   ** **  *   *
*   **   **    *   *
*   **   **    *   *
 *** ***  ***  ****
```

### Git Workflow (Feature Branch per UC)
```bash
git checkout -b feature/UC1-PrintOOPS       # For UC1 work
git checkout -b feature/UC2-BannerDisplay   # For UC2 work
git checkout -b feature/UC3-StringJoin      # For UC3 optimization
```

Each notebook (UC1_Implementation.ipynb, UC2_BannerImplementation.ipynb, UC3_StringJoinApproach.ipynb) documents the corresponding feature branch strategy and learning objectives.

## Project-Specific Conventions

### File Organization
- **OOPSBannerApp.java**: Single production class containing main() and full implementation
- **UC*_*.ipynb**: Jupyter notebooks serving as learning documentation (not code to execute, but to read)

### Naming
- Use Use Case prefix: "UC1", "UC2", "UC3" when discussing features
- Branch names: `feature/UC{N}-{DescriptiveName}` (as documented in notebooks)

### Output Format
- Exactly 6 lines of ASCII art
- Each line printed via individual `System.out.println()` in current design
- No trailing whitespace intentionally added (banner edges are padded within strings)

## Integration Points & Dependencies

### External Dependencies
None. This is pure Java using only `java.lang` core classes:
- `String.join()` (Java 8+)
- `System.out.println()`

### Cross-Component Communication
Single class: all logic contained in OOPSBannerApp.main(). No inter-component communication needed at current stage.

### Future Integration Points (When Extending)
If refactoring toward UC4 (parameterized banners):
- Extract `createLine(String... segments)` helper method
- Consider parameter passing for different banner patterns
- Notebooks would guide this progression

## Code Examples from This Project

### Example 1: UC3's Segment-Based Approach
```java
// Line 1 combines letter O, O, P, S segments via join()
String line1 = String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
System.out.println(line1);
```
Read as: "Join 8 segments with empty delimiter to form complete line."

### Example 2: Comparing UCs at Same Task
- **UC2**: `System.out.println(" ***  ***  ***  ****");` (hardcoded)
- **UC3**: `String.join("", " ***", "  ", "***", "  ", "***", "  ", "****"); System.out.println(line1);` (segmented)

Same output, different teaching goal. Don't merge them—maintain both for educational contrast in notebooks.

## When Adding Features or Fixing Issues

1. **Is it refactoring toward next UC?** Check corresponding notebook first (UC2_BannerImplementation.ipynb, etc.) to ensure alignment with stated learning objectives.

2. **Are you adding a new letter?** Decompose into 6 line segments (one per line), update each `String.join()` call in main().

3. **Modifying banner output?** Verify all 6 lines remain, output remains ASCII printable, no external dependencies introduced.

4. **Extend vs. new UC?** Changing OOPSBannerApp.java = refinement of current UC. Creating new Java class = new Use Case (plan with notebooks).

## Documentation Locations

- **Learning objectives**: See corresponding UC*_Implementation.ipynb notebooks
- **Architectural decisions**: UC3_StringJoinApproach.ipynb explains why String.join() chosen over + operator
- **Git strategy**: Each notebook's "Create Feature Branch" section
- **Command reference**: This file for quick compile/run; notebooks for detailed explanations
