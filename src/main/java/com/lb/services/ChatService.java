package com.lb.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatService {

    @RequestMapping(value = "/deals", method = RequestMethod.GET)
    public final String getAllDealsByPartyId() {
        return "you did it";
    }
}