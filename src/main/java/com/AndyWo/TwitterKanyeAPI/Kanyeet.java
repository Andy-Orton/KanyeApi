package com.AndyWo.TwitterKanyeAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Kanyeet {
    private List<KanyeQuote> quotes;

    public Kanyeet(){
        quotes = new LinkedList<KanyeQuote>();
        InstantiateData();
    }

    private void InstantiateData(){
        quotes.add(new KanyeQuote("I'm the flippin glitch", 2012));
        quotes.add(new KanyeQuote("Kanye 2020", 2009));
    }

    public void AddQuote(KanyeQuote k){
        quotes.add(k);
    }

    public KanyeQuote getRandomQuote(){
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());

        return quotes.get(r.nextInt(quotes.size() - 0));
    }
}
