package com.tcs.RCS.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtils {
  private static final String SECRET_KEY = "oVji9AoJNL98hJ264gZ30Lhyc5ueMNOaE08XGuC4Lxs";
  private static final long EXPIRATION_TIME = 12*60*60*1000;

  // トークン生成
  public static String generateToken(Map<String, Object> dataMap) {
    return Jwts.builder()
        .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
        .addClaims(dataMap)
        .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
        .compact();
  }

  // トークン解析
  public static Claims parseToken(String token) {
    return Jwts.parser()
        .setSigningKey(SECRET_KEY)
        .parseClaimsJws(token)
        .getBody();
  }
}
