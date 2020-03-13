// На вход подаются 3 начальных состояния автомата.
// Происходит переход в новые состояния, после чего программа запрашиваем желаемое количество
// переходов и выдает результат после каждого выполнения алгоритма

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ID 1: ");
        int id1 = in.nextInt();
        System.out.println("ID 2: ");
        int id2 = in.nextInt();
        System.out.println("ID 3: ");
        int id3 = in.nextInt();

        ExtendedAutomateState oExtended = new ExtendedAutomateState(id1,id2,id3);
        oExtended.changeState();
        oExtended.printState();

        System.out.println("Enter the num of state changes: ");
        int repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            oExtended.changeState();
            oExtended.printState();
        }
    }
}