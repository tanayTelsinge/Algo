package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static void main(String[] args) {
    Revenue r1 = new Revenue();
    r1.setReservationId(1l);
    r1.setOwnerId(201l);
    r1.setTotalTurnover(200.0);
    r1.setUnitId(101l);
  
    Revenue r2 = new Revenue();
    r1.setReservationId(2l);
    r1.setOwnerId(202l);
    r1.setTotalTurnover(400.0);
    r1.setUnitId(102l);
  
    Revenue r3 = new Revenue();
    r1.setReservationId(2l);
    r1.setOwnerId(203l);
    r1.setTotalTurnover(300.0);
    r1.setUnitId(103l);
  
    List<Revenue> revenueList = new ArrayList<>();
    revenueList.add(r1);
    revenueList.add(r2);
    revenueList.add(r3);
    
  }
}
