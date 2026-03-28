public class AmazonReview {
    // 1. void, no parameter
    public static void showReviewMessage() {
        System.out.println("Thank you for your review!");
    }

    // 2. void, with parameter
    public static void showReviewerName(String name) {
        System.out.println("Reviewed by: " + name);
    }

    // 3. return int, with parameter
    public static int calculateStarRating(int stars) {
        int rating = stars * 20; 
        return rating;
    }

    // 4. return int, no parameter
    public static int getTotalReviews() {
        int reviews = 1500;
        return reviews;
    }
    
}
