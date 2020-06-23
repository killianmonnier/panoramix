package application.UI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AideWindow extends Stage {
	private Label label_titre = new Label("Besoin d'aide ?");
	private Label label_text = new Label("Voici un tutoriel pour vous aider � utiliser ce logiciel.\n\n"
			+ "1) Pour ajouter un panneau cliquer sur \"�diter\" puis \"Ajouter\" et s�lectionner panneau. Vous devrez saisir les diff�rentes informations puis s�lectionner un endroit o� placer le panneau.\n\n"
			+ "2) Pour ajouter un client cliquer sur \"�diter\" puis \"Ajouter\" et s�lectionner client. Vous devrez obligatoirement indiquer son nom, son adresse, son t�l�phone et son e-mail.\n\n"
			+ "3) Pour ajouter une location cliquer sur \"�diter\" puis \"Ajouter\" et s�lectionner location. Vous devrez obligatoirement indiquer un panneau, un client et une dur�e.\n\n"
			+ "4) Vous pouvez consulter les panneaux, clients et locations dans \"Affichage\".\n\n"
			+ "5) La suppression d'un panneau se fait via le bouton \"Supprimer\" � c�t� d'un panneau dans le tableau ou via le menu \"�diter\" puis \"Supprimer\".\n\n"
			+ "6) La suppression d'une location se fait via la liste des locations tout comme la suppression d'un client.\n\n"
			+ "N.B. : tant que les informations ne sont pas valide vous ne pourrez pas ajouter un panneau, un client ou une location.");

	public AideWindow() {
		this.setTitle("Panoramix - Aide");
		this.getIcons().add(new Image(MainWindow.class.getResourceAsStream("ressources/img/logo.png")));
        
		this.setResizable(false);
		Scene laScene = new Scene(creerContenu(), 400, 600);
		this.setScene(laScene);
		this.sizeToScene();
	}
	
	Parent creerContenu() {
		BorderPane borderPane = new BorderPane();
		label_titre.setFont(Font.font(20));
		BorderPane.setAlignment(label_titre, Pos.CENTER);
		borderPane.setTop(label_titre);
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setContent(label_text);
		label_text.setPadding(new Insets(20, 10, 20, 10));
		scrollPane.fitToWidthProperty().setValue(true);
		label_text.setWrapText(true);
		borderPane.setCenter(scrollPane);

		return borderPane;
	}

}
