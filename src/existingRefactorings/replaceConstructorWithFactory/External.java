package existingRefactorings.replaceConstructorWithFactory;

public class External {
    public static void main(String[] args) {
        Refactoring moveRefactoring = new Refactoring("Move");
        System.out.println(moveRefactoring.getRefactoringName());
    }
}
