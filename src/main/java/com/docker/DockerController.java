package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
@GetMapping(value="/getAll")
public String getthis() {
	return "hi,hello,how are you";
}
}
