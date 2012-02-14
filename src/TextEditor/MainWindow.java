/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author dio
 */
public class MainWindow extends JFrame {
    
    public MainWindow() {
        this.init();
        this.setUpMenuBar();
        this.setupActionListeners();
        this.setupTextArea();
    }
    
    public void init() {
        this.setTitle("Text Editor");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void setUpMenuBar() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        
        openMenuItem = new JMenuItem("Open");
        openMenuItem.setName("openMenuItem");
        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setName("exitMenuItem");
        
        fileMenu.add(openMenuItem);
        fileMenu.add(exitMenuItem);
        
        
        menuBar.add(fileMenu);
        
        this.setJMenuBar(menuBar);
    }
    
    public void setupActionListeners() {
        menuEventHandler = new EventHandler();
        exitMenuItem.addActionListener(menuEventHandler);
    }
    
    public void setupTextArea() {
        mainWindowMainArea = new JPanel();
        
        
        textArea = new JTextArea();
        scrollingArea = new JScrollPane(textArea);
        
        mainWindowMainArea.setLayout(new BorderLayout());
        mainWindowMainArea.add(scrollingArea, BorderLayout.CENTER);
        
        
        this.setContentPane(scrollingArea);
    }
    private JMenuBar menuBar = null;
    private JMenu fileMenu = null;
    private JMenuItem exitMenuItem = null;
    private JMenuItem openMenuItem = null;
    private JTextArea textArea = null;
    JScrollPane scrollingArea = null;
    private JPanel mainWindowMainArea = null;
    private EventHandler menuEventHandler = null;
};
