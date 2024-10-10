package gui;

import java.awt.*;
import java.awt.event.*;

class Close extends WindowAdapter { //To Close The Gui Window

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;   //initializing a textfield variable
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, //keys of the calculator
            b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;

    String fv, sv, op; //final value, stored value, operator
    Double fdv, sdv, tot; //final double value, stored double value, total

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new Close());
        f.setBackground(Color.BLACK);
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(350, 450);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Quicksand", Font.PLAIN, 12);  //creating fonts for the calculator
        Font f2 = new Font("Arial Nova", Font.BOLD, 30);  //creating fonts for the calculator
        Font f3 = new Font("Quicksand", Font.PLAIN, 40);   //creating fonts for the calculator
        Font f4 = new Font("Arial Nova", Font.BOLD, 15);  //creating fonts for the calculator

        MenuBar mb = new MenuBar();//creating a Menu bar
        mb.setFont(f1);

        Menu m1 = new Menu("View"); //creating a Menu bar item
        MenuItem mi = new MenuItem("Standard");  //creating sub items for the menu bar item
        m1.add(mi); //adding created sub items to the menu bar item

        Menu m2 = new Menu("Edit"); //creating a Menu bar item
        MenuItem mi2 = new MenuItem("Copy");  //creating sub items for the menu bar item
        MenuItem mi3 = new MenuItem("Cut");  //creating sub items for the menu bar item
        m2.add(mi2);   //adding created sub items to the menu bar item
        m2.add(mi3);   //adding created sub items to the menu bar item

        Menu m3 = new Menu("Font"); //creating a Menu bar item
        MenuItem mi4 = new MenuItem("QuickSand");  //creating sub items for the menu bar item
        MenuItem mi5 = new MenuItem("Arial Nova");  //creating sub items for the menu bar item
        m3.add(mi4);  //adding created sub items to the menu bar item
        m3.add(mi5);  //adding created sub items to the menu bar item

        mb.add(m1); //adding menu bar items to the menubar
        mb.add(m2); //adding menu bar items to the menubar
        mb.add(m3); //adding menu bar items to the menubar
        f.setMenuBar(mb); //adding menu bar to the calculator window

        Panel p1 = new Panel(); //creating a panel
        GridLayout gl = new GridLayout(1, 1, 0, 0);
        p1.setLayout(gl);
        p1.setBackground(Color.BLACK);
        
        Panel p2 = new Panel(); //creating a panel
        GridLayout g2 = new GridLayout(6, 4, 4, 4); //creating a grid layout to the panel (rows,columns,horizontal gap, vertical gap)
        p2.setLayout(g2);  //adding grid layout to the panel
        p2.setBackground(Color.BLACK);
        p2.setForeground(Color.white);

        tf = new TextField(20); //assigning a textfeild 
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.WHITE);
        tf.setBackground(Color.BLACK);
        tf.setText("0");

        p1.add(tf); //adding textfield to the panel p1

        b1 = new Button("%"); //creating new buttons and giving them labels
        b2 = new Button("CE");
        b3 = new Button("C");
        b4 = new Button("Backspace");
        b5 = new Button("1∕x");
        b6 = new Button("x²");
        b7 = new Button("²√x");
        b8 = new Button("÷");
        b9 = new Button("7");
        b10 = new Button("8");
        b11 = new Button("9");
        b12 = new Button("×");
        b13 = new Button("4");
        b14 = new Button("5");
        b15 = new Button("6");
        b16 = new Button("-");
        b17 = new Button("1");
        b18 = new Button("2");
        b19 = new Button("3");
        b20 = new Button("+");
        b21 = new Button("+/-");
        b22 = new Button("0");
        b23 = new Button(".");
        b24 = new Button("=");

        b1.setBackground(Color.DARK_GRAY); //setting bkacground colors for buttons
        b2.setBackground(Color.DARK_GRAY);
        b3.setBackground(Color.DARK_GRAY);
        b4.setBackground(Color.DARK_GRAY);
        b5.setBackground(Color.DARK_GRAY);
        b6.setBackground(Color.DARK_GRAY);
        b7.setBackground(Color.DARK_GRAY);
        b8.setBackground(Color.DARK_GRAY);
        b9.setBackground(Color.GRAY);
        b10.setBackground(Color.GRAY);
        b11.setBackground(Color.GRAY);
        b12.setBackground(Color.DARK_GRAY);
        b13.setBackground(Color.GRAY);
        b14.setBackground(Color.GRAY);
        b15.setBackground(Color.GRAY);
        b16.setBackground(Color.DARK_GRAY);
        b17.setBackground(Color.GRAY);
        b18.setBackground(Color.GRAY);
        b19.setBackground(Color.GRAY);
        b20.setBackground(Color.DARK_GRAY);
        b21.setBackground(Color.DARK_GRAY);
        b22.setBackground(Color.GRAY);
        b23.setBackground(Color.DARK_GRAY);
        b24.setBackground(Color.CYAN);

        b1.setFont(f2); //setting fonts for the buttons
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f4);
        b5.setFont(f4);
        b6.setFont(f4);
        b7.setFont(f4);
        b8.setFont(f2);
        b9.setFont(f2);
        b10.setFont(f2);
        b11.setFont(f2);
        b12.setFont(f2);
        b13.setFont(f2);
        b14.setFont(f2);
        b15.setFont(f2);
        b16.setFont(f2);
        b17.setFont(f2);
        b18.setFont(f2);
        b19.setFont(f2);
        b20.setFont(f2);
        b21.setFont(f2);
        b22.setFont(f2);
        b23.setFont(f2);
        b24.setFont(f2);

        p2.add(b1); //adding buttons to the p2 panel
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);  //adding panel p1 to the frame window
        f.add(p2, BorderLayout.SOUTH);  //adding panel p2 to the frame window

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object o = d.getSource();

        if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b22)) {
            tf.setText(tf.getText() + b22.getLabel());
        } else if (o.equals(b23)) {
            tf.setText(tf.getText() + b23.getLabel());
        } else if (o.equals(b20)) { // +
            fv = tf.getText();
            op = b20.getLabel();
            tf.setText("");
        } else if (o.equals(b16)) { // -
            fv = tf.getText();
            op = b16.getLabel();
            tf.setText("");
        } else if (o.equals(b12)) {
            fv = tf.getText();
            op = b12.getLabel();
            tf.setText("");
        } else if (o.equals(b8)) {
            fv = tf.getText();
            op = b8.getLabel();
            tf.setText("");
        } else if (o.equals(b1)) {
            fv = tf.getText();
            op = b1.getLabel();
            tf.setText("");
        } else if (o.equals(b3)) {
            tf.setText("");
        } else if (o.equals(b4)) {
            fv = tf.getText();
            op = b1.getLabel();
            if (fv.length() > 0) {
                tf.setText(fv.substring(0, fv.length() - 1));
            }

        } else if (o.equals(b21)) {       //+/-
            try {
                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                tf.setText(-(fdv) + "");
            } catch (Exception e) {
                tf.setText("0");
            }

        } else if (o.equals(b5)) {       // 1/x
            try {
                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                tf.setText(1 / fdv + "");
            } catch (Exception e) {
            }
        } else if (o.equals(b2)) {       //CE
            try {
                tf.setText("0");

            } catch (Exception e) {
                tf.setText("0");
            }

        } else if (o.equals(b6)) {      //x²
            try {
                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                tf.setText(Math.pow(fdv, 2) + "");
            } catch (Exception e) {
            }
        } else if (o.equals(b7)) {     //²√x
            try {
                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                if (fdv != 0 && !tf.getText().isEmpty()) {
                    tf.setText(Math.sqrt(fdv) + "");
                }
            } catch (Exception e) {
            }
        } else if (o.equals(b24)) {     // =

            try {

                if (fv.equals("")) {
                    fv = "0";
                }

                sv = tf.getText();

                if (sv.equals("")) {
                    sv = "0";
                }

                fdv = Double.parseDouble(fv); //converting String to Double
                sdv = Double.parseDouble(sv); //converting String to Double

                tf.setText("0");

                if (op.equals("+")) {
                    tot = fdv + sdv;
                    tf.setText(tot + "");
                } else if (op.equals("-")) {
                    tot = fdv - sdv;
                    tf.setText(tot + "");
                } else if (op.equals("×")) {
                    tot = fdv * sdv;
                    tf.setText(tot + "");
                } else if (op.equals("÷")) {
                    tot = fdv / sdv;
                    tf.setText(tot + "");
                } else if (op.equals("%")) {
                    tot = fdv * 100 / sdv;
                    tf.setText(tot + "");
                }
            } catch (Exception e) {
                tf.setText("0");
            }

        }

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }

}
