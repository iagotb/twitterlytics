package es.iagotb.twitterlytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import es.iagotb.twitterlytics.service.TwitterService;

@Controller
public class TimelineController {

	@Autowired
	TwitterService twitterService;
	
	@RequestMapping("/timeline*")
    public String execute(ModelMap model) {
		model.addAttribute("twittList", twitterService.getTimeline());
        return "timeline";
    }
}
