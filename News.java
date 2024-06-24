public class News {
    static String newsAgency = "Global News";
    static int totalArticles = 1000;
    static boolean isBreakingNews = true;
    static double averageWordCount = 350.5;
    static char category = 'P';
 // Local variables 
    public static void main(String[] args) {
        String headline = "COVID-19 Vaccination Drive Begins";
        int articleCountToday = 20;
        boolean isFeatured = true;

        // Displaying static variables
        System.out.println("News Agency: " + newsAgency);
        System.out.println("Total Articles: " + totalArticles);
        System.out.println("Is Breaking News? " + isBreakingNews);
        System.out.println("Average Word Count: " + averageWordCount);
        System.out.println("Category: " + category);

        // Displaying local variables
        System.out.println("Today's Headline: " + headline);
        System.out.println("Articles Published Today: " + articleCountToday);
        System.out.println("Featured Article? " + isFeatured);
    }
}
