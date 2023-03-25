import java.awt.*;

public class calcui extends Frame
{
    public calcui(){
            
    setSize(360, 250);
    setTitle("My first Calculator");

    //panel
    Panel p1 = new Panel();
    p1.setBounds(0,0,360,150);
    p1.setLayout(null);
    p1.setBackground(Color.cyan);

    // 1st
    Label l1 = new Label("First number:");
    l1.setBounds(20, 30, 100, 30);
    TextField i1 = new TextField();
    i1.setBounds(120, 30, 200, 30);
    // 2nd
    Label l2 = new Label("Second Number:");
    l2.setBounds(20, 80, 100, 30);
    TextField i2 = new TextField();
    i2.setBounds(120, 80, 200, 30);
    // result
    Label resultLabel = new Label("Result:");
    resultLabel.setBounds(20, 130, 100, 30);
    TextField resultField = new TextField();
    resultField.setBounds(120, 130, 200, 30);

    // checkbox 
    CheckboxGroup operationGroup = new CheckboxGroup();
    Checkbox addCheckbox = new Checkbox("Add", operationGroup, true);
    addCheckbox.setBounds(40, 170, 50, 30);
    Checkbox subtractCheckbox = new Checkbox("Subtract", operationGroup, false);
    subtractCheckbox.setBounds(100, 170, 70, 30);
    Checkbox multiplyCheckbox = new Checkbox("Multiply", operationGroup, false);
    multiplyCheckbox.setBounds(180, 170, 70, 30);
    Checkbox divideCheckbox = new Checkbox("Divide", operationGroup, false);
    divideCheckbox.setBounds(260, 170, 70, 30);

    // calculate 
    Button calculateButton = new Button("Calculate");
    calculateButton.setBounds(70, 200, 200, 30);
    calculateButton.setBackground(Color.cyan);

    // logic
    // calculateButton.addActionListener(e -> {
    //   if (addCheckbox.getState()) {
    //     int result = Integer.parseInt(i1.getText()) + Integer.parseInt(i2.getText());
    //     resultField.setText(String.valueOf(result));
    //   } else if (subtractCheckbox.getState()) {
    //     int result = Integer.parseInt(i1.getText()) - Integer.parseInt(i2.getText());
    //     resultField.setText(String.valueOf(result));
    //   } else if (multiplyCheckbox.getState()) {
    //     int result = Integer.parseInt(i1.getText()) * Integer.parseInt(i2.getText());
    //     resultField.setText(String.valueOf(result));
    //   } else if (divideCheckbox.getState()) {
    //     int result = Integer.parseInt(i1.getText()) / Integer.parseInt(i2.getText());
    //     resultField.setText(String.valueOf(result));
    //   }
    // });
    // Adding
    setLayout(null);
    p1.add(l1);
    p1.add(i1);
    p1.add(l2);
    p1.add(i2);
    p1.add(resultLabel);
    p1.add(resultField);
    add(addCheckbox);
    add(subtractCheckbox);
    add(multiplyCheckbox);
    add(divideCheckbox);
    add(calculateButton);


    }
    public static void main (String[] args){
        calcui c = new calcui();
        c.setVisible(true);
    }
}