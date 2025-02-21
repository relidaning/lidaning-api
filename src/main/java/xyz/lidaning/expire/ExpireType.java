package xyz.lidaning.expire;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ExpireType {
  DAYS("day"),
  HOURS("hour"),
  MINITES("hour"),
  SECONDS("hour"),
  ;
  private String type;
  
}
