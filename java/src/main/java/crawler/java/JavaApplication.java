package crawler.java;

import java.util.ArrayList;

import crawler.java.mtWebCrawler.WebCrawler;

public class JavaApplication {

	public static void main(String[] args) {
		ArrayList<WebCrawler>bots = new ArrayList<>();
		bots.add(new WebCrawler("https://abcnews.go.com", 1));
		bots.add(new WebCrawler("https://www.npr.org", 2));
		bots.add(new WebCrawler("https://www.nytimes.com", 3));


		for(WebCrawler w : bots){
			try{
				w.getThread().join();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}

}
