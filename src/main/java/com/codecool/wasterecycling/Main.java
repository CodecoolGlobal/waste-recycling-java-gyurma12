package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) throws DustbinContentException {
            Dustbin bin = new Dustbin("Yellow");
            Garbage leftOver = new Garbage("Rotten food");
            PlasticGarbage bottle = new PlasticGarbage("Soda",true);
            PaperGarbage box = new PaperGarbage("TV-box",false);
            bin.throwOutGarbage(leftOver);
            if(!box.isSqueezed()){
                    box.Squeeze();
            }
            bin.throwOutGarbage(box);
            if(!bottle.isClean()){
                    bottle.clean();
            }
            bin.throwOutGarbage(bottle);
            bin.displayContents();
            bin.emptyContents();
            bin.displayContents();
    }
}
