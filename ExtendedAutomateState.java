package com.company;

public class ExtendedAutomateState extends AutomateState  // Класс новых состояний автомата, наследуемый от AutomateState
{
    private int new_id1, new_id2, new_id3; // Новые состояние автомата

    public ExtendedAutomateState(int id1, int id2, int id3) {
        super(id1, id2, id3);
    }

    public void changeState() // Меняем состояния по выбранному алгоритму
    {
        System.out.println("States changed");
        new_id1 = super.id3;
        new_id2 = super.id1;
        new_id3 = super.id2;
        super.setId1(new_id1);
        super.setId2(new_id2);
        super.setId3(new_id3);
    }

    public void printState() // Выводим новые состояния на экран
    {
        System.out.println("New ID1: " + new_id1);
        System.out.println("New ID2: " + new_id2);
        System.out.println("New ID3: " + new_id3);
    }
}
