public class InterfaceDemo1 implements Father, Mother {
    public static void main(String[] args) {
        GrandFather grandFather = new InterfaceDemo1();
        grandFather.grandFather();
        GrandMother grandMother = new InterfaceDemo1();
        grandMother.grandMother();
        Father father = new InterfaceDemo1();
        father.father();
        father.grandFather();
        father.grandMother();
        Mother mother = new InterfaceDemo1();
        mother.mother();
        System.out.println("아버지의 돈 = " + Father.MONEY);
        System.out.println("어머니의 돈 = " + Mother.MONEY);

        Mother[] array = new Mother[3];
        array[0] = new InterfaceDemo1();
    }

    public void father(){
        System.out.println("called by father()");
    }
    public void mother(){
        System.out.println("called by mother()");
    }
    public void grandFather(){
        System.out.println("called by grandFather()");
    }
    public void grandMother(){
        System.out.println("called by grandMother()");
    }
}
