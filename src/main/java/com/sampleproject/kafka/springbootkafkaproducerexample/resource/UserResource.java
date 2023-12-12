package com.sampleproject.kafka.springbootkafkaproducerexample.resource;

import com.sampleproject.kafka.springbootkafkaproducerexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

 /*   @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

  */
    @Autowired
    KafkaTemplate<String, User> kafkaTemplateUser;
    private static final String TOPIC = "KafkaTopic";
/*    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message) {


        kafkaTemplateUser.send(TOPIC, message);
        return "Published Successfully";
    }
*/
    @GetMapping("/publish/userJson/{name}")
    public String post1(@PathVariable("name") final String name) {


        kafkaTemplateUser.send(TOPIC, new User(name, "Technology", 12000L));
        return "Published Successfully";
    }

}
