package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * that's a javadoc command.
   * @param someone greet someone by his / her name.
   * @return a string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
