package part1.gofpatterns.Behavioral.Visitor.Project;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
