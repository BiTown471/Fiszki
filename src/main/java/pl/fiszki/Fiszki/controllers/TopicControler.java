package pl.fiszki.Fiszki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.fiszki.Fiszki.models.Topic;
import pl.fiszki.Fiszki.services.TopicService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TopicControler {

    private TopicService topicService;

    @Autowired
    public TopicControler(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/topic")
    public List<Topic> getAll(){
        return topicService.getTopics();
    }

    @PostMapping("/topic")
    public void postTopic(Topic topic){
        topicService.addTopic(topic);
    }

    @DeleteMapping(path = "/topic/{id}")
    public void deleteTopic(@PathVariable Long id){
        topicService.remove(id);
    }


}
