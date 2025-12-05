package com.tcs;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloAGV {

  @RequestMapping("/hello")
  public String hello(String name) {
    return "Hello" + name;
  }

  @RequestMapping("/request")
  public String request(HttpServletRequest request) {
    String name = request.getParameter("name");
    String type = request.getParameter("type");
    System.out.println("name = " + name + ", type = " + type);

    String uri = request.getRequestURI();
    String url = request.getRequestURL().toString();
    System.out.println("uri = " + uri + ", url = " + url);

    String method = request.getMethod();
    System.out.println("method = " + method);

    String header = request.getHeader("User-Agent");
    System.out.println("header = " + header);

    return "Request Success";
  }

  @RequestMapping("/response")
  public void response(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String name = request.getParameter("name");
    if (name.equals("Willian"))
      response.setStatus(200);
    else if(name.equals("Jack"))
      response.setStatus(500);
    else
      response.setStatus(401);
    response.setHeader("name", name);
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    response.getWriter().write("<h1>Hello " + name + "</h1>");
  }

}
