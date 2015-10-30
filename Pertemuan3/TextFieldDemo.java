/*
*TextFieldDemo.java requires one additional file:
*content.txt
*/

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.*;

public class TextFieldDemo extends JFrame
    implements DocumentListener{
    
    private JTextField entry;
    private JLabel jLabel1;
    private JScrollPane jScrollPanel;
    private JLabel status;
    private JTextArea textArea;
    
    final static Color HILIT_COLOR = Color.LIGHT_GRAY;
    final static Color ERROR_COLOR = Color.PINK;
    final static String CANCEL_ACTION = "cancel-search";
    
    final Color entryBg;
    final Highlighter hilit;
    final Highlighter.HighlightPainter painter;
    
    
    
    public TextFieldDemo(){
        initComponents();
        
        inputStream in = getClass().getResourceAsStream("content.txt");
        try{
            textArea.read(new InputStreamReader(in),null);
        }catch (IOException e){
            e.printStackTrace();
        }
        
        hilit = new DefaultHighlighter();
        painter = new DefaultHighlighter.DefaultHighlightPainter(HILIT_COLOR);
        textArea.setHighlighter(hilit);
        
        entryBg = entry.getBackground();
        entry.getDocument().addDocumentListener(this);
        
        inputMap im = entry.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = entry.getActionMap();
        im.put(KeyStroke.getKeyStroke("ESCAPE"),CANCEL_ACTION);
        am.put(CANCEL_ACTION, new CancelAction());
    }
    
    /** This method is called from within the constructor to
    *initialize the form.
    */
    
    private void initComponents(){
        entry = new JTextField();
        textArea = new JTextArea();
        status = new JLabel();
        jLabel1 = new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TextFieldDemo");
        
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        jScrollPanel = new JScrollPanel(textArea);
        
        jLabel1.setText("Enter text to search:");
        
        GroupLayout layout = new GroupLayout(getContentPanel());
        getContentPane().setLayout(layout);
        
//Create a parallel group for the horizontal axis
        ParallelGroup hGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        
        //Create a sequential and a parallel groups
        SequentialGroup h1 = layout.createSequentialGroup();
        ParallelGroup h2 = layout.createParallelGroup(GroupLayout.Alignment.TRAILING);
        
        //Add a container gap to the sequential group h1
        h1.addContainerGap();
        
        //Add a scroll pane and a label to the parallel group h2
        h2.addComponent(jScrollPane1,GroupLayout.Alignment.LEADING,GroupLayout.DEFAULT_SIZE,450,Short.MAX_VALUE);
        h2.addComponent(status,GroupLayout.Alignment.LEADING,GroupLayout.DEFAULT_SIZE,450,Short.MAX_VALUE);
        
        //Create a sequential group h3
        SequentialGroup h3 = layout.createSequentialGroup();
        h3.addComponent(jLabel1);
        h3.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED);
        h3.addComponent(entry,GroupLayout.DEFAULT_SIZE,321,Short.MAX_VALUE);
        //Add the group h3 to the group h2
        h2.addGroup(h3);
        //Add the group h2 to the group h1
        h1.addGroup(h2);
        
        h1.addContainerGap();
        
        //Add the group h1 to the hGroup
        hGroup.addGroup(GroupLayout.Alignment.TRAILING,h1);
        //Create the horizontal group
        layout.setHorizontalGroup(hGroup);
        
        //Create a parallel group for the vertical axis
        ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment);
    


