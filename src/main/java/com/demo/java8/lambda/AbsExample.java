package com.demo.java8.lambda;

public class AbsExample {
   public static void main(String[] args) {
    int a =10;
       int b =9;
       int c =7;
       a = a>> b ^ c<<2;
       System.out.println(a);


       try{
          // throw new NullPointerException();
           throw new ClassNotFoundException();
       } catch (NullPointerException | ArithmeticException | ClassNotFoundException e){

       } catch (Exception e){

       }
    }
}

class B{}
