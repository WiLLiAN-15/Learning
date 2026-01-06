package com.tcs.RCS.filter;

import com.tcs.RCS.utils.JwtUtils;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = "/*")
public class TokenFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;

    // URI取得
    String requestURI = request.getRequestURI();

    // トークン取得
    if (requestURI.contains("login")) {
      log.info("login");
      filterChain.doFilter(request, response);
      return;
    }

    String token = request.getHeader("token");

    // トークン解析
    if (token == null || token.isEmpty()) {
      log.info("token is empty, 401");
      response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
      return;
    }

    try {
      JwtUtils.parseToken(token);
    } catch (Exception e) {
      log.info("token illegal, 401");
      response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
      return;
    }

    log.info("token success, go");
    filterChain.doFilter(request, response);
  }
}
