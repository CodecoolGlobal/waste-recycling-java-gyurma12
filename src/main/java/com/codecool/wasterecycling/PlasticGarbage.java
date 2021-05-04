package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {
        boolean clean;
        private String name;
        public PlasticGarbage(String name,boolean clean) {
                super(name);
                this.clean = clean;
        }
        public boolean isClean(){
                return clean;
        }
        public void clean(){
                if(!this.clean){
                        clean=true;
                }
        }
}
