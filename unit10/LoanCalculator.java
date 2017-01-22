package unit10;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;

/**
 * The Class LoanCalculator.
 */
public class LoanCalculator extends Application {

	public void init() {

	}

	public void start(Stage myStage) {
		myStage.setTitle("Loan Calculator");
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(20));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(rootNode, 400, 300);

		Label AIR = new Label("Annual Interest Rate: ");
		TextField AIRInput = new TextField();
		rootNode.add(AIR, 0, 0);
		rootNode.add(AIRInput, 1, 0);

		Label NoofYears = new Label("Number of years: ");
		TextField NoofYearsInput = new TextField();
		rootNode.add(NoofYears, 0, 1);
		rootNode.add(NoofYearsInput, 1, 1);

		Label LoanAmount = new Label("Loan Amount: ");
		TextField LoanAmountInput = new TextField();
		rootNode.add(LoanAmount, 0, 2);
		rootNode.add(LoanAmountInput, 1, 2);

		Label MonthlyPayment = new Label("Monthly Payment: ");
		TextField MonthlyPaymentInput = new TextField();
		rootNode.add(MonthlyPayment, 0, 3);
		rootNode.add(MonthlyPaymentInput, 1, 3);

		Label TotalPayment = new Label("Total Payment: ");
		TextField TotalPaymentInput = new TextField();
		rootNode.add(TotalPayment, 0, 4);
		rootNode.add(TotalPaymentInput, 1, 4);

		Button calculate = new Button("Calculate");
		rootNode.add(calculate, 1, 5);
		rootNode.setHalignment(calculate, HPos.RIGHT);

		myStage.setScene(myScene);
		myStage.show();
	}

	public void stop() {

	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
