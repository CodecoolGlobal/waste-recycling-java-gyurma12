package com.codecool.wasterecycling;


import java.util.ArrayList;

public class Dustbin {
        public String color;
        public ArrayList<Garbage> house = new ArrayList<>();
        public ArrayList<Garbage> paper = new ArrayList<>();
        public ArrayList<Garbage> plastic = new ArrayList<>();
        public Dustbin(String color){
                this.color=color;
        }

        public String getColor() {
                return color;
        }

        public void throwOutGarbage(Garbage garbage) throws DustbinContentException {

                if (garbage instanceof PlasticGarbage) {
                        if (((PlasticGarbage) garbage).isClean()) {
                               plastic.add(garbage);
                        }
                        else {
                                throw new DustbinContentException("The plastic is not clean!");
                        }
                }

                else if (garbage instanceof PaperGarbage) {
                        if (((PaperGarbage) garbage).isSqueezed()) {
                                paper.add(garbage);
                        }
                        else {
                                throw new DustbinContentException("The paper is not squeezed!");

                        }
                }

                else  {
                        house.add(garbage);
                }

        }

        public void displayContents(){
                System.out.println("House waste content: " + house.size() + " item(s)");
                for(Garbage garbage:house) {
                        System.out.println(garbage);
                }

                System.out.println("Paper waste content: " + paper.size() + " item(s)");
                for(Garbage garbage:paper) {
                        System.out.println(garbage);
                }

                System.out.println("Plastic waste content: " + plastic.size() + " item(s)");
                for(Garbage garbage:plastic) {
                        System.out.println(garbage);
                }
        }
        public void emptyContents(){
                house.clear();
                plastic.clear();
                paper.clear();
        }


        @Override
        public String toString() {
                return color + "Dustbin!";
        }
}
