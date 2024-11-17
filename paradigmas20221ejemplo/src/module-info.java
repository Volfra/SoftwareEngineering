module paradigmas20221ejemplo {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.sql;
	requires java.desktop;
	
	opens co.edu.poli.ex.model to 
		javafx.graphics, javafx.fxml, javafx.fxml.FXMLLoader;

	opens co.edu.poli.ex.controller to 
	javafx.graphics, javafx.fxml, javafx.fxml.FXMLLoader, javax.swing;
	
}
