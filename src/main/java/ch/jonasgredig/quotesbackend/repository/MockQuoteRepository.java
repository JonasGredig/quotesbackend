package ch.jonasgredig.quotesbackend.repository;

import ch.jonasgredig.quotesbackend.model.Quote;

import java.util.ArrayList;

public class MockQuoteRepository implements IQuoteRepository {

    private ArrayList<Quote> mockQuotes;

    public MockQuoteRepository() {

        mockQuotes = new ArrayList<Quote>();
        mockQuotes.add(new Quote(0l, "Jonas", System.currentTimeMillis(), "Hahahahahah"));
        mockQuotes.add(new Quote(1l, "Peter", System.currentTimeMillis(), "Leeeeeel"));
        mockQuotes.add(new Quote(55l, "Jonas", System.currentTimeMillis(), "Nice"));

    }

    public boolean createQuote(Quote quote) {
        mockQuotes.add(quote);
        return true;
    }

    public Quote getQuote(Long id) {
        for (Quote quote : mockQuotes) {
            if (quote.getId() == id) {
                return quote;
            }
        }
        throw new RuntimeException("QuoteNotFound");
    }

    public ArrayList<Quote> getQuotes() {
        return mockQuotes;
    }

    public boolean updateQuote(Quote quote) {
        for (Quote mockQuote : mockQuotes) {
            if (mockQuote.getId() == quote.getId()) {
                mockQuote = quote;
                return true;
            }
        }
        return false;
    }

    public boolean deleteQuote(Quote quote) {
        mockQuotes.remove(quote);
        return true;
    }
}
