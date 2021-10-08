import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override
    public void start(Stage arg0) throws Exception {
        FXMLLoader file = new FXMLLoader(getClass().getResource("Vistas/Layout.fxml")); 
        Parent root = file.load();
        Scene window = new Scene(root);
        arg0.setTitle("BODEGA"); 
        arg0.setScene(window);
        arg0.show();
    }
}