package com.company;
import java.util.Scanner;
public class App {

    public App() {
    }

    public void Start(){
        Scanner in = new Scanner(System.in);
        System.out.println("ID 1: ");
        int id1 = in.nextInt();
        System.out.println("ID 2: ");
        int id2 = in.nextInt();
        System.out.println("ID 3: ");
        int id3 = in.nextInt();

        ExtendedAutomateState oExtended = new ExtendedAutomateState(id1,id2,id3);

        System.out.println("Enter the number of state changes: ");
        int repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            oExtended.changeState();
            oExtended.printState();
        }
    }
}
