import java.util.Scanner;

public class Lab2{
  public static void main(String [] args){
       String str[]= new String[5];
	str[0]=null;

     try{
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the size of array");
       int x= sc.nextInt();
       int [] arr= new int [x];
       System.out.println("enter index to access the element");
       int idx=sc.nextInt();
       System.out.println(arr[idx]);
     }
     catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e);
       main(str);
     }
     catch(Exception e){
       System.out.println(e);
       

     }
      

}

}
