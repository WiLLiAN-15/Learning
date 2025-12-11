package com.tcs.RestfulQuickstart.pojo;

import lombok.Data;

@Data
public class Result {
  private Integer code; // 0.Failure, 1.Success
  private String msg;
  private Object data;

  /**
   * success with no data
   * @return
   */
  public static Result success() {
    Result result = new Result();
    result.code = 1;
    result.msg = "success";
    return result;
  }

  /**
   * success with data
   * @return
   */
  public static Result success(Object obj) {
    Result result = new Result();
    result.code = 1;
    result.msg = "success";
    result.data = obj;
    return result;
  }

  /**
   * error
   * @param msg error message
   * @return
   */
  public static Result error(String msg) {
    Result result = new Result();
    result.code = 0;
    result.msg = msg;
    return result;
  }
}
