// Your header comment goes here.

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        for (int i = 0; i <= ROCKET_SIZE + 1; i++) {
            for (int j = 1; j <= ROCKET_SIZE + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 0; j <= i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
    
    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {
        for (int i = 0; i <= ROCKET_SIZE + 1; i++) {
            for (int j = 1; j <= ROCKET_SIZE + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 0; j <= i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }

    }
    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
     for(int row = 1; row <= ROCKET_SIZE; row ++) {
            System.out.print("|"); {

            int dots = (ROCKET_SIZE - 1) - row;
            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            int triangles = row; 
            for(int i = 0; i < triangles; i ++){
                System.out.print("/\\");
            }

            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            for(int i = 0; i < triangles; i ++){
                System.out.print("/\\");
            }

            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            System.out.println("|");
        }
    }

    }
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        for(int row = 0; row < ROCKET_SIZE; row ++) {
            System.out.print("|");

            int dots = row;
            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            int triangles = ROCKET_SIZE - row; 
            for(int i = 0; i < triangles; i ++){
                System.out.print("\\/");
            }

            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }



            System.out.println("|");
        }

    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        System.out.print("+");
        // write a loop to print =* a variable number of times
        for (int n = 0; n < ROCKET_SIZE * 2; n ++) {
            System.out.print("=*");
        }
        // print a
        System.out.print("+");
        System.out.println();
    }
}