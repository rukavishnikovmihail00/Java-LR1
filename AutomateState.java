package com.company;

 public abstract class AutomateState
 {
    private int id1, id2, id3;

     public AutomateState(int id1, int id2, int id3) {
         super();
         this.id1 = id1;
         this.id2 = id2;
         this.id3 = id3;
     }

     public AutomateState() {
     }

     public void setId1(int id1) {
         this.id1 = id1;
     }

     public void setId2(int id2) {
         this.id2 = id2;
     }

     public void setId3(int id3) {
         this.id3 = id3;
     }

     public int getId1() {
         return id1;
     }

     public int getId2() {
         return id2;
     }

     public int getId3() {
         return id3;
     }

 }
