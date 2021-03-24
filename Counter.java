import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  JLabel label;

  int leftCount;
  int rightCount;

  Counter() {
    JFrame frame = new JFrame("Let's Count!");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftCount = 0;
    rightCount = 0;


    leftLabel = new JLabel("Count: " + leftCount);
    rightLabel = new JLabel("Count: " + rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    label = new JLabel("Press a button!");
    frame.add(label);
    frame.setVisible(true);
  }


public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")) {
    leftCount++;
    leftLabel.setText("Left: " + leftCount);
    rightLabel.setText("Right: " + rightCount);
    label.setText("You pressed left.");
  }
  else if (ae.getActionCommand().equals("Right")) {
    rightCount++;
    leftLabel.setText("Left: " + leftCount);
    rightLabel.setText("Right: " + rightCount);
    label.setText("You pressed right.");
  }

  else {
    leftCount = 0; 
    leftLabel.setText("Left: " + leftCount);
    rightCount = 0;
    rightLabel.setText("Left:  " + rightCount);
    label.setText("You pressed reset.");
  }
}
}