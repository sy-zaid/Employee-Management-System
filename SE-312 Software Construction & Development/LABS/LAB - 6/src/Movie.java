public class Movie {
    private String title;
    private String director;
    private String[] actors;
    private String[] reviews;
    private int reviewCount;

    public Movie(String title, String director, String[] actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new String[10];
        this.reviewCount = 0;
    }

    public void addReview(String review) {
        if (reviewCount < 10) {
            reviews[reviewCount] = review;
            reviewCount++;
        } else {
            System.out.println("Maximum reviews limit reached!");
        }
    }

    public String[] getReviews() {
        return reviews;
    }
}
