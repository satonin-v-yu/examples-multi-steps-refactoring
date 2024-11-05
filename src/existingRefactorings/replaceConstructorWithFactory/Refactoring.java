package existingRefactorings.replaceConstructorWithFactory;

public class Refactoring {
    private final String refactoringName;

    public Refactoring() {
        refactoringName = "";
    }

    public Refactoring(String name) {
        this.refactoringName = name;
    }

    public String getRefactoringName() {
        return refactoringName;
    }

    public static void main(String[] args) {
        Refactoring unknowRefRefactoring = new Refactoring();
        System.out.println(unknowRefRefactoring.getRefactoringName());

        Refactoring renameRefactoring = new Refactoring("Rename");
        System.out.println(renameRefactoring.getRefactoringName());
    }
}
