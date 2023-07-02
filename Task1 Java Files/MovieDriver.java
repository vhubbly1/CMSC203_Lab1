import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.print("Enter the title of a movie: ");
        String title = scanner.nextLine();
        movie.setTitle(title);

        System.out.print("Enter the movie's rating: ");
        String rating = scanner.nextLine();
        movie.setRating(rating);

        System.out.print("Enter the number of tickets sold: ");
        int ticketsSold = scanner.nextInt();
        movie.setSoldTickets(ticketsSold);

        System.out.println("Goodbye");
    }
}