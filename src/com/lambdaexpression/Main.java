package com.lambdaexpression;

import com.lambdaexpression.rectangle.Rectangle;

public class Main {
  public static void main(String[] args) {

    Rectangle rectangle = (length, width) -> (length * width);
    System.out.println("Area of Rectangle:" + rectangle.area(10, 8));
    
  }
}