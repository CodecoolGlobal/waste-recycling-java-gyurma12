package com.codecool.wasterecycling;

public class Garbage {
        private final String name;

        public Garbage(String name) {
                this.name = name;
        }

        public String getName(){
                return name;
        }

        @Override
        public String toString() {
                return "Name:" + getName();
        }
}
