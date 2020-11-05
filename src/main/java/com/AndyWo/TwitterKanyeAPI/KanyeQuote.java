package com.AndyWo.TwitterKanyeAPI;

public class KanyeQuote {
    private String quoteText;
    private int year;

    public KanyeQuote(String quoteText, int year){
        this.quoteText = quoteText;
        this.year = year;
    }

    @Override
    public String toString() {
        return quoteText + "- Kanye West("+year+")";
    }
}
