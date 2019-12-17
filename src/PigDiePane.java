import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

//
// text field f
public class PigDiePane extends GridPane {

    private TextArea Scores;
    private PigDiceClient myGame;
    private TextField roll1;
    private TextField roll2;

    public PigDiePane() {

        Font font = new Font(16);
        Label accNameLabel = new Label("roll 1");
        accNameLabel.setFont(font);
        GridPane.setHalignment(accNameLabel, HPos.CENTER);

        Label pinLabel = new Label("roll 2");
        pinLabel.setFont(font);
        GridPane.setHalignment(pinLabel, HPos.CENTER);

        Label amountLabel = new Label("Scores");
        amountLabel.setFont(font);
        GridPane.setHalignment(amountLabel, HPos.CENTER);




        roll1 = new TextField("");
        roll1.setPrefWidth(70);
        roll1.setAlignment(Pos.CENTER);


        roll2 = new TextField("");
        roll2.setPrefWidth(70);
        roll2.setAlignment(Pos.CENTER);


        amountTextField = new TextField("");
        amountTextField.setPrefWidth(70);
        amountTextField.setAlignment(Pos.CENTER);

        Scores = new TextArea();
        Scores.setPrefWidth(200);



        Button withdrawButton = new Button("Roll");
        withdrawButton.setOnAction(this::processRoll);

        Button depositButton = new Button("Pass");
        depositButton.setOnAction(this::processPass);


        add(accNameLabel, 0, 0);
        add(pinLabel, 1, 0);
        add(amountLabel, 3, 0);
        add(accInfoLabel,0,3);
        add(roll1, 0, 1);
        add(roll2, 1, 1);
        add(amountTextField, 3, 1);
        add(createAccountButton, 2, 1);
        add(withdrawButton, 3, 2);
        add(depositButton, 4, 2);
        add(checkStatusButton, 0, 2);
        add(Scores, 0, 4);


    }

    public void processRoll(ActionEvent event) {
        myGame.start(((roll1.getText())));
    }

    public void processPass(ActionEvent event) {
        myAccount.deposit((Double.parseDouble(two.getText())));
    }

    public void processCheckStatus(ActionEvent event) {
        accStatusTextField.setText(myAccount.toString());

    }

    public void processCreateAccount(ActionEvent event) {

        myAccount = new BankAccount("Nina", "Wells Fargo", accNameTextField.getText(),
                0, 0.0, Integer.parseInt(pinTextField.getText()));
    }
}




