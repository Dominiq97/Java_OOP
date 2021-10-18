/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class MyFrame extends Frame implements TextListener, ActionListener
{
    private Label label1, label2, label3;
    private Button buy;
    private TextField quantity, total;
    private Choice list;
    private FileInputStream inputFile, fis;
    private InputStreamReader reader;
    private BufferedReader br;
    private ObjectOutputStream oos;
    private FileOutputStream fos;
    private ObjectInputStream ois;
    
    public MyFrame() throws FileNotFoundException, IOException
    {
        inputFile=new FileInputStream("inventory.txt");
        reader=new InputStreamReader(inputFile);
        br=new BufferedReader(reader);
        
        
        
        fis = new FileInputStream("inventory.dat");
        ois = new ObjectInputStream(fis);
        
        
        
        setResizable(false);
        setLayout(new GridLayout(4,1));
        setSize(250,250);
        WindowListener listener = new Terminator();
        addWindowListener(listener);
        
        Panel panel1 = new Panel();
        panel1.setSize(200,70);
        label1 = new Label("Product:");
        panel1.add(label1);
        
        list = new Choice();
        String s;
        while((s=br.readLine())!=null)
        {
            String st[] = s.split(" ");
            list.add(st[0]);
        }
        panel1.add(list);
        
        add(panel1);
        
        Panel panel2 = new Panel();
        panel2.setSize(200,70);
        label2 = new Label("Quantity:");
        panel2.add(label2);
        
        quantity = new TextField(10);
        quantity.addTextListener(this);
        panel2.add(quantity);
        
        add(panel2);
        
        Panel panel3 = new Panel();
        panel3.setSize(200,70);
        
        label3 = new Label("Total:");
        panel3.add(label3);
        
        total = new TextField(10);
        panel3.add(total);
        
        add(panel3);
        
        buy = new Button("Buy");
        buy.addActionListener(this);
        add(buy);
        
    }

    @Override
    public void textValueChanged(TextEvent te) {
        
        try {
            inputFile = new FileInputStream("inventory.txt");
            reader = new InputStreamReader(inputFile);
            br = new BufferedReader(reader);
            String s;
            
            while((s=br.readLine())!=null)
            {
                String st[] = s.split(" ");
                if(st[0].equals(list.getSelectedItem()))
                {
                    total.setText(Integer.toString(Integer.parseInt(quantity.getText())*Integer.parseInt(st[1])));
                    break;
                }
          
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Map<String,Product> products = new HashMap<>();
        try {
            
            Product HDD = null,Monitor = null,CPU = null;
            try {
                HDD = (Product) ois.readObject();
                Monitor = (Product) ois.readObject();
                CPU = (Product) ois.readObject();
                ois.close();
                
                
                products.put("HDD",HDD);
                products.put("Monitor",Monitor);
                products.put("CPU", CPU);
                
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Product p = new Product(list.getSelectedItem(),Integer.parseInt(quantity.getText()),Integer.parseInt(total.getText()));
            if(p.getType().equals("HDD"))
                HDD.setQuantity(HDD.getQuantity() + p.getQuantity());
            if(p.getType().equals("Monitor"))
                Monitor.setQuantity(Monitor.getQuantity() + p.getQuantity());
            if(p.getType().equals("CPU"))
                CPU.setQuantity(CPU.getQuantity() + p.getQuantity());
            
            fos = new FileOutputStream("inventory.dat");
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(HDD);
            oos.writeObject(Monitor);
            oos.writeObject(CPU);
            
            
        } catch (IOException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}