package LAB;

import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while (rounds -->0 || firstPlayer.isEmpty() || secondPlayer.isEmpty()){
            Iterator<Integer> iteratorFirstPlayer = firstPlayer.iterator();
            Integer firstCard = iteratorFirstPlayer.next();
            iteratorFirstPlayer.remove();
            Iterator<Integer> iteratorSecondPlayer = secondPlayer.iterator();
            Integer secondCard = iteratorSecondPlayer.next();
            iteratorSecondPlayer.remove();
            if (firstCard > secondCard) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            } else {
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
        }
        if (firstPlayer.size()> secondPlayer.size()){
            System.out.println("First Player Win!");
        } else if (secondPlayer.size()> firstPlayer.size()){
            System.out.println("Second Player Win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
