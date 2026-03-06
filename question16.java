package Workshop;

public class question16 {
  public static void main(String[] args){  
        boolean expr1 = (5 > 3);
        boolean expr2 = (8 > 5);
        boolean andResult = expr1 && expr2;

        System.out.println("Logical AND (5>3 && 8>5): " + andResult);

    
        expr1 = (5 > 3);
        expr2 = (2 > 5);
        boolean orResult = expr1 || expr2;

        System.out.println("Logical OR (5>3 || 2>5): " + orResult);

        
        boolean notResult = !(5 == 10);

        System.out.println("Logical NOT (!(5==10)): " + notResult);

        System.out.println("\nUsing all comparison operators:");

        System.out.println("5 > 3  : " + (5 > 3));
        System.out.println("5 < 3  : " + (5 < 3));
        System.out.println("5 >= 5 : " + (5 >= 5));
        System.out.println("3 <= 5 : " + (3 <= 5));
        System.out.println("5 == 5 : " + (5 == 5));
        System.out.println("5 != 3 : " + (5 != 3));
    }
}
