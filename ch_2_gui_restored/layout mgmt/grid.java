import java.awt.*;


public class grid extends Frame {
    Label l1,l2,l3,prank;
    TextField t1,t2,t3;
    Button res;
    public grid() {
        setSize(500,500);
        
        setLayout(new GridLayout(4,2));

        l1 = new Label("First Num:");
        l2 = new Label("Second Num:");
        l3 = new Label("Result:");
        prank = new Label("");


        t1 = new TextField("",20);
        t2 = new TextField("",20);
        t3 = new TextField("",20);


        res = new Button("OK");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(res);


  }
  public static void main(String[] args) {
    grid a = new grid();
    a.setVisible(true);
  }
}
