/**
 * Package to say hello
 *
 * @since 1.0
 * @author jesus
 * @version 1.0
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
   * This is other toString.
   * @param someone to say hello.
   * @return greetings.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
