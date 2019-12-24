package ch.jonasgredig.quotesbackend.repository;

import ch.jonasgredig.quotesbackend.model.Quote;

import java.util.ArrayList;

public interface IQuoteRepository {

    public boolean createQuote(Quote quote);
    public Quote getQuote(Long id);
    public ArrayList<Quote> getQuotes();
    public boolean updateQuote(Quote quote);
    public boolean deleteQuote(Quote quote);

}
