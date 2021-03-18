package se.leiflindback.iv1350.UmlToCode;

public class ClassA {
    private ClassB anObj = new ClassB();
    
    //Not illustrated in seq.diag. Could be any method.
    public void unknownMethod() {
        int result = anObj.someMethod(0);
    }
    

}
