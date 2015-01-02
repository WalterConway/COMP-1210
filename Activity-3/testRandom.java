
import java.util.Scanner;

public class testRandom
{
public static void main(String[] args)
{
int num1;
int tables = 0;

Scanner userInput = new Scanner(System.in);
System.out.print("people: ");
num1 = userInput.nextInt();


if (10%num1 > 0 || num1 < 10 )
{
tables = num1/10;
tables += 1;
}
else
{
tables = num1/10;
}
System.out.println(tables);
}

}