/**
 * Package to say hello.
 */
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
   * This is other toString
   * @param someone to say hello
   * @return greetings
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
