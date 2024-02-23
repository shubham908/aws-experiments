package io.project.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/exp")
public class HealthController {

  @GetMapping("/health")
  private String getHealth() {
    return "Hello, I am running inside an EC2";
  }
}
