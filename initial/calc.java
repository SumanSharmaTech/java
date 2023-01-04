import java.awt.*;

public class calc extends Frame {
  public calc() {
    setSize(360, 250);
    setTitle("My first Calculator");

    // 1st
    Label input1Label = new Label("First number:");
    input1Label.setBounds(20, 30, 100, 30);
    TextField input1Field = new TextField();
    input1Field.setBounds(120, 30, 200, 30);
    // 2nd
    Label input2Label = new Label("Second Number:");
    input2Label.setBounds(20, 80, 100, 30);
    TextField input2Field = new TextField();
    input2Field.setBounds(120, 80, 200, 30);
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
    calculateButton.setBackground(Color.green);

    // logic
    calculateButton.addActionListener(e -> {
      if (addCheckbox.getState()) {
        int result = Integer.parseInt(input1Field.getText()) + Integer.parseInt(input2Field.getText());
        resultField.setText(String.valueOf(result));
      } else if (subtractCheckbox.getState()) {
        int result = Integer.parseInt(input1Field.getText()) - Integer.parseInt(input2Field.getText());
        resultField.setText(String.valueOf(result));
      } else if (multiplyCheckbox.getState()) {
        int result = Integer.parseInt(input1Field.getText()) * Integer.parseInt(input2Field.getText());
        resultField.setText(String.valueOf(result));
      } else if (divideCheckbox.getState()) {
        int result = Integer.parseInt(input1Field.getText()) / Integer.parseInt(input2Field.getText());
        resultField.setText(String.valueOf(result));
      }
    });
    // Adding
    setLayout(null);
    add(input1Label);
    add(input1Field);
    add(input2Label);
    add(input2Field);
    add(resultLabel);
    add(resultField);
    add(addCheckbox);
    add(subtractCheckbox);
    add(multiplyCheckbox);
    add(divideCheckbox);
    add(calculateButton);
  }
  public static void main(String[] args) {
    calc frame = new calc();
    frame.setVisible(true);
  }
}
