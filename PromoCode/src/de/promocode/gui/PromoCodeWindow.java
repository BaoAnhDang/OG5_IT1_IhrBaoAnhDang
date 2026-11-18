package de.promocode.gui;

import de.promocode.logic.CodeGenerator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class PromoCodeWindow extends Application {
	private Label lblUeberschrift = new Label("PromoCode 2.0");
	private Label lblSuche = new Label("Code:");
	private Label lblFeedback = new Label("");

	private NumberTextField tfdSuche = new NumberTextField();

	private Button btnBeenden = new Button("Beenden");
	private Button btnSuchen = new Button("Suchen");

	private long[] listCodes;

	private BorderPane pnlMain = new BorderPane();
	private FlowPane pnlNorth = new FlowPane();
	private FlowPane pnlCenter = new FlowPane();
	private ButtonBar pnlSouth = new ButtonBar();

	private PromoCodeHandler myEventHandler = new PromoCodeHandler(this);

	public Label getLblFeedback() {
		return lblFeedback;
	}

	public NumberTextField getTfdSuche() {
		return tfdSuche;
	}

	public Button getBtnBeenden() {
		return btnBeenden;
	}

	public Button getBtnSuchen() {
		return btnSuchen;
	}

	public long[] getListCodes() {
		return listCodes;
	}

	public void start(Stage primaryStage) {

		// Bereite Liste vor
		listCodes = CodeGenerator.getSortedList(20000000, 100000000000L, 999999999999L);

		// Bereite TextField vor
		StringConverter<Long> formatter;
		formatter = new StringConverter<Long>() {
			@Override
			public Long fromString(String string) {
				return Long.parseLong(string);
			}

			@Override
			public String toString(Long object) {
				if (object == null)
					return "0";
				return object.toString();
			}
		};
		getTfdSuche().setTextFormatter(new TextFormatter<Long>(formatter));

		// Setze Schriftart
		this.lblUeberschrift.setFont(Font.font(null, FontWeight.BOLD, 16));

		// Fuege Elemente zu Panes
		this.pnlNorth.getChildren().addAll(this.lblUeberschrift);
		this.pnlNorth.setAlignment(Pos.CENTER);
		this.pnlNorth.setStyle("-fx-background-color:#c0c0c0");

		this.pnlCenter.setPadding(new Insets(10));
		this.pnlCenter.setHgap(10);
		this.pnlCenter.setAlignment(Pos.CENTER);
		this.pnlCenter.getChildren().addAll(this.lblSuche, this.tfdSuche, this.lblFeedback);

		this.pnlSouth.getButtons().addAll(this.btnSuchen, this.btnBeenden);
		this.pnlSouth.setPadding(new Insets(3));

		// Fuege Panes hinzu
		pnlMain.setTop(pnlNorth);
		pnlMain.setCenter(pnlCenter);
		pnlMain.setBottom(pnlSouth);

		// Ereignissteuerung
		this.btnSuchen.setOnAction(myEventHandler);
		this.btnBeenden.setOnAction(myEventHandler);

		// Lade Scene und Stage
		Scene myScene = new Scene(pnlMain);
		primaryStage.setTitle("PromoCode 2.0");
		primaryStage.setScene(myScene);
		primaryStage.sizeToScene();
		primaryStage.show();

	}

	public static void main(String argv[]) {
		launch(argv);
	}
}
