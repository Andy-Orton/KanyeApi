package com.AndyWo.TwitterKanyeAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class TwitterKanyeApiApplication {

	Kanyeet k = new Kanyeet();


	public static void main(String[] args) {
		SpringApplication.run(TwitterKanyeApiApplication.class, args);

	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@PostMapping("/post")
	public @ResponseBody ResponseEntity<String> post(@RequestParam(value = "quote", defaultValue = "") String quoteText, @RequestParam(value = "year", defaultValue = "") int year){
		KanyeQuote newQuote = new KanyeQuote(quoteText, year);
		if(quoteText.equals("") || Integer.toString(year).equals("")){
			return new ResponseEntity<String>("", HttpStatus.BAD_REQUEST);
		}
		k.AddQuote(newQuote);
		return new ResponseEntity<String>("Post Response", HttpStatus.OK);
	}


	@GetMapping("")
	public String GetRandom(){
		return k.getRandomQuote().toString();
	}
}