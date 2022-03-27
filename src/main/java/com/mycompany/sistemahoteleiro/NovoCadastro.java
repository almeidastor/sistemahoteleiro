package com.mycompany.sistemahoteleiro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stor
 */
public class NovoCadastro extends javax.swing.JFrame {

    /**
     * Creates new form NovoCadastro
     */
    public NovoCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(741, 600);
        this.setResizable(false);
        this.setTitle("Sistema Hoteleiro");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCheckin = new javax.swing.JPanel();
        lblEntrada = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        btnCalendario3 = new javax.swing.JButton();
        btnBusca1 = new javax.swing.JButton();
        lblResponsavel = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        btnBuscaResp = new javax.swing.JButton();
        lblGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        btnBuscaGrup = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblOrientador = new javax.swing.JLabel();
        cmbOrientador = new javax.swing.JTextField();
        lblNPessoas = new javax.swing.JLabel();
        txtNPessoas = new javax.swing.JTextField();
        lblNQuartos = new javax.swing.JLabel();
        txtNQuartos = new javax.swing.JTextField();
        pNormal = new javax.swing.JPanel();
        cmbNormal = new javax.swing.JComboBox<>();
        pVegetariana = new javax.swing.JPanel();
        cmbVegetariana = new javax.swing.JComboBox<>();
        pDiversos = new javax.swing.JPanel();
        cmbDiversos = new javax.swing.JComboBox<>();
        pInternos = new javax.swing.JPanel();
        cmbInternos = new javax.swing.JComboBox<>();
        pObservacoes = new javax.swing.JPanel();
        txtObservacoes = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pCheckout = new javax.swing.JPanel();
        lblSaida = new javax.swing.JLabel();
        txtSaida = new javax.swing.JTextField();
        lblPagamento = new javax.swing.JLabel();
        cbVista = new javax.swing.JCheckBox();
        cbTransferencia = new javax.swing.JCheckBox();
        cbCheque = new javax.swing.JCheckBox();
        cbCredito = new javax.swing.JCheckBox();
        cbReserva = new javax.swing.JCheckBox();
        btnCalendario4 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(741, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(741, 600));

        pCheckin.setBackground(new java.awt.Color(255, 255, 255));
        pCheckin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pCheckin.setMinimumSize(new java.awt.Dimension(310, 44));
        pCheckin.setName(""); // NOI18N
        pCheckin.setPreferredSize(new java.awt.Dimension(310, 45));
        pCheckin.setLayout(null);

        lblEntrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEntrada.setText("Data de Entrada:");
        lblEntrada.setAlignmentY(0.0F);
        pCheckin.add(lblEntrada);
        lblEntrada.setBounds(5, 10, 94, 27);

        txtEntrada.setAlignmentX(0.0F);
        txtEntrada.setAlignmentY(0.0F);
        txtEntrada.setAutoscrolls(false);
        pCheckin.add(txtEntrada);
        txtEntrada.setBounds(105, 10, 120, 26);

        btnCalendario3.setText("📅");
        btnCalendario3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        btnCalendario3.setBorderPainted(false);
        pCheckin.add(btnCalendario3);
        btnCalendario3.setBounds(228, 10, 27, 27);

        btnBusca1.setText("🔎");
        btnBusca1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusca1.setBorderPainted(false);
        btnBusca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusca1ActionPerformed(evt);
            }
        });
        pCheckin.add(btnBusca1);
        btnBusca1.setBounds(263, 10, 43, 27);

        lblResponsavel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResponsavel.setText("Responsável:");
        lblResponsavel.setAlignmentY(0.0F);

        txtResponsavel.setAlignmentX(0.0F);
        txtResponsavel.setAlignmentY(0.0F);
        txtResponsavel.setAutoscrolls(false);

        btnBuscaResp.setText("🔎");
        btnBuscaResp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscaResp.setBorderPainted(false);
        btnBuscaResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaRespActionPerformed(evt);
            }
        });

        lblGrupo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGrupo.setText("<html><body>Identificação do</br> Grupo:</body></html>");
        lblGrupo.setAlignmentY(0.0F);

        txtGrupo.setAlignmentX(0.0F);
        txtGrupo.setAlignmentY(0.0F);
        txtGrupo.setAutoscrolls(false);

        btnBuscaGrup.setText("🔎");
        btnBuscaGrup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscaGrup.setBorderPainted(false);
        btnBuscaGrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaGrupActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("Telefone:");
        lblTelefone.setAlignmentY(0.0F);

        txtTelefone.setAlignmentX(0.0F);
        txtTelefone.setAlignmentY(0.0F);
        txtTelefone.setAutoscrolls(false);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("E-mail:");
        lblEmail.setAlignmentY(0.0F);

        txtEmail.setAlignmentX(0.0F);
        txtEmail.setAlignmentY(0.0F);
        txtEmail.setAutoscrolls(false);

        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCategoria.setText("Categoria:");
        lblCategoria.setAlignmentY(0.0F);

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblOrientador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrientador.setText("<html><body>Orientador/</br> Conferencista:</body></html>");
        lblOrientador.setAlignmentY(0.0F);

        cmbOrientador.setAlignmentX(0.0F);
        cmbOrientador.setAlignmentY(0.0F);
        cmbOrientador.setAutoscrolls(false);

        lblNPessoas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNPessoas.setText("Nº de Pessoas:");
        lblNPessoas.setAlignmentY(0.0F);

        txtNPessoas.setAlignmentX(0.0F);
        txtNPessoas.setAlignmentY(0.0F);
        txtNPessoas.setAutoscrolls(false);

        lblNQuartos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNQuartos.setText("Nº de Quartos:");
        lblNQuartos.setAlignmentY(0.0F);

        txtNQuartos.setAlignmentX(0.0F);
        txtNQuartos.setAlignmentY(0.0F);
        txtNQuartos.setAutoscrolls(false);

        pNormal.setBackground(new java.awt.Color(255, 255, 255));
        pNormal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diária Integral Normal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pNormal.setToolTipText("");
        pNormal.setMinimumSize(new java.awt.Dimension(310, 44));
        pNormal.setName(""); // NOI18N
        pNormal.setPreferredSize(new java.awt.Dimension(310, 45));
        pNormal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                none(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pNormal.setLayout(null);

        cmbNormal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pNormal.add(cmbNormal);
        cmbNormal.setBounds(10, 18, 320, 27);

        pVegetariana.setBackground(new java.awt.Color(255, 255, 255));
        pVegetariana.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diária Integral Vegetariana", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pVegetariana.setToolTipText("");
        pVegetariana.setMinimumSize(new java.awt.Dimension(310, 44));
        pVegetariana.setName(""); // NOI18N
        pVegetariana.setPreferredSize(new java.awt.Dimension(310, 45));
        pVegetariana.setLayout(null);

        cmbVegetariana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pVegetariana.add(cmbVegetariana);
        cmbVegetariana.setBounds(10, 18, 320, 27);

        pDiversos.setBackground(new java.awt.Color(255, 255, 255));
        pDiversos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encontros Diversos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pDiversos.setToolTipText("");
        pDiversos.setMinimumSize(new java.awt.Dimension(310, 44));
        pDiversos.setName(""); // NOI18N
        pDiversos.setPreferredSize(new java.awt.Dimension(310, 45));
        pDiversos.setLayout(null);

        cmbDiversos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pDiversos.add(cmbDiversos);
        cmbDiversos.setBounds(10, 18, 320, 27);

        pInternos.setBackground(new java.awt.Color(255, 255, 255));
        pInternos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encontros Internos com", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pInternos.setToolTipText("");
        pInternos.setMinimumSize(new java.awt.Dimension(310, 44));
        pInternos.setName(""); // NOI18N
        pInternos.setPreferredSize(new java.awt.Dimension(310, 45));
        pInternos.setLayout(null);

        cmbInternos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pInternos.add(cmbInternos);
        cmbInternos.setBounds(10, 18, 320, 27);

        pObservacoes.setBackground(new java.awt.Color(255, 255, 255));
        pObservacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pObservacoes.setToolTipText("");
        pObservacoes.setMinimumSize(new java.awt.Dimension(310, 44));
        pObservacoes.setName(""); // NOI18N
        pObservacoes.setPreferredSize(new java.awt.Dimension(310, 45));
        pObservacoes.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        txtObservacoes.setViewportView(jTextArea1);

        pObservacoes.add(txtObservacoes);
        txtObservacoes.setBounds(10, 20, 660, 50);

        pCheckout.setBackground(new java.awt.Color(255, 255, 255));
        pCheckout.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saída", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pCheckout.setToolTipText("");
        pCheckout.setMinimumSize(new java.awt.Dimension(310, 44));
        pCheckout.setName(""); // NOI18N
        pCheckout.setPreferredSize(new java.awt.Dimension(310, 45));
        pCheckout.setLayout(null);

        lblSaida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSaida.setText("Data de Saída:");
        lblSaida.setAlignmentY(0.0F);
        pCheckout.add(lblSaida);
        lblSaida.setBounds(9, 17, 90, 27);

        txtSaida.setAlignmentX(0.0F);
        txtSaida.setAlignmentY(0.0F);
        txtSaida.setAutoscrolls(false);
        pCheckout.add(txtSaida);
        txtSaida.setBounds(100, 17, 120, 27);

        lblPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPagamento.setText("Pagamento:");
        lblPagamento.setAlignmentY(0.0F);
        pCheckout.add(lblPagamento);
        lblPagamento.setBounds(289, 17, 90, 27);

        cbVista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbVista.setText("Vista");
        cbVista.setOpaque(false);
        cbVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVistaActionPerformed(evt);
            }
        });
        pCheckout.add(cbVista);
        cbVista.setBounds(398, 17, 60, 27);

        cbTransferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbTransferencia.setText("Transferência");
        cbTransferencia.setOpaque(false);
        cbTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransferenciaActionPerformed(evt);
            }
        });
        pCheckout.add(cbTransferencia);
        cbTransferencia.setBounds(479, 17, 110, 27);

        cbCheque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbCheque.setText("Cheque");
        cbCheque.setOpaque(false);
        cbCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChequeActionPerformed(evt);
            }
        });
        pCheckout.add(cbCheque);
        cbCheque.setBounds(398, 47, 70, 27);

        cbCredito.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbCredito.setText("Crédito");
        cbCredito.setOpaque(false);
        cbCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCreditoActionPerformed(evt);
            }
        });
        pCheckout.add(cbCredito);
        cbCredito.setBounds(479, 47, 110, 27);

        cbReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbReserva.setText("Reserva 50%");
        cbReserva.setOpaque(false);
        cbReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReservaActionPerformed(evt);
            }
        });
        pCheckout.add(cbReserva);
        cbReserva.setBounds(398, 84, 120, 27);

        btnCalendario4.setText("📅");
        btnCalendario4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalendario4.setBorderPainted(false);
        pCheckout.add(btnCalendario4);
        btnCalendario4.setBounds(227, 17, 27, 27);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Excluir");

        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviar.setText("Enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(btnBuscaResp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtNPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btnBuscaGrup, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pVegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pDiversos, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pInternos, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBackground)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscaResp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(pNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(cmbOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnBuscaGrup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pVegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(pDiversos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(pInternos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void cbVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVistaActionPerformed

    private void cbTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTransferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTransferenciaActionPerformed

    private void cbChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChequeActionPerformed

    private void cbCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCreditoActionPerformed

    private void cbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbReservaActionPerformed

    private void btnBusca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusca1ActionPerformed

    private void btnBuscaGrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaGrupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaGrupActionPerformed

    private void btnBuscaRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaRespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaRespActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(NovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBusca1;
    private javax.swing.JButton btnBuscaGrup;
    private javax.swing.JButton btnBuscaResp;
    private javax.swing.JButton btnCalendario3;
    private javax.swing.JButton btnCalendario4;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox cbCheque;
    private javax.swing.JCheckBox cbCredito;
    private javax.swing.JCheckBox cbReserva;
    private javax.swing.JCheckBox cbTransferencia;
    private javax.swing.JCheckBox cbVista;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbDiversos;
    private javax.swing.JComboBox<String> cmbInternos;
    private javax.swing.JComboBox<String> cmbNormal;
    private javax.swing.JTextField cmbOrientador;
    private javax.swing.JComboBox<String> cmbVegetariana;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNPessoas;
    private javax.swing.JLabel lblNQuartos;
    private javax.swing.JLabel lblOrientador;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pCheckin;
    private javax.swing.JPanel pCheckout;
    private javax.swing.JPanel pDiversos;
    private javax.swing.JPanel pInternos;
    private javax.swing.JPanel pNormal;
    private javax.swing.JPanel pObservacoes;
    private javax.swing.JPanel pVegetariana;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNPessoas;
    private javax.swing.JTextField txtNQuartos;
    private javax.swing.JScrollPane txtObservacoes;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtSaida;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}