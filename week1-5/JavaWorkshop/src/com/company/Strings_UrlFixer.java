package com.company;

public class Strings_UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

       url = url.replace("bots", "odds").replace("//", "://");


//        System.out.println(url.replace("bots", "odds")); // prints just the e first task
//        System.out.println(url.replace("//", "://"));  // prints just the  second task

        System.out.println(url);
    }
}