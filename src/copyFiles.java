import search.Move;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by Garfield on 2017/7/5.
 */
public class copyFiles {
    private JButton startButton;
    private JTextField TextField1;
    private JTextField TextField2;
    private JTextField TextField3;
    private JPanel copyFiles;
    private String startUrl;
    private String endUrl;
    private  String key;

    public String getStartUrl() {
        return startUrl;
    }

    public String getEndUrl() {
        return endUrl;
    }

    public String getKey() {
        return key;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("copyFiles");
        frame.setContentPane(new copyFiles().copyFiles);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(450,200);
        frame.setLocation(600,400);
        frame.setVisible(true);



    }

    public copyFiles() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button(e);
            }
        });
    }

    private void do_button(ActionEvent e) {
        File start = new File(startUrl = TextField1.getText());
        File end = new File(endUrl = TextField2.getText());
        key = TextField3.getText();
        try {
            Move.moveSub(start,end,key);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
