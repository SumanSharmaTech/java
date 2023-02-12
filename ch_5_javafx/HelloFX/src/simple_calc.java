import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class simple_calc extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Simple calc");
        
        TextField txt_fn=new TextField();
        TextField txt_sn=new TextField();
        TextField txt_res=new TextField();
        Label lbl_fn=new Label("First num :");
        Label lbl_sn=new Label("Second num :");
        Label lbl_res=new Label("Result :");
        Button btn_add=new Button("ADD");
        Button btn_sub=new Button("SUB");

        EventHandler<ActionEvent> event=new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int fn=Integer.parseInt(txt_fn.getText());
                int sn=Integer.parseInt(txt_sn.getText());
                
                if (e.getSource()==btn_add) {
                    txt_res.setText(Integer.toString(fn+sn));
                }
                else if (e.getSource()==btn_sub) {
                    txt_res.setText(Integer.toString(fn-sn));
                }
            }
        };

        btn_add.setOnAction(event);
        btn_sub.setOnAction(event);

        GridPane grid=new GridPane();
        grid.add(lbl_fn, 0, 0, 1, 1);
        grid.add(txt_fn, 1, 0, 1, 1);
        grid.add(lbl_sn, 0, 1, 1, 1);
        grid.add(txt_sn, 1, 1, 1, 1);
        grid.add(btn_add, 0, 2, 1, 1);
        grid.add(btn_sub, 1, 2, 1, 1);
        grid.add(lbl_res, 0, 3, 1, 1);
        grid.add(txt_res, 1, 3, 1, 1);

        Scene scene=new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}