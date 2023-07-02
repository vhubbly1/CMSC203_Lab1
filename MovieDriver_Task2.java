import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the name of a movie: ");
            String title = scanner.nextLine();

            System.out.print("Enter the rating of the movie: ");
            String rating = scanner.nextLine();

            System.out.print("Enter the number of tickets sold for this movie: ");
            int ticketsSold = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Movie movie = new Movie(title, rating, ticketsSold);
            System.out.println(movie.toString());

            System.out.print("\nDo you want to enter another movie? (y or n): ");
            choice = scanner.nextLine();
        }

        System.out.println("Goodbye");
    }
}