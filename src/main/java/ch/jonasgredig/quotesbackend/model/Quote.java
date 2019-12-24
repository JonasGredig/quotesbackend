package ch.jonasgredig.quotesbackend.model;

public class Quote {

    private Long id;
    private Long userId;
    private String author;
    private long timestamp;
    private String quoteText;

    public Quote() {
    }

    public Quote(Long userId, String author, long timestamp, String quoteText) {
        this.userId = userId;
        this.author = author;
        this.timestamp = timestamp;
        this.quoteText = quoteText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }
}
