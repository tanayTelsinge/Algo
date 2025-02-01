package com.practice.ds;

import java.time.LocalDate;

public class ReservationUtil {
  
  public static void adjustMatchProbability(Mutation mutation, String slipComment) {
    if (mutation == null || slipComment == null) {
      return;
    }
    
    if (mutation.getReservationStatus() == ReservationStatus.DECLINED && mutation.getMatchProbability() > 90) {
      mutation.setMatchProbability(90);
    } else if (mutation.getReservationNumber() != null && mutation.getMatchProbability() > 90) {
      String sanitizedSlipComment = slipComment.replaceAll("[^0-9]+", "") + "000";
      String sanitizedReservationNumber = mutation.getReservationNumber().replaceAll("(^000)", "") + "000";
      if (!sanitizedSlipComment.contains(sanitizedReservationNumber.substring(0, 11))) {
        mutation.setMatchProbability(90);
      }
    } else if (mutation.getPaymentReference() != null && mutation.getMatchProbability() > 90) {
      String sanitizedSlipComment = slipComment.replaceAll("[^0-9]+", "") + "000";
      if (!sanitizedSlipComment.contains(mutation.getPaymentReference().substring(0, 16))) {
        mutation.setMatchProbability(90);
      }
    }
  }
  
  public static void main(String[] args) {
    // Example usage
    Mutation mutation = new Mutation();
    mutation.setReservationStatus(null);
    mutation.setMatchProbability(95);
    mutation.setReservationNumber("82000240688");
    mutation.setPaymentReference("9876543210");
    mutation.setValue(50L);
    mutation.setReservationDate(LocalDate.of(2022, 1, 1));
    
    String slipComment = "RP82000240688 S.Weige, 58708 Menden Restzahlung";
    
    adjustMatchProbability(mutation, slipComment);
    
    System.out.println("Match Probability: " + mutation.getMatchProbability());
  }
}

class Mutation {
  private ReservationStatus reservationStatus;
  private int matchProbability;
  private String reservationNumber;
  private String paymentReference;
  private Long value;
  private LocalDate reservationDate;
  
  public ReservationStatus getReservationStatus() {
    return reservationStatus;
  }
  
  public void setReservationStatus(ReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }
  
  public int getMatchProbability() {
    return matchProbability;
  }
  
  public void setMatchProbability(int matchProbability) {
    this.matchProbability = matchProbability;
  }
  
  public String getReservationNumber() {
    return reservationNumber;
  }
  
  public void setReservationNumber(String reservationNumber) {
    this.reservationNumber = reservationNumber;
  }
  
  public String getPaymentReference() {
    return paymentReference;
  }
  
  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }
  
  public Long getValue() {
    return value;
  }
  
  public void setValue(Long value) {
    this.value = value;
  }
  
  public LocalDate getReservationDate() {
    return reservationDate;
  }
  
  public void setReservationDate(LocalDate reservationDate) {
    this.reservationDate = reservationDate;
  }
}

enum ReservationStatus {
  DECLINED,
  // other statuses
}
