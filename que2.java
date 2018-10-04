import java.util.*;
class que2{

    public static String fun(String str){
          char arr[] = str.toCharArray();
          int i=0;
          while(i<str.length()){
                    if(arr[i]>='a' && arr[i]<='z'){
                                 arr[i] = (char)(arr[i]-32);
					i++;}
                    else{
                                 arr[i] = (char)(arr[i]+32);
				 i++;
                             }
		}
          String str1 = new String(arr);
          return str1;
	}	

     public static void main(String[] args){
       Scanner s= new Scanner(System.in);
       String str = s.next();
      System.out.println(fun(str));
	  }
	}