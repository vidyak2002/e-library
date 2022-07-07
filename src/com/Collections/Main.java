package com.Collections;

import com.Collections.service.StudentService;
import com.Collections.service.impl.StudentServiceImpl;
import com.Training.Exception.CustomException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void mains(String[] args) throws CustomException {
        List<Student> stu = new ArrayList<>();
        StudentService studentService = new StudentServiceImpl();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Press 1 to add element \n press 2 to exit ");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    try {
                        studentService.add(stu);
                    } catch (CustomException customException){
                        System.out.println(customException.getErrorMessage());
                    }
                    break;
                case 2:
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }

    static class ValueRank{
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        int value;
        int rank;
        public ValueRank(int a, int b){
            this.rank=b;
            this.value =a;
        }

    }
    static class ValueRankComparator implements Comparator<ValueRank> {

        @Override
        public int compare(ValueRank o1, ValueRank o2) {
            if(o1.value < o2.value) {
                return -1;
            }else if(o1.value > o2.value) {
                return 1;
            }else {
                return 0;
            }
        }
    }
    public static void main(String[] args){
       /* Passengers p1 = (new Passengers("adi",25,"gajuwaka"));
        Passengers p2 =(new Passengers("babu",22,"gudiwada"));
        Passengers p3 =(new Passengers("pawan",21,"Razole"));
        PriorityQueue<Passengers> passengers = new PriorityQueue<>();
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);

        System.out.println(passengers);
        System.out.println(passengers.peek());
        System.out.println(passengers.poll());
        System.out.println(passengers);
        {1,34,23,5,6,78}
        {1,5,4,2,3,,6}
*/
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<ValueRank> temp = new ArrayList<>();
        System.out.println("enter the integers");
        int a;
        do {
            a = sc.nextInt();
            if (a != -1) {
                in.add(a);
                temp.add(new ValueRank(a, 0));
            }
        } while (a != -1);
        PriorityQueue<ValueRank> valueRanks = new PriorityQueue<ValueRank>(new ValueRankComparator());
        for(ValueRank te: temp){
            valueRanks.add(te);
        }
        /*System.out.println(valueRanks.poll().getValue());*/
        int k = 1;
        while (!valueRanks.isEmpty()) {
            int c = valueRanks.poll().getValue();

            for (ValueRank te : temp) {
                if (te.getValue() == c && te.getRank()==0) {
                    te.setRank(k);
                    k++;
                    break;
                }
            }

        }
        for(ValueRank te: temp){
            rank.add(te.getRank());
        }
        System.out.println("Ranks List is :");
        for(int r: rank){
            System.out.println(r+" ");
        }



    }



}
