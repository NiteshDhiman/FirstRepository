/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.SpringProject.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Nitesh
 */
@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping("/Hello")
    public String greet() {
        return "Hello, World!";
    }
}
