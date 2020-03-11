package com.company;

public class ExtendedAutomateState extends AutomateState {
    private int new_id1, new_id2, new_id3;

    public ExtendedAutomateState(int id1, int id2, int id3, int new_id1, int new_id2, int new_id3) {
        super(id1, id2, id3);
        this.new_id1 = new_id1;
        this.new_id2 = new_id2;
        this.new_id3 = new_id3;
    }

    public ExtendedAutomateState(int new_id1, int new_id2, int new_id3) {
        this.new_id1 = new_id1;
        this.new_id2 = new_id2;
        this.new_id3 = new_id3;
    }

    public void changeState(){
     //Здесь надо написать алгоритм изменения значений
    }

    public void print(){
        System.out.println(getId1());
        System.out.println(getId2());
        System.out.println(getId3());
        System.out.println(new_id1);
        System.out.println(new_id2);
        System.out.println(new_id3);
    }
}
