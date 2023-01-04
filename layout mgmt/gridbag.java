import java.awt.*;


public class gridbag extends Frame {
    GridBagConstraints cons;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button res;
    public gridbag() {
        cons = new GridBagConstraints();
        cons.insets = new Insets(5,5,5,5);

        

        l1 = new Label("First Num:");
        l2 = new Label("Second Num:");
        l3 = new Label("Result:");


        t1 = new TextField("",20);
        t2 = new TextField("",20);
        t3 = new TextField("",20);


        res = new Button("OK");

        setSize(500,500);
        setLayout(new GridBagLayout());

        cons.gridx=0;
        cons.gridy=0;
        add(l1,cons);
        
        cons.gridx = 1;
        add(t1,cons);

        cons.gridx=0;
        cons.gridy=1;
        add(l2,cons);

        cons.gridx = 1;
        add(t2,cons);

        cons.gridx=0;
        cons.gridy=2;
        add(l3,cons);

        cons.gridx = 1;
        add(t3,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        //  cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(res,cons);

  }
  public static void main(String[] args) {
    gridbag a = new gridbag();
    a.setVisible(true);
  }
}
