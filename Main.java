// AutomateState - абстрактный класс, ExtendedAutomateState - его наследник
// В классе ExtendetAutomateState нужно написать метод, осуществляющий измененение состояний, где
// id1, id2, id3 - начальные состояния, а new_id1, new_id2, new_id3 - новые состояния

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

        ExtendedAutomateState objEAS = new ExtendedAutomateState(id1, id2, id3);
        objEAS.changeState();
        objEAS.print();
    }
}
