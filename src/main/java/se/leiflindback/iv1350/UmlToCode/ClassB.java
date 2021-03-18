package se.leiflindback.iv1350.UmlToCode;

public class ClassB {
    private ClassC classC = new ClassC();
    
    public int someMethod(int aParam) {
        classC.otherMethod();
        return 0; // The seq diag does not show what is returned.
    }
}
