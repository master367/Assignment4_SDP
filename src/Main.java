import part1.Expression;
import part1.Interpreter;
import part2.History;
import part2.TextEditor;
import part3.NewsAgency;
import part3.NewsChannel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //part1
        System.out.println("PART 1: ");
        System.out.print("Enter your expression: ");
        Scanner expression = new Scanner(System.in);
        String expressionString = expression.nextLine();

        Expression parsedExpression = Interpreter.parse(expressionString);
        int result = parsedExpression.interpret();
        System.out.println("Result: " + result);


        //part2
        System.out.println("PART 2: ");

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("something 1x");
        System.out.println("1 text: " + editor.getText());

        history.save(editor.save());

        editor.setText("something 2x");
        System.out.println("2 text: " + editor.getText());

        history.save(editor.save());

        editor.setText("something 3x");
        System.out.println("3 text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("undo: " + editor.getText());

        //part3
        System.out.println("PART 3: ");

        NewsAgency agency = new NewsAgency();

        NewsChannel KTK = new NewsChannel("KTK");
        NewsChannel XABAR = new NewsChannel("XABAR");
        NewsChannel QAZAQSTAN = new NewsChannel("QAZAQSTAN");

        agency.addObserver(KTK);
        agency.addObserver(XABAR);
        agency.addObserver(QAZAQSTAN);

        agency.setHeadline("STEPUHA KASHAN TUSED??");

        agency.removeObserver(XABAR);

        agency.setHeadline("Update: STEPUHA TUSTI!!");
    }
}
