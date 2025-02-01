package com.practice.test;

public class Revenue {
  
  private Long reservationId;
  
  private Long unitId;
  
  private Long ownerId;
  
  private Double totalTurnover;
  
  private Double netTurnover;
  
  public Long getReservationId() {
    return reservationId;
  }
  
  public void setReservationId(Long reservationId) {
    this.reservationId = reservationId;
  }
  
  public Long getUnitId() {
    return unitId;
  }
  
  public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }
  
  public Long getOwnerId() {
    return ownerId;
  }
  
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }
  
  public Double getTotalTurnover() {
    return totalTurnover;
  }
  
  public void setTotalTurnover(Double totalTurnover) {
    this.totalTurnover = totalTurnover;
  }
  
  public Double getNetTurnover() {
    return netTurnover;
  }
  
  public void setNetTurnover(Double netTurnover) {
    this.netTurnover = netTurnover;
  }
}
