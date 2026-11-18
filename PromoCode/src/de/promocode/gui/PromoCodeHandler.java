package de.promocode.gui;

import de.promocode.logic.CodeSearch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PromoCodeHandler implements EventHandler<ActionEvent> {

	private PromoCodeWindow mainWindow;

	public PromoCodeHandler(PromoCodeWindow _mainWindow) {
		this.mainWindow = _mainWindow;
	}

	@Override
	public void handle(ActionEvent event) {
		// Hole Quelle
		Object obj = event.getSource();

		/*
		 * Verarbeite Events - btnBeenden - btnEinfuellen - ...
		 */
		if (obj == mainWindow.getBtnBeenden())
			Platform.exit();

		if (obj == mainWindow.getBtnSuchen()) {
			if (CodeSearch.findPromoCode(mainWindow.getListCodes(),
					mainWindow.getTfdSuche().getNumber()) == CodeSearch.NOT_FOUND) {
				mainWindow.getLblFeedback().setText("UNG�LTIG");
				mainWindow.getLblFeedback().setStyle("-fx-text-fill:#990000");
			} else {
				mainWindow.getLblFeedback().setText("Code o.k.");
				mainWindow.getLblFeedback().setStyle("-fx-text-fill:#009900");

			}
		}
	}

}
