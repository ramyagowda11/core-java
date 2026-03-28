public class AmazonReviewRunner {
     public static void main(String[] args) {

        // 1. void, no parameter
        AmazonReview.showReviewMessage();

        // 2. void, with parameter
        AmazonReview.showReviewerName("Sarah");

        // 3. return int, with parameter
        int rating = AmazonReview.calculateStarRating(4);
        System.out.println("Rating percentage: " + rating + "%");

        // 4. return int, no parameter
        int reviews = AmazonReview.getTotalReviews();
        System.out.println("Total reviews: " + reviews);
    }
    
}
