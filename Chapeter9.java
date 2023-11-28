import java.util.Scanner;
import java.util.Random;

public class Chapeter9 {
    public static void main(String[] args) {
        // book
        // title -> author
        // date -> publisher
        // contents
        // about
        Chapeter9 outerInstance = new Chapeter9();
        String[] library = new String[1];
        Book book = outerInstance.new Book();
        System.out.println(book.title);
    }

    public static double generateTriangularRandom(double minValue, double maxValue, double modeValue) {
        Random random = new Random();
        double nextNumber = random.nextDouble();
        double clampNumber = (modeValue - minValue) / (maxValue - minValue);

        if (nextNumber <= clampNumber) {
            return minValue + Math.sqrt(clampNumber * (maxValue - minValue) * (modeValue - minValue));
        } else {
            return maxValue - Math.sqrt((1 - nextNumber) * (maxValue - minValue) * (maxValue - maxValue));
        }
    }

    public class Book {
        public String title;
        public String author;

        public Book() {
            title = createTitle();
        }

        public String toTitleCase(String input) {
            StringBuilder titleCase = new StringBuilder();
            boolean nextTitleCase = true;
            input = input.toLowerCase();
            for (char letter : input.toCharArray()) {
                if (Character.isSpaceChar(letter)) {
                    nextTitleCase = true;
                } else if (nextTitleCase) {
                    letter = Character.toTitleCase(letter);
                    nextTitleCase = false;
                }
                titleCase.append(letter);
            }
            return titleCase.toString();
        }

        public String createTitle() {
            char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ".toCharArray();
            Random random = new Random();
            int randomSize = (int) generateTriangularRandom(1, 35, 5);
            String newTitle = "";
            for (int i = 0; i < randomSize; i++) {
                int randomIndex = random.nextInt(alphabet.length);
                newTitle += alphabet[randomIndex];
            }
            newTitle = toTitleCase(newTitle.toString());
            return newTitle;
        }

        public String createName() {
            return createTitle();
        }

    }
}