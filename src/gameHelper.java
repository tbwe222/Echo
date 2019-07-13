import java.util.Scanner;

public class gameHelper {
    private int[] locations;
    int numOfHits = 0;
    String checkUserInput() {
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        String result = "miss";
        for (int cell : locations) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        } // out of the loop
        if (numOfHits == locations.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    public int[] getLocations() {
        return locations;
    }

    public void setLocations(int[] locations) {
        this.locations = locations;
    }
}
class gameHelperTest{
    public static void main(String[] args) {
        int numOfGuesses = 0;
        gameHelper helper = new gameHelper();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        helper.setLocations(locations);
        boolean isAlive = true;
        while(isAlive == true) {
            String result = helper.checkUserInput();
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } // close if
        } // close while
    }
}