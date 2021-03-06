package part1.gofpatterns.Behavioral.Visitor.Project;

public class Database implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
