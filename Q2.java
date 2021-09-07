import java.util.Scanner;
public class Q2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n%3 == 0 && n%5 == 0){
System.out.println("It is divisible by 3 and 5");
}
else{
System.out.println("It is not divisible by 3 and 5");
}

}
}
