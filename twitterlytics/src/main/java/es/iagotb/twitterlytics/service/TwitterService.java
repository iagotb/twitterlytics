package es.iagotb.twitterlytics.service;


import java.util.Collection;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Service;

@Service
public class TwitterService {
		
	private Twitter api;
	
	
	public TwitterService(){
		String consumerKey = "fZrCYccQbqRK2erP3n98Q"; // The application's consumer key
		String consumerSecret = "hYvhzlCleXoSVgjhndeW93Xrf9is4Mo5ud4Mt78"; // The application's consumer secret
		String accessToken = "4065011-R6nb5CMDorfObbdtfIxfjQjckLrkaNphVIoGfVl6ra"; // The access token granted after OAuth authorization
		String accessTokenSecret = "ldKUtH6vf3OWwuAcxX87SgTWqgm07TrJX2VtTRsdg"; // The access token secret granted after OAuth authorization
		api = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
						
	}
	
	public Collection<Tweet> getTimeline() {
		return api.timelineOperations().getHomeTimeline();
		
	}

}
