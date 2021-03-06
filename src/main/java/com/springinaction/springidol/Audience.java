package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
  public void takeSeats() { //<co id="co_takeSeats"/>
    System.out.println("The audience is taking their seats.");
  }

  public void turnOffCellPhones() { //<co id="co_turnOffCellPhones"/>
    System.out.println("The audience is turning off their cellphones");
  }

  public void applaud() { //<co id="co_applaud"/>
    System.out.println("CLAP CLAP CLAP CLAP CLAP");
  }

  public void demandRefund() { //<co id="co_demandRefund"/>
    System.out.println("Boo! We want our money back!");
  }
  
  public void watchPerformance(ProceedingJoinPoint pjp) throws Throwable{
      System.out.println("We are opening our eyes...");
      System.out.println("We are listening now...");
      pjp.proceed();
      System.out.println("Ok, the performance has finished...");
  }
  
}