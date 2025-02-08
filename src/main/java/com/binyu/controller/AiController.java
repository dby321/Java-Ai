package com.binyu.controller;

import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


/**
 * @author yz
 * @version 1.0
 * @date 2025/2/8 上午8:55
 * @Param $
 * @return $
 */
@RestController
public class AiController {

    @Autowired
    private OllamaChatClient ollamaChatClient;
    @GetMapping("/ollama/chat/v1")
    public String ollamaChat(@RequestParam String msg) {
        return this.ollamaChatClient.call(msg);
    }
    @PostMapping("/ollama/chat/v1")
    public String ollamaChatPost(@RequestBody String msg) {
        return this.ollamaChatClient.call(msg);
    }
}

