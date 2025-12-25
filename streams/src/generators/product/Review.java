package generators.product;

import java.time.LocalDate;

class Review {
    private String author;
    private int rating;
    private String comment;
    private LocalDate date;

    public Review(String author, int rating, String comment, LocalDate date) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{\n" +
            "        \"author\": \"" + author + "\",\n" +
            "        \"rating\": " + rating + ",\n" +
            "        \"comment\": \"" + comment + "\",\n" +
            "        \"date\": \"" + date + "\"\n" +
            "      }";
    }

}