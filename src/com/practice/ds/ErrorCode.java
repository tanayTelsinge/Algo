package com.practice.ds;

public enum ErrorCode {
  RESERVATION_MISSING(1, "Reservation missing"),
  PAYER_MISSING(2, "Payer missing"),
  PAYMENT_REF_MISSING(4, "Payment ref missing"),
  INVALID_PAY_REF(8, "Invalid pay ref");
  
  private final int code;
  private final String description;
  
  ErrorCode(int code, String description) {
    this.code = code;
    this.description = description;
  }
  
  public int getCode() {
    return code;
  }
  
  public String getDescription() {
    return description;
  }
}