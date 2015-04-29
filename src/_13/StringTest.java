package _13;

public class StringTest {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("aaaaaaaaaaaaaa");
    String bString  = "aaaaaaaaaaaaaa";
    byte[] ss = bString.getBytes();
   for(byte s : ss){
     System.out.println(s);
   }
   
   
   System.out.printf("wo ri ni ge xiang jiao ba la %s",sb);
  }
  
  public String implicit(String[] fields){
    String result = "";
    for(int i=0; i<fields.length; i++){
      result += fields[i];
    }
    return result;
  }
  
  public String explicit(String [] fields){
    StringBuilder result = new StringBuilder();
    for(int i=0; i<fields.length; i++){
      result.append(fields[i]);
    }
    return result.toString();
  }

}
