package com.example.justlikethat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

  @RequestMapping("")
  public String index(){
    return "JustLikeThatRK";
  }

  @RequestMapping("kkkkkk")
  public String kkkkkk(){
    return "kkkkkkkkkkkkkkkk";
  }
}
