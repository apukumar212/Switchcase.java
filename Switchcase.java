package com.pack1;

public class Switchcase 
{
void meth1() 
   {
       System.out.println("Implementing Switch Case");	
       final int x=10; //final variable are constant
       int a=65;
       byte b=30;
      // x++; //C.E because we cant change the value of final variable
      switch(b+35-45) //30+35=65 --->int
      {
     // System.out.println("HELLO WORLD");//C.E
      case x:
          System.out.println("case 10 executed");
          break;
      case 20:
          System.out.println("case 20 executed");
          if(a<=100)
          {
        	  new Switchcase().meth2('N');
          }
          else
          {
        	  new Switchcase().meth3("oracle");
          }
          break;
      case 300-270:
            System.out.println("case 30 executed");
            break;
      case 'A':
    	  System.out.println("int & char both are compatable datatypes");
    	  break;
      case 50:
    	  System.out.println("case 50 executed");
    	  break;
      default:
    		  System.out.println("no case label got matched with the key value");
    		 // break; //no need break statement in the last 
      }
   }
 void meth2(char a)
      {
    	  System.out.println("meth2() called");
    	  switch(a)
    	  {
    	  case 'E':
    		  System.out.println("EAST");
    		  break;
    	  case 'W':
    		  System.out.println("WEST");
    		  break;
    	  case 'N':
    		  System.out.println("NORTH");
    		  break;
    	  default:
    		  System.out.println("invalid input");
    	  }
    	  System.out.println("if block executed");
      }
      void meth3(String s)
      {
    	  System.out.println("meth3() called");
    	  switch(s)
    	  {
    	  case "java":
    	  System.out.println("it is a programing language");
    	  break;
    	  case "html":
    		  System.out.println("it is UI-technology");
    		  break;
    	  default:
    			  System.out.println("invalid input");
    	  }
    	  System.out.println("else block executed");
      }
      public static void main(String[] args) 
      {
    	  Switchcase aobj=new Switchcase();
    	  aobj.meth1();
      }
   }












