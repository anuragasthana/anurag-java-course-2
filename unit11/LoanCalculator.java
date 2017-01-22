import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * The Class LoanCalculator.
 */
public class LoanCalculator extends Application {

	/** The AIR input. */
	private TextField AIRInput;

	/** The Number of years input. */
	private TextField NoofYearsInput;

	/** The Loan amount input. */
	private TextField LoanAmountInput;

	/** The Monthly payment input. */
	private TextField MonthlyPaymentInput;

	/** The Total payment input. */
	private TextField TotalPaymentInput;

	/** The calculate. */
	private Button calculate;

	/**
	 * The Class calculateHandler.
	 */
	class calculateHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {
			monthlyPaymentCalculator();
		}

	}

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

		Label AIR = new Label("Annual Interest Rate (Decimal): ");
		AIRInput = new TextField();
		rootNode.add(AIR, 0, 0);
		rootNode.add(AIRInput, 1, 0);

		Label NoofYears = new Label("Number of years: ");
		NoofYearsInput = new TextField();
		rootNode.add(NoofYears, 0, 1);
		rootNode.add(NoofYearsInput, 1, 1);

		Label LoanAmount = new Label("Loan Amount: ");
		LoanAmountInput = new TextField();
		rootNode.add(LoanAmount, 0, 2);
		rootNode.add(LoanAmountInput, 1, 2);

		Label MonthlyPayment = new Label("Monthly Payment: ");
		MonthlyPaymentInput = new TextField();
		rootNode.add(MonthlyPayment, 0, 3);
		rootNode.add(MonthlyPaymentInput, 1, 3);

		Label TotalPayment = new Label("Total Payment: ");
		TotalPaymentInput = new TextField();
		rootNode.add(TotalPayment, 0, 4);
		rootNode.add(TotalPaymentInput, 1, 4);

		calculate = new Button("Calculate");
		calculate.setOnAction(new calculateHandler());
		rootNode.add(calculate, 1, 5);
		GridPane.setHalignment(calculate, HPos.RIGHT);

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

	/**
	 * Monthly payment calculator.
	 */
	public void monthlyPaymentCalculator() {
		double annualInterestRate = Double.parseDouble(AIRInput.getText());
		double numberOfYears = Double.parseDouble(NoofYearsInput.getText());
		double loanAmount = Double.parseDouble(LoanAmountInput.getText());

		double i = annualInterestRate / 12;
		double n = numberOfYears * 12;
		double denominator = 1 - (Math.pow(1 + i, -n));
		double monthlyPayment = (i * loanAmount) / denominator;
		double totalPayment = monthlyPayment * n;

		MonthlyPaymentInput.setText(Double.toString(monthlyPayment));
		TotalPaymentInput.setText(Double.toString(totalPayment));
	}

}
