public class GettingLoopy {
    public static void main(String[] args) {
        // Part A: Counting (for) Loops
        System.out.println("Counting up by 1 from 0 to 30:");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nCounting down by 1 from 30 to 0:");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nCounting up by 3 from 0 to 18:");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nCounting down by 2 from 10 to 0:");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }

        // Part B: Output for loops
        System.out.println("\n\nNested loop - Figure 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Copyright © 2019-2020, University of Cincinnati, Ohio. All rights reserved.");

        System.out.println("\nNested loop - Figure 2:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nNested loop - Figure 3:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

