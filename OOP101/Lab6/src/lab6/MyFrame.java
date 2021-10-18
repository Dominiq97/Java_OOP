/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.*;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Dominic
 */
public class MyFrame extends Frame implements ActionListener {
    private Label nameLabel, cnpLabel, jobLabel, genderLabel;
    private TextField name, cnp;
    private Button button1, button2, button3;
    
    public MyFrame()
    {
        super("Enter new person");
        setLayout(new GridLayout(12, 12));
        setSize(400,400);
        
        Panel first = new Panel();
        first.setLayout(new FlowLayout());
        nameLabel = new Label("Name");
        first.add(nameLabel);
        name = new TextField();
        first.add(name);
        
        
        cnpLabel = new Label("CNP");
        first.add(cnpLabel);
        cnp = new TextField();
        first.add(cnp);
        
        CheckboxGroup cbg = new CheckboxGroup();
        genderLabel = new Label("Gender");
        first.add(genderLabel);
            first.add(new Checkbox("M", cbg, false));
            first.add(new Checkbox("F", cbg, false));
        add(first);
        
        Panel list = new Panel();
        jobLabel = new Label("Job");
        list.add(jobLabel);
            Choice list1;
            list1=new Choice();            
            list1.add("Vidanjor");
            list1.add("Avocat");
            list1.add("Dezamagire");
            list.add(list1);
            add(list);
        
        Panel buttons = new Panel();
        buttons.setSize(100,200);
        button1 = new Button("Save");
        button1.setLabel("Save");
        buttons.add(button1);
        button2 = new Button("Clear");
        button2.setLabel("Clear");
        buttons.add(button2);
        button3 = new Button("Exit");
        button3.setLabel("Exit");
        button3.setSize(5,5);
        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        buttons.add(button3);
        buttons.setVisible(true);
        add(buttons);       

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    
}
