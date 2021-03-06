package part1.gofpatterns.Behavioral.Command.solution;

public abstract class AbstractCommand implements Command {
    private TextEditor textEditor;

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
