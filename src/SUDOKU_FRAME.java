
import static java.awt.Color.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gaurang Sharma
 */
public class SUDOKU_FRAME extends javax.swing.JFrame {

   public String number;
   
    public SUDOKU_FRAME() {
        initComponents();
        number="1";
    }

    private String turn="1";
    
    private boolean globalFlag=false;
    
    private Stack<HashMap<JButton,String>> st=new Stack<HashMap<JButton,String>> ();
    
    private String solveBoard[][]=
    {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
        
    };
            
    public void choosenumber(JButton btn){
        
        slectionbtn1.setBackground(black);
        slectionbtn2.setBackground(black);
        slectionbtn3.setBackground(black);
        slectionbtn4.setBackground(black);
        slectionbtn5.setBackground(black);
        slectionbtn6.setBackground(black);
        slectionbtn7.setBackground(black);
        slectionbtn8.setBackground(black);
        slectionbtn9.setBackground(black);
        
        btn.setBackground(blue);
    }
    
    private void seeSolution(){
        JButton arr[] = {r0c3,r0c6,r0c7,r0c8,r1c0,r1c4,r1c5,r1c6,r1c8,r2c0,r2c2,r2c4,r2c7,r3c4,r3c5,r3c7,r4c1,r4c2,r4c6,r4c7,r5c1,r5c3,r5c4,r6c1,r6c4,r6c6,r6c8,r7c0,r7c3,r7c4,r7c8,r8c0,r8c1,r8c2,r8c5};
        HashSet<JButton> preDefine = new HashSet<>(Arrays.asList(arr));
        
        JButton btn [][] = {
            {r0c0,r0c1,r0c2,r0c3,r0c4,r0c5,r0c6,r0c7,r0c8},
            {r1c0,r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8},
            {r2c0,r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8},
            {r3c0,r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8},
            {r4c0,r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8},
            {r5c0,r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8},
            {r6c0,r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8},
            {r7c0,r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8},
            {r8c0,r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8}               
        };
        for (int i = 0; i<9; i++){
            for (int j = 0; j<9; j++){
                if (!preDefine.contains(btn[i][j])){
                    if (globalFlag == false){ // twik button
                        btn[i][j].setText(solveBoard[i][j]);
                        btn[i][j].setForeground(white);
                        btn[i][j].setBackground(black);
                    }else {
                        btn[i][j].setText("");
                        btn[i][j].setForeground(black);
                        btn[i][j].setBackground(white);
                    }
                }
            }
        }
        if (globalFlag == false){
            globalFlag = true;
            solutionbtn.setText("HIDE SOLN");
        }else{
            globalFlag = false;
            solutionbtn.setText("SOLUTION");
        }
    }
    
    private void ResetGame(){
         JButton arr[] = {r0c3,r0c6,r0c7,r0c8,r1c0,r1c4,r1c5,r1c6,r1c8,r2c0,r2c2,r2c4,r2c7,r3c4,r3c5,r3c7,r4c1,r4c2,r4c6,r4c7,r5c1,r5c3,r5c4,r6c1,r6c4,r6c6,r6c8,r7c0,r7c3,r7c4,r7c8,r8c0,r8c1,r8c2,r8c5};
       
         
           JButton btn [][] = {
            {r0c0,r0c1,r0c2,r0c3,r0c4,r0c5,r0c6,r0c7,r0c8},
            {r1c0,r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8},
            {r2c0,r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8},
            {r3c0,r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8},
            {r4c0,r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8},
            {r5c0,r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8},
            {r6c0,r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8},
            {r7c0,r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8},
            {r8c0,r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8}               
        };
           
           
           for(int i=0; i<9; i++){
                for (int j = 0; j<9; j++){
                boolean flag=true;
                
                
                for(int k=0; k<arr.length; k++)
                {
                    if(btn [i][j] == arr[k]) flag=false;
                }
                
                if(flag==true)
                {
                     btn[i][j].setText("");
                        btn[i][j].setForeground(black);
                        btn[i][j].setBackground(white);
                }
                    
                }
           }
           
           turn="1";
           
    }
    
    private void Undo(){
        
        if(st.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter a value first before using undo functionality","Sudoku game", JOptionPane.INFORMATION_MESSAGE );
        
        }
        else{
            HashMap<JButton,String> deleted=st.pop();
            HashMap.Entry<JButton,String> entry=deleted.entrySet().stream().findFirst().get();
            JButton deletedBtn= entry.getKey();
            boolean flag=false;
            
            
            Stack<HashMap<JButton,String>> tempSt =new Stack<HashMap<JButton,String>>();
            
            while(!st.isEmpty()){
                
                HashMap<JButton,String> temp=st.pop();
                tempSt.push(temp);
                
                
                HashMap.Entry<JButton,String> entry1 =temp.entrySet().stream().findFirst().get();
                JButton comparedBtn= entry1.getKey();
                String value= entry1.getValue();
                
                
                if(deletedBtn == comparedBtn){
                flag=true;
                comparedBtn.setText(value);
                break;
            }
        
                }
        if(flag==false){
            deletedBtn.setText("");
    }
        
        while(!tempSt.isEmpty()){
            
            HashMap<JButton,String> temp= tempSt.pop();
            st.push(temp);
        }
    }
    
    }
    
    
    
    
    private void checkMover(){
        
        JButton btn [][] = {
            {r0c0,r0c1,r0c2,r0c3,r0c4,r0c5,r0c6,r0c7,r0c8},
            {r1c0,r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8},
            {r2c0,r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8},
            {r3c0,r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8},
            {r4c0,r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8},
            {r5c0,r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8},
            {r6c0,r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8},
            {r7c0,r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8},
            {r8c0,r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8}               
        };
        
         for (int i = 0; i<9; i++){
            for (int j = 0; j<9; j++){
                
                if(btn[i][j].getText()!=solveBoard[i][j] && btn[i][j].getText()!=""){
                    btn[i][j].setBackground(red);
                }
                
               
            }
            
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        r0c3 = new javax.swing.JButton();
        r0c5 = new javax.swing.JButton();
        r0c4 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r1c4 = new javax.swing.JButton();
        r1c5 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r2c5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r0c0 = new javax.swing.JButton();
        r0c2 = new javax.swing.JButton();
        r0c1 = new javax.swing.JButton();
        r1c0 = new javax.swing.JButton();
        r1c1 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        r2c0 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        r0c6 = new javax.swing.JButton();
        r0c8 = new javax.swing.JButton();
        r0c7 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r1c7 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        r3c6 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r4c7 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        r3c3 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r4c4 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        r3c0 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r4c0 = new javax.swing.JButton();
        r4c1 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        r5c0 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        r6c6 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r7c7 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        r6c0 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r7c0 = new javax.swing.JButton();
        r7c1 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r8c0 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        r6c3 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r7c4 = new javax.swing.JButton();
        r7c5 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        slectionbtn2 = new javax.swing.JButton();
        slectionbtn3 = new javax.swing.JButton();
        slectionbtn4 = new javax.swing.JButton();
        slectionbtn1 = new javax.swing.JButton();
        slectionbtn6 = new javax.swing.JButton();
        slectionbtn7 = new javax.swing.JButton();
        slectionbtn9 = new javax.swing.JButton();
        slectionbtn5 = new javax.swing.JButton();
        slectionbtn8 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        undobtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        solutionbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUDOKU PUZZLE GAME");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUDOKU PUZZLE GAME");
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 66));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel2.setRequestFocusEnabled(false);

        r0c3.setBackground(new java.awt.Color(153, 153, 255));
        r0c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c3.setText("5");
        r0c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c3ActionPerformed(evt);
            }
        });

        r0c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c5ActionPerformed(evt);
            }
        });

        r0c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c4ActionPerformed(evt);
            }
        });

        r1c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r1c4.setBackground(new java.awt.Color(153, 153, 255));
        r1c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c4.setText("7");
        r1c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        r1c5.setBackground(new java.awt.Color(153, 153, 255));
        r1c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c5.setText("8");
        r1c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r2c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r2c4.setBackground(new java.awt.Color(153, 153, 255));
        r2c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c4.setText("4");
        r2c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r2c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r0c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r0c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r0c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r0c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r0c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r0c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel3.setRequestFocusEnabled(false);

        r0c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c0ActionPerformed(evt);
            }
        });

        r0c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c2ActionPerformed(evt);
            }
        });

        r0c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c1ActionPerformed(evt);
            }
        });

        r1c0.setBackground(new java.awt.Color(153, 153, 255));
        r1c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c0.setText("4");
        r1c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c0ActionPerformed(evt);
            }
        });

        r1c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r1c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r2c0.setBackground(new java.awt.Color(153, 153, 255));
        r2c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c0.setText("7");
        r2c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c0ActionPerformed(evt);
            }
        });

        r2c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r2c2.setBackground(new java.awt.Color(153, 153, 255));
        r2c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c2.setText("6");
        r2c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r0c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r0c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r0c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r1c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r2c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r0c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r0c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r0c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel4.setRequestFocusEnabled(false);

        r0c6.setBackground(new java.awt.Color(153, 153, 255));
        r0c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c6.setText("7");
        r0c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c6ActionPerformed(evt);
            }
        });

        r0c8.setBackground(new java.awt.Color(153, 153, 255));
        r0c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c8.setText("4");
        r0c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c8ActionPerformed(evt);
            }
        });

        r0c7.setBackground(new java.awt.Color(153, 153, 255));
        r0c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r0c7.setText("3");
        r0c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r0c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0c7ActionPerformed(evt);
            }
        });

        r1c6.setBackground(new java.awt.Color(153, 153, 255));
        r1c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c6.setText("5");
        r1c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r1c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new java.awt.Color(153, 153, 255));
        r1c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r1c8.setText("9");
        r1c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r2c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new java.awt.Color(153, 153, 255));
        r2c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c7.setText("2");
        r2c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r2c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r2c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r0c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r0c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r0c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r0c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r0c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r0c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel6.setRequestFocusEnabled(false);

        r3c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        r3c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r3c7.setBackground(new java.awt.Color(153, 153, 255));
        r3c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c7.setText("9");
        r3c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new java.awt.Color(153, 153, 255));
        r4c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c6.setText("2");
        r4c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r4c7.setBackground(new java.awt.Color(153, 153, 255));
        r4c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c7.setText("8");
        r4c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r4c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r5c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r5c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r5c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel5.setRequestFocusEnabled(false);

        r3c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        r3c5.setBackground(new java.awt.Color(153, 153, 255));
        r3c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c5.setText("5");
        r3c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });

        r3c4.setBackground(new java.awt.Color(153, 153, 255));
        r3c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c4.setText("3");
        r3c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r4c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r4c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new java.awt.Color(153, 153, 255));
        r5c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c3.setText("1");
        r5c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r5c4.setBackground(new java.awt.Color(153, 153, 255));
        r5c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c4.setText("8");
        r5c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r5c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });

        r4c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel7.setRequestFocusEnabled(false);

        r3c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c0ActionPerformed(evt);
            }
        });

        r3c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        r3c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r3c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r4c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c0ActionPerformed(evt);
            }
        });

        r4c1.setBackground(new java.awt.Color(153, 153, 255));
        r4c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c1.setText("3");
        r4c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r4c2.setBackground(new java.awt.Color(153, 153, 255));
        r4c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r4c2.setText("4");
        r4c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r5c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c0ActionPerformed(evt);
            }
        });

        r5c1.setBackground(new java.awt.Color(153, 153, 255));
        r5c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c1.setText("6");
        r5c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r5c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r5c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r3c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r4c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r5c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel9.setRequestFocusEnabled(false);

        r6c6.setBackground(new java.awt.Color(153, 153, 255));
        r6c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c6.setText("9");
        r6c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        r6c8.setBackground(new java.awt.Color(153, 153, 255));
        r6c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c8.setText("6");
        r6c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r6c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r7c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r7c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r7c8.setBackground(new java.awt.Color(153, 153, 255));
        r7c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c8.setText("2");
        r7c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r8c6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c6.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r8c7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c7.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r8c8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c8.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel10.setRequestFocusEnabled(false);

        jButton73.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton73.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton74.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton75.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton75.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton76.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton76.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton77.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton77.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton78.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton78.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton79.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton79.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton80.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton80.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton81.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton81.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel11.setRequestFocusEnabled(false);

        r6c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c0ActionPerformed(evt);
            }
        });

        r6c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r6c1.setBackground(new java.awt.Color(153, 153, 255));
        r6c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c1.setText("4");
        r6c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r7c0.setBackground(new java.awt.Color(153, 153, 255));
        r7c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c0.setText("3");
        r7c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c0ActionPerformed(evt);
            }
        });

        r7c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r7c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r8c0.setBackground(new java.awt.Color(153, 153, 255));
        r8c0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c0.setText("6");
        r8c0.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c0ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new java.awt.Color(153, 153, 255));
        r8c1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c1.setText("8");
        r8c1.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r8c2.setBackground(new java.awt.Color(153, 153, 255));
        r8c2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c2.setText("9");
        r8c2.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r6c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r7c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r8c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(146, 146));
        jPanel8.setRequestFocusEnabled(false);

        r6c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        r6c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new java.awt.Color(153, 153, 255));
        r6c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r6c4.setText("5");
        r6c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        r7c3.setBackground(new java.awt.Color(153, 153, 255));
        r7c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c3.setText("9");
        r7c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r7c4.setBackground(new java.awt.Color(153, 153, 255));
        r7c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c4.setText("6");
        r7c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r7c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r7c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r8c3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c3.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r8c4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c4.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new java.awt.Color(153, 153, 255));
        r8c5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        r8c5.setText("1");
        r8c5.setPreferredSize(new java.awt.Dimension(40, 40));
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        slectionbtn2.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn2.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn2.setText("2");
        slectionbtn2.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn2ActionPerformed(evt);
            }
        });

        slectionbtn3.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn3.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn3.setText("3");
        slectionbtn3.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn3ActionPerformed(evt);
            }
        });

        slectionbtn4.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn4.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn4.setText("4");
        slectionbtn4.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn4ActionPerformed(evt);
            }
        });

        slectionbtn1.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn1.setText("1");
        slectionbtn1.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn1ActionPerformed(evt);
            }
        });

        slectionbtn6.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn6.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn6.setText("6");
        slectionbtn6.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn6ActionPerformed(evt);
            }
        });

        slectionbtn7.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn7.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn7.setText("7");
        slectionbtn7.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn7ActionPerformed(evt);
            }
        });

        slectionbtn9.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn9.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn9.setText("9");
        slectionbtn9.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn9ActionPerformed(evt);
            }
        });

        slectionbtn5.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn5.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn5.setText("5");
        slectionbtn5.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn5ActionPerformed(evt);
            }
        });

        slectionbtn8.setBackground(new java.awt.Color(0, 0, 0));
        slectionbtn8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        slectionbtn8.setForeground(new java.awt.Color(255, 255, 255));
        slectionbtn8.setText("8");
        slectionbtn8.setPreferredSize(new java.awt.Dimension(50, 45));
        slectionbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slectionbtn8ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 51, 51));
        exitbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        undobtn.setBackground(new java.awt.Color(255, 204, 204));
        undobtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        undobtn.setText("UNDO");
        undobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undobtnActionPerformed(evt);
            }
        });

        checkbtn.setBackground(new java.awt.Color(51, 204, 0));
        checkbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        checkbtn.setText("CHECK MOVES");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        solutionbtn.setBackground(new java.awt.Color(255, 255, 0));
        solutionbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        solutionbtn.setText("SOLUTION");
        solutionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionbtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 153, 255));
        resetbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(undobtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetbtn)
                                .addGap(71, 71, 71)
                                .addComponent(exitbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solutionbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkbtn))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(slectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetbtn)
                    .addComponent(undobtn)
                    .addComponent(exitbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbtn)
                    .addComponent(solutionbtn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r0c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r0c3ActionPerformed

    private void r0c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c0ActionPerformed
        // TODO add your handling code here:
        r0c0.setBackground(white);
        r0c0.setText(number);
         
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r0c0,number);
        
        st.push(hm);
    }//GEN-LAST:event_r0c0ActionPerformed

    private void r0c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r0c6ActionPerformed

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c3ActionPerformed
        // TODO add your handling code here:
          r3c3.setBackground(white);
        r3c3.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r3c3,number);
        
        st.push(hm);
    }//GEN-LAST:event_r3c3ActionPerformed

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c6ActionPerformed
        // TODO add your handling code here:
          r3c6.setBackground(white);
        r3c6.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r3c6,number);
        
        st.push(hm);
        
    }//GEN-LAST:event_r3c6ActionPerformed

    private void r3c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c0ActionPerformed
        // TODO add your handling code here:
          r3c0.setBackground(white);
        r3c0.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r3c0,number);
        
        st.push(hm);
    }//GEN-LAST:event_r3c0ActionPerformed

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c3ActionPerformed
        // TODO add your handling code here:
         r6c3.setBackground(white);
        r6c3.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r6c3,number);
        
        st.push(hm);
    }//GEN-LAST:event_r6c3ActionPerformed

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r6c6ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void r6c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c0ActionPerformed
        // TODO add your handling code here:
         r6c0.setBackground(white);
        r6c0.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r6c0,number);
        
        st.push(hm);
    }//GEN-LAST:event_r6c0ActionPerformed

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c5ActionPerformed
        // TODO add your handling code here:
         r4c5.setBackground(white);
        r4c5.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r4c5,number);
        
        st.push(hm);
    }//GEN-LAST:event_r4c5ActionPerformed

    private void slectionbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn1ActionPerformed
        // TODO add your handling code here:
        
        number="1";
        choosenumber(slectionbtn1);
    }//GEN-LAST:event_slectionbtn1ActionPerformed

    private void slectionbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn2ActionPerformed
        // TODO add your handling code here:
         number="2";
        choosenumber(slectionbtn2);
    }//GEN-LAST:event_slectionbtn2ActionPerformed

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r2c4ActionPerformed

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r5c4ActionPerformed

    private void r7c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c0ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r7c0ActionPerformed

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r8c1ActionPerformed

    private void slectionbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn3ActionPerformed
        // TODO add your handling code here:
         number="3";
        choosenumber(slectionbtn3);
    }//GEN-LAST:event_slectionbtn3ActionPerformed

    private void slectionbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn4ActionPerformed
        // TODO add your handling code here:
         number="4";
        choosenumber(slectionbtn4);
    }//GEN-LAST:event_slectionbtn4ActionPerformed

    private void slectionbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn5ActionPerformed
        // TODO add your handling code here:
         number="5";
        choosenumber(slectionbtn5);
    }//GEN-LAST:event_slectionbtn5ActionPerformed

    private void slectionbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn6ActionPerformed
        // TODO add your handling code here:
         number="6";
        choosenumber(slectionbtn6);
    }//GEN-LAST:event_slectionbtn6ActionPerformed

    private void slectionbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn7ActionPerformed
        // TODO add your handling code here:
         number="7";
        choosenumber(slectionbtn7);
    }//GEN-LAST:event_slectionbtn7ActionPerformed

    private void slectionbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn8ActionPerformed
        // TODO add your handling code here:
         number="8";
        choosenumber(slectionbtn8);
    }//GEN-LAST:event_slectionbtn8ActionPerformed

    private void slectionbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slectionbtn9ActionPerformed
        // TODO add your handling code here:
         number="9";
        choosenumber(slectionbtn9);
    }//GEN-LAST:event_slectionbtn9ActionPerformed

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c4ActionPerformed
        // TODO add your handling code here:
        
        r4c4.setBackground(white);
        r4c4.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r4c4,number);
        
        st.push(hm);
    }//GEN-LAST:event_r4c4ActionPerformed

    private void r0c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c1ActionPerformed
        // TODO add your handling code here:
         r0c1.setBackground(white);
        r0c1.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r0c1,number);
        
        st.push(hm);
    }//GEN-LAST:event_r0c1ActionPerformed

    private void r0c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c2ActionPerformed
        // TODO add your handling code here:
         r0c2.setBackground(white);
        r0c2.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r0c2,number);
        
        st.push(hm);
    }//GEN-LAST:event_r0c2ActionPerformed

    private void r0c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c4ActionPerformed
        // TODO add your handling code here:
         r0c4.setBackground(white);
        r0c4.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r0c4,number);
        
        st.push(hm);
    }//GEN-LAST:event_r0c4ActionPerformed

    private void r0c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c5ActionPerformed
        // TODO add your handling code here:
         r0c5.setBackground(white);
        r0c5.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r0c5,number);
        
        st.push(hm);
    }//GEN-LAST:event_r0c5ActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed
        // TODO add your handling code here:
         r1c1.setBackground(white);
        r1c1.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r1c1,number);
        
        st.push(hm);
    }//GEN-LAST:event_r1c1ActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        // TODO add your handling code here:
         r1c2.setBackground(white);
        r1c2.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r1c2,number);
        
        st.push(hm);
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        // TODO add your handling code here:
         r1c3.setBackground(white);
        r1c3.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r1c3,number);
        
        st.push(hm);
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
        // TODO add your handling code here:
         r1c7.setBackground(white);
        r1c7.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r1c7,number);
        
        st.push(hm);
    }//GEN-LAST:event_r1c7ActionPerformed

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c1ActionPerformed
        // TODO add your handling code here:
         r2c1.setBackground(white);
        r2c1.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r2c1,number);
        
        st.push(hm);
    }//GEN-LAST:event_r2c1ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        // TODO add your handling code here:
          r2c3.setBackground(white);
        r2c3.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r2c3,number);
        
        st.push(hm);
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c5ActionPerformed
        // TODO add your handling code here:
          r2c5.setBackground(white);
        r2c5.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r2c5,number);
        
        st.push(hm);
    }//GEN-LAST:event_r2c5ActionPerformed

    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c6ActionPerformed
        // TODO add your handling code here:
          r2c6.setBackground(white);
        r2c6.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r2c6,number);
        
        st.push(hm);
    }//GEN-LAST:event_r2c6ActionPerformed

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c8ActionPerformed
        // TODO add your handling code here:
          r2c8.setBackground(white);
        r2c8.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r2c8,number);
        
        st.push(hm);
    }//GEN-LAST:event_r2c8ActionPerformed

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c1ActionPerformed
        // TODO add your handling code here:
          r3c1.setBackground(white);
        r3c1.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r3c1,number);
        
        st.push(hm);
    }//GEN-LAST:event_r3c1ActionPerformed

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c2ActionPerformed
        // TODO add your handling code here:
          r3c2.setBackground(white);
        r3c2.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r3c2,number);
        
        st.push(hm);
        
    }//GEN-LAST:event_r3c2ActionPerformed

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c8ActionPerformed
        // TODO add your handling code here:
          r3c8.setBackground(white);
        r3c8.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r3c8,number);
        
        st.push(hm);
    }//GEN-LAST:event_r3c8ActionPerformed

    private void r4c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c0ActionPerformed
        // TODO add your handling code here:
          r4c0.setBackground(white);
        r4c0.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r4c0,number);
        
        st.push(hm);
    }//GEN-LAST:event_r4c0ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        // TODO add your handling code here:
         r4c3.setBackground(white);
        r4c3.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r4c3,number);
        
        st.push(hm);
    }//GEN-LAST:event_r4c3ActionPerformed

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c8ActionPerformed
        // TODO add your handling code here:
         r4c8.setBackground(white);
        r4c8.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r4c8,number);
        
        st.push(hm);
    }//GEN-LAST:event_r4c8ActionPerformed

    private void r5c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c0ActionPerformed
        // TODO add your handling code here:
         r5c0.setBackground(white);
        r5c0.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r5c0,number);
        
        st.push(hm);
    }//GEN-LAST:event_r5c0ActionPerformed

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c2ActionPerformed
        // TODO add your handling code here:
         r5c2.setBackground(white);
        r5c2.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r5c2,number);
        
        st.push(hm);
    }//GEN-LAST:event_r5c2ActionPerformed

    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c5ActionPerformed
        // TODO add your handling code here:
         r5c5.setBackground(white);
        r5c5.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r5c5,number);
        
        st.push(hm);
    }//GEN-LAST:event_r5c5ActionPerformed

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c6ActionPerformed
        // TODO add your handling code here:
         r5c6.setBackground(white);
        r5c6.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r5c6,number);
        
        st.push(hm);
    }//GEN-LAST:event_r5c6ActionPerformed

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c7ActionPerformed
        // TODO add your handling code here:
         r5c7.setBackground(white);
        r5c7.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r5c7,number);
        
        st.push(hm);
    }//GEN-LAST:event_r5c7ActionPerformed

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c8ActionPerformed
        // TODO add your handling code here:
         r5c8.setBackground(white);
        r5c8.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r5c8,number);
        
        st.push(hm);
    }//GEN-LAST:event_r5c8ActionPerformed

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c2ActionPerformed
        // TODO add your handling code here:
         r6c2.setBackground(white);
        r6c2.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r6c2,number);
        
        st.push(hm);
    }//GEN-LAST:event_r6c2ActionPerformed

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c5ActionPerformed
        // TODO add your handling code here:
         r6c5.setBackground(white);
        r6c5.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r6c5,number);
        
        st.push(hm);
    }//GEN-LAST:event_r6c5ActionPerformed

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c7ActionPerformed
        // TODO add your handling code here:
         r6c7.setBackground(white);
        r6c7.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r6c7,number);
        
        st.push(hm);
    }//GEN-LAST:event_r6c7ActionPerformed

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c1ActionPerformed
        // TODO add your handling code here:
         r7c1.setBackground(white);
        r7c1.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r7c1,number);
        
        st.push(hm);
    }//GEN-LAST:event_r7c1ActionPerformed

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c2ActionPerformed
        // TODO add your handling code here:
         r7c2.setBackground(white);
        r7c2.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r7c2,number);
        
        st.push(hm);
    }//GEN-LAST:event_r7c2ActionPerformed

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c5ActionPerformed
        // TODO add your handling code here:
         r7c5.setBackground(white);
        r7c5.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r7c5,number);
        
        st.push(hm);
    }//GEN-LAST:event_r7c5ActionPerformed

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c6ActionPerformed
        // TODO add your handling code here:
         r7c6.setBackground(white);
        r7c6.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r7c6,number);
        
        st.push(hm);
    }//GEN-LAST:event_r7c6ActionPerformed

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c7ActionPerformed
        // TODO add your handling code here:
         r7c7.setBackground(white);
        r7c7.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r7c7,number);
        
        st.push(hm);
    }//GEN-LAST:event_r7c7ActionPerformed

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c3ActionPerformed
        // TODO add your handling code here:
         r8c3.setBackground(white);
        r8c3.setText(number);
        
        HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r8c3,number);
        
        st.push(hm);
    }//GEN-LAST:event_r8c3ActionPerformed

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c4ActionPerformed
        // TODO add your handling code here:
          r8c4.setBackground(white);
        r8c4.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r8c4,number);
        
        st.push(hm);
    }//GEN-LAST:event_r8c4ActionPerformed

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c6ActionPerformed
        // TODO add your handling code here:
          r8c6.setBackground(white);
        r8c6.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r8c6,number);
        
        st.push(hm);
    }//GEN-LAST:event_r8c6ActionPerformed

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c7ActionPerformed
        // TODO add your handling code here:
          r8c7.setBackground(white);
        r8c7.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r8c7,number);
        
        st.push(hm);
    }//GEN-LAST:event_r8c7ActionPerformed

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c8ActionPerformed
        // TODO add your handling code here:
          r8c8.setBackground(white);
        r8c8.setText(number);
        
         HashMap<JButton,String> hm =new HashMap<JButton,String>();
        hm.put(r8c8,number);
        
        st.push(hm);
    }//GEN-LAST:event_r8c8ActionPerformed

    private void r0c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
        
    }//GEN-LAST:event_r0c7ActionPerformed

    private void r0c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r0c8ActionPerformed

    private void r1c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c0ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r1c0ActionPerformed

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r1c4ActionPerformed

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r1c5ActionPerformed

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r1c6ActionPerformed

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r1c8ActionPerformed

    private void r2c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c0ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r2c0ActionPerformed

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r2c2ActionPerformed

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r2c7ActionPerformed

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r3c4ActionPerformed

    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r3c5ActionPerformed

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r3c7ActionPerformed

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r4c1ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r4c6ActionPerformed

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r4c7ActionPerformed

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r5c1ActionPerformed

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r5c3ActionPerformed

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r6c1ActionPerformed

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r6c4ActionPerformed

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r6c8ActionPerformed

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r7c3ActionPerformed

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
        
    }//GEN-LAST:event_r7c4ActionPerformed

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r7c8ActionPerformed

    private void r8c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c0ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r8c0ActionPerformed

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r8c2ActionPerformed

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already been allocated","Sudoku Game",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_r8c5ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
          if(JOptionPane.showConfirmDialog(this,"Confirm if you want to Exit", "Sudoku Game", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
          }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void solutionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionbtnActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionbtnActionPerformed

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        // TODO add your handling code here:
         checkMover();
    }//GEN-LAST:event_checkbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        ResetGame();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void undobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undobtnActionPerformed
        // TODO add your handling code here:
        Undo();
    }//GEN-LAST:event_undobtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUDOKU_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton r0c0;
    private javax.swing.JButton r0c1;
    private javax.swing.JButton r0c2;
    private javax.swing.JButton r0c3;
    private javax.swing.JButton r0c4;
    private javax.swing.JButton r0c5;
    private javax.swing.JButton r0c6;
    private javax.swing.JButton r0c7;
    private javax.swing.JButton r0c8;
    private javax.swing.JButton r1c0;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r2c0;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r3c0;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r4c0;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r5c0;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r6c0;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r7c0;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r8c0;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton slectionbtn1;
    private javax.swing.JButton slectionbtn2;
    private javax.swing.JButton slectionbtn3;
    private javax.swing.JButton slectionbtn4;
    private javax.swing.JButton slectionbtn5;
    private javax.swing.JButton slectionbtn6;
    private javax.swing.JButton slectionbtn7;
    private javax.swing.JButton slectionbtn8;
    private javax.swing.JButton slectionbtn9;
    private javax.swing.JButton solutionbtn;
    private javax.swing.JButton undobtn;
    // End of variables declaration//GEN-END:variables

    private void AssignTurn(JButton slectionbtn1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
