package com.practice.ds;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
  
    int reasonCode = 3;  // Example reason code: Reservation missing + Payer missing
    System.out.println("Initial reason code: " + reasonCode);
    decodeReasonCode(reasonCode);
    System.out.println();
    // Add Payment ref missing = 8
    reasonCode = addErrorCode(reasonCode, ErrorCode.INVALID_PAY_REF);
    System.out.println("Updated reason code after adding Payment ref missing: " + reasonCode);
    decodeReasonCode(reasonCode);
    System.out.println();
    // Remove Payer missing  = 2
    reasonCode = removeErrorCode(reasonCode, ErrorCode.PAYER_MISSING);
    System.out.println("Updated reason code after removing Payer missing: " + reasonCode);
    decodeReasonCode(reasonCode);
    System.out.println();
  }
  
  private static void decodeReasonCode(int reasonCode) {
    List<ErrorCode> errors = new ArrayList<>();
    for (ErrorCode errorCode : ErrorCode.values()) {
      if ((reasonCode & errorCode.getCode()) != 0) {
        errors  .add(errorCode);
      }
    }
  
    errors.stream().forEach(error -> System.out.print(error + " "));
  }
  
  public static void printErrors(List<ErrorCode> errors) {
    if (errors.isEmpty()) {
      System.out.println("No errors found.");
    } else {
      System.out.println("Decoding reason code reveals the following errors:");
      for (ErrorCode error : errors) {
        System.out.println("Error: " + error.getDescription());
      }
    }
  }
  
  public static int addErrorCode(int reasonCode, ErrorCode errorCode) {
    return reasonCode | errorCode.getCode();
  }
  
  public static int removeErrorCode(int reasonCode, ErrorCode errorCode) {
    return reasonCode & ~errorCode.getCode();
  }
}
