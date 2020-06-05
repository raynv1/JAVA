import java.io.*;
import java.util.*;

public class Eofexample {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=0;
while(scan.hasNext()){
System.out.printf("%d %s\n",++a,scan.nextLine());
}
}
}
