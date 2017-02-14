package Turtle;

import java.util.Scanner;

public class TurtleController {
    public static void main(String args[]){

        Turtle turtle2=new Turtle();

        Turtle.Direction direction= Turtle.Direction.E;
        Turtle turtle1=new Turtle(30,30,direction);

        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Input command 1, 2, 3, 4, 5, 6, 7, 8 or exit");
        do {
            System.out.println(
                            "1  for penUp\n" +
                            "2  for penDown\n" +
                            "3  for turnRight\n" +
                            "4  for turnLeft\n" +
                            "5  for move\n" +
                            "6  for display\n" +
                            "7  for erasePath\n" +
                            "8  for goToStartPoint\n" +
                            "exit   for End"
            );
            str = scanner.next();
            switch (str){
                case "1": turtle1.penUp();break;
                case "2": turtle1.penDown();break;
                case "3": turtle1.turnRight();break;
                case "4": turtle1.turnLeft();break;
                case "5":
                    System.out.println("    Give Steps Quantity");
                    String stepsStr = scanner.next();
                    int stepsInt= Integer.parseInt(stepsStr);
                    turtle1.move(stepsInt);
                    break;
                case "6": turtle1.display();break;
                case "7": turtle1.erasePath();break;
                case "8": turtle1.goToStartPoint();break;
                case "exit":  System.out.println("Exiting");break;
                default:  System.out.println("wrong command");break;
            }
        }
        while (!str.equals("exit"));
    }
}
