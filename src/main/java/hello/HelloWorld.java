package hello;

import edu.princeton.cs.algs4.UF;

public class HelloWorld {
  public static void main(String[] args) {
  Greeter greeter = new Greeter();
  System.out.println(greeter.sayHello());
  UF uf = new UF(2);
  System.out.println(uf.count());
  }
}