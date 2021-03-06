import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Simulador extends javax.swing.JFrame {

    /**
     * Creates new form Simulador
     */
    private int sizeMemory;
    private int sizeCacheL1;
    private int sizeCacheL2;
    private int sizeCacheL3;
    private ArrayList < Clock > ciclos;

    private int clockCiclos;


    public Simulador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar4 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        loadL1 = new javax.swing.JProgressBar();
        loadMemory = new javax.swing.JProgressBar();
        loadL2 = new javax.swing.JProgressBar();
        loadL3 = new javax.swing.JProgressBar();
        lblSizeMemory = new javax.swing.JLabel();
        lblSizeL1 = new javax.swing.JLabel();
        lblSizeL2 = new javax.swing.JLabel();
        lblSizeL3 = new javax.swing.JLabel();
        txtSizeMemory = new javax.swing.JTextField();
        txtSizeL1 = new javax.swing.JTextField();
        txtSizeL2 = new javax.swing.JTextField();
        txtSizeL3 = new javax.swing.JTextField();
        lblkb = new javax.swing.JLabel();
        lblkb2 = new javax.swing.JLabel();
        lblkb3 = new javax.swing.JLabel();
        lblkb4 = new javax.swing.JLabel();
        btnFIFO = new javax.swing.JRadioButton();
        btnSJF = new javax.swing.JRadioButton();
        btnFirstFit = new javax.swing.JRadioButton();
        btnBestFit = new javax.swing.JRadioButton();
        btnWorstFit = new javax.swing.JRadioButton();
        play = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        dir = new javax.swing.JButton();
        esq = new javax.swing.JButton();
        lblMemory = new javax.swing.JLabel();
        lblL1 = new javax.swing.JLabel();
        lblL2 = new javax.swing.JLabel();
        lblL3 = new javax.swing.JLabel();
        lblEnterFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS Simulator");
        setResizable(false);

        loadL1.setEnabled(false);

        loadMemory.setEnabled(true);
        loadMemory.setStringPainted(true);
        loadMemory.setMinimum(0);


        loadL2.setEnabled(false);

        loadL3.setEnabled(false);

        lblSizeMemory.setText("Size Memory:");

        lblSizeL1.setText("Size Cache L1:");
        lblSizeL1.setEnabled(false);

        lblSizeL2.setText("Size Cache L2:");
        lblSizeL2.setEnabled(false);

        lblSizeL3.setText("Size Cache L3:");
        lblSizeL3.setEnabled(false);

        lblkb.setText("Kb");

        lblkb2.setText("Kb");
        lblkb2.setEnabled(false);

        lblkb3.setText("Kb");
        lblkb3.setEnabled(false);

        lblkb4.setText("Kb");
        lblkb4.setEnabled(false);

        buttonGroup1.add(btnFIFO);
        btnFIFO.setText("FIFO");

        buttonGroup1.add(btnSJF);
        btnSJF.setText("SJF");

        buttonGroup2.add(btnFirstFit);
        btnFirstFit.setText("FirstFit");

        buttonGroup2.add(btnBestFit);
        btnBestFit.setText("BestFit");

        buttonGroup2.add(btnWorstFit);
        btnWorstFit.setText("WorstFit");

        play.setText("Play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.setEnabled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        dir.setText("->");
        dir.setEnabled(false);
        dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirActionPerformed(evt);
            }
        });

        esq.setText("<-");
        esq.setEnabled(false);
        esq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqActionPerformed(evt);
            }
        });

        lblMemory.setText("Memory");
        lblMemory.setEnabled(false);

        lblL1.setText("L1 ->");
        lblL1.setEnabled(false);

        lblL2.setText("L2 ->");
        lblL2.setEnabled(false);

        lblL3.setText("L3 ->");
        lblL3.setEnabled(false);

        lblEnterFile.setText("Enter File:");
        txtSizeL1.setEnabled(false);
        txtSizeL2.setEnabled(false);
        txtSizeL3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSizeMemory)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSizeMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSizeL1)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtSizeL1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSizeL2)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtSizeL2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSizeL3)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtSizeL3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnFIFO)
                                                .addGap(6, 6, 6)
                                                .addComponent(btnSJF)))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblkb)
                                            .addComponent(lblkb2)
                                            .addComponent(lblkb3)
                                            .addComponent(lblkb4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(play)
                                        .addGap(6, 6, 6)
                                        .addComponent(exit))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEnterFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMemory)
                                    .addComponent(lblL1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblL2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblL3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loadMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loadL1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loadL2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loadL3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(esq)
                                .addGap(6, 6, 6)
                                .addComponent(dir)
                                .addGap(6, 6, 6)
                                .addComponent(back))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFirstFit)
                        .addGap(6, 6, 6)
                        .addComponent(btnBestFit)
                        .addGap(6, 6, 6)
                        .addComponent(btnWorstFit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblMemory)
                                .addGap(30, 30, 30)
                                .addComponent(lblL1)
                                .addGap(32, 32, 32)
                                .addComponent(lblL2)
                                .addGap(32, 32, 32)
                                .addComponent(lblL3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(loadL1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(loadL2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(loadL3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEnterFile)
                                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dir)
                                .addComponent(esq))
                            .addComponent(back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblSizeMemory))
                                    .addComponent(txtSizeMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblSizeL1))
                                    .addComponent(txtSizeL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblSizeL2))
                                    .addComponent(txtSizeL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblSizeL3))
                                    .addComponent(txtSizeL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFIFO)
                                    .addComponent(btnSJF)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblkb)
                                .addGap(23, 23, 23)
                                .addComponent(lblkb2)
                                .addGap(23, 23, 23)
                                .addComponent(lblkb3)
                                .addGap(23, 23, 23)
                                .addComponent(lblkb4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFirstFit)
                            .addComponent(btnBestFit)
                            .addComponent(btnWorstFit))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(play)
                    .addComponent(exit)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        ListProcess listProcess = new ListP ();
        ListProcess listReady;
        ciclos = new ArrayList < Clock > ();
        int flag = 0;
        int clock = 0;
        File file = new File (txtFile.getText());
	      if (file.exists())
        {
            try
            {
		            FileReader arq = new FileReader(txtFile.getText());
		            BufferedReader readArq = new BufferedReader(arq);
		            String row = new String ();
		            row = readArq.readLine();
		            String [] numElementos = new String [1];
		            numElementos = row.split(" ");
		            for (int i = 0; i < Integer.parseInt(numElementos[0]); i++)
		            {
                    String row2 = new String ();
                    row2 = readArq.readLine();
                    String [] s = new String [4];
                    s = row2.split(" ");
                    Process aux = new Process (Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                    listProcess.addProcess(aux);
		            }

		            arq.close();
                dir.setEnabled(true);
                esq.setEnabled(true);
//FIRSTFIT
              if (btnFirstFit.isSelected())
              {
                if (txtSizeMemory.getText() != null)
                {
                  MemoryFirstFit memo = new MemoryFirstFit(Integer.parseInt(txtSizeMemory.getText()));
                  loadMemory.setMaximum (memo.size());
                    flag = 0;
                    clock = 0;
                    if (btnFIFO.isSelected())
                    {
                      listReady = new ListReadyFIFO();
                      Process process = new Process();
                      int erro;
                      while (memo.testMemoryNull() || listProcess.test(memo.size()) || listReady.test(memo.size()))
                      {
			
                        for (int i = 0; i < listProcess.size(); i++)
                        {
                          if (listProcess.getProcess(i).getClock() <= clock)
                          {
                            memo.memoryManager(listProcess.getProcess(i));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          if (listProcess.testProcess(memo.get(j)))
                          {
                            listProcess.remove(memo.get(j));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          listReady.addProcess(memo.get(j));
                        }

                        if (listReady.size() > 0)
                        {
                          listReady.sortReady();
                          process = listReady.exec();
                          if (process.getPid() != 0)
                          {
                            memo.exec(process.getPid(), process.getTime());
                          }
                        }
                        clock++;
                        Clock c = new Clock(memo.porcent());
                        ciclos.add(c);
                      }
                    }
                    else if (btnSJF.isSelected())
                    {
                      listReady = new ListReadySJF();
                      Process process = new Process();
                      int erro;
                      while (memo.testMemoryNull() || listProcess.test(memo.size()) || listReady.test(memo.size()))
                      {
                        for (int i = 0; i < listProcess.size(); i++)
                        {
                          if (listProcess.getProcess(i).getClock() <= clock)
                          {
                            memo.memoryManager(listProcess.getProcess(i));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          if (listProcess.testProcess(memo.get(j)))
                          {
                            listProcess.remove(memo.get(j));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          listReady.addProcess(memo.get(j));
                        }

                        if (listReady.size() > 0)
                        {
                          listReady.sortReady();
                          process = listReady.exec();
                          if (process.getPid() != 0)
                          {
                            memo.exec(process.getPid(), process.getTime());
                          }
                        }
                        clock++;
                        Clock c = new Clock(memo.porcent());
                        ciclos.add(c);
                      }

                    }
                    else
                    {
                      JOptionPane.showMessageDialog(this, "faltou o tipo de escalonador");
                    }
                }
                else
                {
                  JOptionPane.showMessageDialog(this, "faltou o tamanho da memoria");
                }
              }
//FIRSTFIT
//BESTFIT
              else if (btnBestFit.isSelected())
              {
                if (txtSizeMemory.getText() != null)
                {
                  MemoryBestFit memo = new MemoryBestFit(Integer.parseInt(txtSizeMemory.getText()));
                  loadMemory.setMaximum (memo.size());
                    flag = 0;
                    clock = 0;
                    if (btnFIFO.isSelected())
                    {
                      listReady = new ListReadyFIFO();
                      Process process = new Process();
                      int erro;
                      while (memo.testMemoryNull() || listProcess.test(memo.size()) || listReady.test(memo.size()))
                      {
                        for (int i = 0; i < listProcess.size(); i++)
                        {
                          if (listProcess.getProcess(i).getClock() <= clock)
                          {
                            memo.memoryManager(listProcess.getProcess(i));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          if (listProcess.testProcess(memo.get(j)))
                          {
                            listProcess.remove(memo.get(j));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          listReady.addProcess(memo.get(j));
                        }

                        if (listReady.size() > 0)
                        {
                          listReady.sortReady();
                          process = listReady.exec();
                          if (process.getPid() != 0)
                          {
                            memo.exec(process.getPid(), process.getTime());
                          }
                        }
                        clock++;
                        Clock c = new Clock(memo.porcent());
                        ciclos.add(c);
                      }
                    }
                    else if (btnSJF.isSelected())
                    {
                      listReady = new ListReadySJF();
                      Process process = new Process();
                      int erro;
                      while (memo.testMemoryNull() || listProcess.test(memo.size()) || listReady.test(memo.size()))
                      {
                        for (int i = 0; i < listProcess.size(); i++)
                        {
                          if (listProcess.getProcess(i).getClock() <= clock)
                          {
                            memo.memoryManager(listProcess.getProcess(i));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          if (listProcess.testProcess(memo.get(j)))
                          {
                            listProcess.remove(memo.get(j));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          listReady.addProcess(memo.get(j));
                        }

                        if (listReady.size() > 0)
                        {
                          listReady.sortReady();
                          process = listReady.exec();
                          if (process.getPid() != 0)
                          {
                            memo.exec(process.getPid(), process.getTime());
                          }
                        }
                        clock++;
                        Clock c = new Clock(memo.porcent());
                        ciclos.add(c);
                      }

                    }
                    else
                    {
                      JOptionPane.showMessageDialog(this, "faltou o tipo de escalonador");
                    }
                }
                else
                {
                  JOptionPane.showMessageDialog(this, "faltou o tamanho da memoria");
                }
              }
//BESTFIT
//WORSTFIT
              else if (btnWorstFit.isSelected())
              {
                if (txtSizeMemory.getText() != null)
                {
                  MemoryWorstFit memo = new MemoryWorstFit(Integer.parseInt(txtSizeMemory.getText()));
                  loadMemory.setMaximum (memo.size());
                    flag = 0;
                    clock = 0;
                    if (btnFIFO.isSelected())
                    {
                      listReady = new ListReadyFIFO();
                      Process process = new Process();
                      int erro;
                      while (memo.testMemoryNull() || listProcess.test(memo.size()) || listReady.test(memo.size()))
                      {
                        for (int i = 0; i < listProcess.size(); i++)
                        {
                          if (listProcess.getProcess(i).getClock() <= clock)
                          {
                            memo.memoryManager(listProcess.getProcess(i));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          if (listProcess.testProcess(memo.get(j)))
                          {
                            listProcess.remove(memo.get(j));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          listReady.addProcess(memo.get(j));
                        }

                        if (listReady.size() > 0)
                        {
                          listReady.sortReady();
                          process = listReady.exec();
                          if (process.getPid() != 0)
                          {
                            memo.exec(process.getPid(), process.getTime());
                          }
                        }
                        clock++;
                        Clock c = new Clock(memo.porcent());
                        ciclos.add(c);
                      }
                    }
                    else if (btnSJF.isSelected())
                    {
                      listReady = new ListReadySJF();
                      Process process = new Process();
                      int erro;
                      while (memo.testMemoryNull() || listProcess.test(memo.size()) || listReady.test(memo.size()))
                      {
                        for (int i = 0; i < listProcess.size(); i++)
                        {
                          if (listProcess.getProcess(i).getClock() <= clock)
                          {
                            memo.memoryManager(listProcess.getProcess(i));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          if (listProcess.testProcess(memo.get(j)))
                          {
                            listProcess.remove(memo.get(j));
                          }
                        }
                        for (int j = 0; j < memo.size(); j++)
                        {
                          listReady.addProcess(memo.get(j));
                        }

                        if (listReady.size() > 0)
                        {
                          listReady.sortReady();
                          process = listReady.exec();
                          if (process.getPid() != 0)
                          {
                            memo.exec(process.getPid(), process.getTime());
                          }
                        }
                        clock++;
                        Clock c = new Clock(memo.porcent());
                        ciclos.add(c);
                      }

                    }
                    else
                    {
                      JOptionPane.showMessageDialog(this, "faltou o tipo de escalonador");
                    }
                }
                else
                {
                  JOptionPane.showMessageDialog(this, "faltou o tamanho da memoria");
                }
              }
//WORSTFIT
              else
              {
                JOptionPane.showMessageDialog(this, "faltou o tipo de memoria");
              }
            }
            catch (IOException e)
            {
		System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            }
	}
        else
        {
            JOptionPane.showMessageDialog(this, "faltou o nome do arquivo");
        }
    }//GEN-LAST:event_playActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void esqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqActionPerformed
        // <-
        if (clockCiclos -1 >= 0)
        {
            clockCiclos--;
            loadMemory.setValue(ciclos.get(clockCiclos).get());
        }
    }//GEN-LAST:event_esqActionPerformed

    private void dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirActionPerformed
        // ->
        if (clockCiclos+1 < ciclos.size())
        {
            clockCiclos++;
            loadMemory.setValue(ciclos.get(clockCiclos).get());
        }
    }//GEN-LAST:event_dirActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // back
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JRadioButton btnBestFit;
    private javax.swing.JRadioButton btnFIFO;
    private javax.swing.JRadioButton btnFirstFit;
    private javax.swing.JRadioButton btnSJF;
    private javax.swing.JRadioButton btnWorstFit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton dir;
    private javax.swing.JButton esq;
    private javax.swing.JButton exit;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JLabel lblEnterFile;
    private javax.swing.JLabel lblL1;
    private javax.swing.JLabel lblL2;
    private javax.swing.JLabel lblL3;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblSizeL1;
    private javax.swing.JLabel lblSizeL2;
    private javax.swing.JLabel lblSizeL3;
    private javax.swing.JLabel lblSizeMemory;
    private javax.swing.JLabel lblkb;
    private javax.swing.JLabel lblkb2;
    private javax.swing.JLabel lblkb3;
    private javax.swing.JLabel lblkb4;
    private javax.swing.JProgressBar loadL1;
    private javax.swing.JProgressBar loadL2;
    private javax.swing.JProgressBar loadL3;
    private javax.swing.JProgressBar loadMemory;
    private javax.swing.JButton play;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtSizeL1;
    private javax.swing.JTextField txtSizeL2;
    private javax.swing.JTextField txtSizeL3;
    private javax.swing.JTextField txtSizeMemory;
    // End of variables declaration//GEN-END:variables
}
