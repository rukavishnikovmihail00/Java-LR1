package com.company;

public class ExtendedAutomateState extends AutomateState {
    private int new_id1, new_id2, new_id3;

    public ExtendedAutomateState(int id1, int id2, int id3) {
        super(id1, id2, id3);
    }

    public void changeState(){
        new_id1 = super.id3;
        new_id2 = super.id1;
        new_id3 = super.id2;
    }

    public void printState()
    {
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(new_id1);
        System.out.println(new_id2);
        System.out.println(new_id3);
    }



}
