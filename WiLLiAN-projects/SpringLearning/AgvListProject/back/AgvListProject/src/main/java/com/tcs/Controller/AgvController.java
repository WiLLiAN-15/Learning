package com.tcs.Controller;

import cn.hutool.core.io.IoUtil;
import com.tcs.DAO.Agv;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AgvController {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  @RequestMapping("/list")
  public List<Agv> list() {
    InputStream in = this.getClass().getClassLoader().getResourceAsStream("static/Agv.txt");
    ArrayList<String> lines = IoUtil.readUtf8Lines(in, new ArrayList<>());

    return lines.stream().map(line -> {
      String[] split = line.split(",");
      return new Agv (
          Integer.parseInt(split[0]),
          split[1],
          split[2],
          split[3],
          Integer.parseInt(split[4]),
          Integer.parseInt(split[5]),
          LocalDateTime.parse(split[6], FORMATTER)
      );
    }).toList();
  }
}