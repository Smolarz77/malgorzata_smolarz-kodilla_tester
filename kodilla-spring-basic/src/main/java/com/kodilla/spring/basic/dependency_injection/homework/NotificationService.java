package com.kodilla.spring.basic.dependency_injection.homework;

public interface NotificationService {

  public void success(String address);
  public void fail(String address);
}