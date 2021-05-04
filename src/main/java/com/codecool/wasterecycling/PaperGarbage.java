package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {
        boolean squeezed;

        public PaperGarbage(String name, boolean squeezed) {
                super(name);
                this.squeezed = squeezed;
        }

        public boolean isSqueezed() {
                return squeezed;
        }
        public void Squeeze(){
                if(!this.squeezed){
                        squeezed=true;
                }
        }
}
