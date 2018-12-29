import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import Controller.*;
import Model.*;
import View.*;

public class Main extends Application{

    public static void main(String[] args){
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        AdminView adminView = new AdminView();
        Model model = new Model();
        AdminController controller = new AdminController();
        controller.link(model, adminView);

        Scene scene = new Scene(adminView, 1500, 800);
        primaryStage.setTitle("Admin");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();

    }
}
