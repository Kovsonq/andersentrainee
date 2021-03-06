package part1.gofpatterns.Behavioral.Command.solution;

public class AddTextCommand extends AbstractCommand {
    private String undoText;

    private String textToBeAdded;

    public AddTextCommand(TextEditor textEditor, String textToBeAdded) {
        super(textEditor);
        this.textToBeAdded = textToBeAdded;
    }

    @Override
    public void action() {
        // we get the original text
        undoText = getTextEditor().getText();
        getTextEditor().setText(getTextEditor().getText()+textToBeAdded);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
