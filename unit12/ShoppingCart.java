package unit12;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class ShoppingCart.
 */
public class ShoppingCart extends Application {

	/** The name input. */
	private TextField nameInput;

	/** The email input. */
	private TextField emailInput;

	/** The payment. */
	private ComboBox<String> payment;

	/** The song1. */
	private CheckBox song1;

	/** The song2. */
	private CheckBox song2;

	/** The song3. */
	private CheckBox song3;

	/** The song4. */
	private CheckBox song4;

	/** The song5. */
	private CheckBox song5;

	/** The song6. */
	private CheckBox song6;

	/** The song7. */
	private CheckBox song7;

	/** The song1 obj. */
	private Song song1Obj;

	/** The song2 obj. */
	private Song song2Obj;

	/** The song3 obj. */
	private Song song3Obj;

	/** The song4 obj. */
	private Song song4Obj;

	/** The song5 obj. */
	private Song song5Obj;

	/** The song6 obj. */
	private Song song6Obj;

	/** The song7 obj. */
	private Song song7Obj;

	/** The items intro. */
	private Label itemsIntro;

	/** The items. */
	private Label items;

	/** The item response. */
	private String itemResponse;

	/** The calculate. */
	private Button calculate;

	/** The price. */
	private Label price;

	/** The exit. */
	private Button exit;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#init()
	 */
	public void init() {

	}

	/**
	 * The Class song1Handler.
	 */
	class song1Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class song2Handler.
	 */
	class song2Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class song3Handler.
	 */
	class song3Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class song4Handler.
	 */
	class song4Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class song5Handler.
	 */
	class song5Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class song6Handler.
	 */
	class song6Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class song7Handler.
	 */
	class song7Handler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent e) {
			showall();
		}
	}

	/**
	 * The Class calculateHandler.
	 */
	class calculateHandler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent f) {
			calculatePrice();
		}
	}

	/**
	 * The Class exitHandler.
	 */
	class exitHandler implements EventHandler<ActionEvent> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javafx.event.EventHandler#handle(javafx.event.Event)
		 */
		public void handle(ActionEvent g) {
			System.exit(0);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	// start method for nodes
	public void start(Stage myStage) {
		myStage.setTitle("Shopping Cart");
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(20));
		rootNode.setHgap(5);
		rootNode.setVgap(10);
		rootNode.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(rootNode, 600, 700);

		Label name = new Label("Name: ");
		nameInput = new TextField();
		rootNode.add(name, 0, 0);
		rootNode.add(nameInput, 1, 0);

		Label email = new Label("Email Address: ");
		emailInput = new TextField();
		rootNode.add(email, 0, 1);
		rootNode.add(emailInput, 1, 1);

		Label paymentForm = new Label("Payment Form: ");
		ObservableList<String> paymentChoices = FXCollections
				.observableArrayList("Visa", "MasterCard", "Amex");
		payment = new ComboBox<String>(paymentChoices);
		payment.setValue("Visa");
		rootNode.add(paymentForm, 0, 2);
		rootNode.add(payment, 1, 2);

		song1Obj = new Song("Adventure of a Lifetime", "Coldplay", 0.99);
		song2Obj = new Song("One Dance", "Drake", 1.03);
		song3Obj = new Song("It's Time", "Imagine Dragons", 0.95);
		song4Obj = new Song("Under Pressure", "Queen", 1.09);
		song5Obj = new Song("Maps", "Maroon 5", 1.05);
		song6Obj = new Song("Wish You Were Here", "Pink Floyd", 1.05);
		song7Obj = new Song("Immortals", "Fall Out Boy", 1.01);

		Label songsToBuy = new Label("Songs to Buy:");
		rootNode.add(songsToBuy, 0, 5);
		song1 = new CheckBox(song1Obj.getTitle() + " - " + song1Obj.getArtist()
				+ "    Price: $" + song1Obj.getPrice());
		rootNode.add(song1, 0, 6);
		song2 = new CheckBox(song2Obj.getTitle() + " - " + song2Obj.getArtist()
				+ "    Price: $" + song2Obj.getPrice());
		rootNode.add(song2, 0, 7);
		song3 = new CheckBox(song3Obj.getTitle() + " - " + song3Obj.getArtist()
				+ "    Price: $" + song3Obj.getPrice());
		rootNode.add(song3, 0, 8);
		song4 = new CheckBox(song4Obj.getTitle() + " - " + song4Obj.getArtist()
				+ "    Price: $" + song4Obj.getPrice());
		rootNode.add(song4, 0, 9);
		song5 = new CheckBox(song5Obj.getTitle() + " - " + song5Obj.getArtist()
				+ "    Price: $" + song5Obj.getPrice());
		rootNode.add(song5, 0, 10);
		song6 = new CheckBox(song6Obj.getTitle() + " - " + song6Obj.getArtist()
				+ "    Price: $" + song6Obj.getPrice());
		rootNode.add(song6, 0, 11);
		song7 = new CheckBox(song7Obj.getTitle() + " - " + song7Obj.getArtist()
				+ "    Price: $" + song7Obj.getPrice());
		rootNode.add(song7, 0, 12);

		itemsIntro = new Label("Your Shopping Cart Contains: ");
		rootNode.add(itemsIntro, 0, 14);
		items = new Label();
		rootNode.add(items, 1, 14);
		GridPane.setValignment(itemsIntro, VPos.TOP);
		song1.setOnAction(new song1Handler());
		song2.setOnAction(new song2Handler());
		song3.setOnAction(new song3Handler());
		song4.setOnAction(new song4Handler());
		song5.setOnAction(new song5Handler());
		song6.setOnAction(new song6Handler());
		song7.setOnAction(new song7Handler());

		calculate = new Button("Calculate Price");
		calculate.setOnAction(new calculateHandler());
		rootNode.add(calculate, 0, 16);
		price = new Label();
		rootNode.add(price, 1, 16);

		exit = new Button("Exit");
		exit.setOnAction(new exitHandler());
		rootNode.add(exit, 1, 18);

		myStage.setScene(myScene);
		myStage.show();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#stop()
	 */
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
	 * Showall. Used to display songs that are checked
	 */
	public void showall() {
		itemResponse = "";

		if (song1.isSelected())
			itemResponse += "'" + song1Obj.getTitle() + "'\n";
		if (song2.isSelected())
			itemResponse += "'" + song2Obj.getTitle() + "'\n";
		if (song3.isSelected())
			itemResponse += "'" + song3Obj.getTitle() + "'\n";
		if (song4.isSelected())
			itemResponse += "'" + song4Obj.getTitle() + "'\n";
		if (song5.isSelected())
			itemResponse += "'" + song5Obj.getTitle() + "'\n";
		if (song6.isSelected())
			itemResponse += "'" + song6Obj.getTitle() + "'\n";
		if (song7.isSelected())
			itemResponse += "'" + song7Obj.getTitle() + "'\n";

		items.setText(itemResponse);

	}

	/**
	 * Calculate price of the songs selected.
	 */
	public void calculatePrice() {
		float totalPrice = 0;

		if (song1.isSelected())
			totalPrice += song1Obj.getPrice();
		if (song2.isSelected())
			totalPrice += song2Obj.getPrice();
		if (song3.isSelected())
			totalPrice += song3Obj.getPrice();
		if (song4.isSelected())
			totalPrice += song4Obj.getPrice();
		if (song5.isSelected())
			totalPrice += song5Obj.getPrice();
		if (song6.isSelected())
			totalPrice += song6Obj.getPrice();
		if (song7.isSelected())
			totalPrice += song7Obj.getPrice();

		String totalPriceString = String.format("%.2f", totalPrice);

		price.setText("$" + totalPriceString);
	}

}
