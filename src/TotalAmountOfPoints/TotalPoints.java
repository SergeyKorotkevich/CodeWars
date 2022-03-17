package TotalAmountOfPoints;
/*
Our football team finished the championship. The result of each match look like "x:y".
Results of all matches are recorded in the collection.
        For example: ["3:1", "2:2", "0:1", ...]
        Write a function that takes such collection and counts the points of our team in the championship.
        Rules for counting points for each match:
        if x>y - 3 points
        if x<y - 0 point
        if x=y - 1 point
        Notes:
        there are 10 matches in the championship
        0 <= x <= 4
        0 <= y <= 4
 */
public class TotalPoints {
    public static int points(String[] games) {
        int result = 0;
        for (String game : games) {
            String[] gamesResult = ":".split(game);
            String firstResult = gamesResult[0];
            String secondResult = gamesResult[1];
            if (Integer.parseInt(firstResult) > Integer.parseInt(secondResult)) {
                result += 3;
            } else if (Integer.parseInt(firstResult) < Integer.parseInt(secondResult)) {
                result += 0;
            } else {
                result += 1;
            }
        }
        return result;
    }
}
