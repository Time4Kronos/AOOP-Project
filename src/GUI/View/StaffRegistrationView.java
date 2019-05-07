package GUI.View;

import GUI.Controller.StaffRegistrationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffRegistrationView extends StaffInfoView {

    private StaffRegistrationController controller;
    private JPanel panel;
    private JButton clicktoregister, cleartext;

    public StaffRegistrationView(StaffRegistrationController controller){
        super("Please enter Staff Data:",controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        panel = getPanel();
        setTitle("Staff Registration");

        cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 500, 138, 30);
        cleartext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clear(getStaffTextFields(),3);
            }
        });
        panel.add(cleartext);

        clicktoregister = new JButton("Register");
        clicktoregister.setBounds(50,500,138,30);
        clicktoregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controller.check(getStaffTextFields());
            }
        });
        panel.add(clicktoregister);

        pack();
        setLocationRelativeTo(null);
    }
}