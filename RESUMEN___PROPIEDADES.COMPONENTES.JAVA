==================
===   JFRAME   ===
==================

public void personalizar_JFrame() {
   this.setBounds(0, 0, 585, 565); // Pone el frame en una posición en la pantalla con un ancho y alto x,y,ancho,alto
   this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Pone en x el exit para cerrar toda la aplicación
   this.setFont(new java.awt.Font("Courier New", 0, 12)); // Cambia la fuente de letra, estilo y tamaño
   this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("mac.jpg"))); // Pone una imagen al frame
   this.setTitle("DESARROLLO DE INTERFACES"); // Pone un título al frame
   this.setLocationRelativeTo(null); // Centra la ventana en la pantalla
   this.setResizable(false); // Desactiva el redimencionamiento del JFrame
   this.getContentPane().setBackground(Color.DARK_GRAY); // 1. Cambia el color de fondo del JFrame
   this.getContentPane().setBackground(new Color(255,0,0)); // 2. Cambia el color de fondo del JFrame
    //this.setBackground(Color.yellow);// Esto no funciona
   this.toFront(); // Pone el frame al frente de todas las otras ventanas
   this.setSize(500, 500); // Cambia el ancho y alto del frame
}

==================
===   JLABEL   ===
==================

public void personalizar_JLabel() {
   lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
   lblTitulo.setFont(new java.awt.Font("Courier New", 0, 18));
   lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
   lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
   lblTitulo.setText("HOLA MUNDO");
   lblTitulo.setOpaque(true);
}

=====================
===   JCheckBox   ===
=====================

// VARIABLE DE INSTANCIA

List<JCheckBox> clubes_al = new ArrayList<JCheckBox>();

// METODO QUE LLAMAREMOS DESDE EL CONSTRUCTOR QUE LLENA EL ARRAYLIST CON TODOS LOS JCHECKBOX

public void llenarArrayListConTodosJCheckBox() {
   clubes_al.add(chk1);
   clubes_al.add(chk2);
   clubes_al.add(chk3);
}

// METODO QUE LLAMAREMOS DESDE EL CONSTRUCTOR QUE PONE UN NOMBRE A CADA UNO DE LOS JCHECKBOX

public void ponerNombreTodosJCheckBox() {
   chkAlbion.setName("Albion");
   chkArsenal.setName("Arsenal");
   chkBrighton.setName("Brighton");
   chkChelsea.setName("Chelse");
}

// METODO PARA EL JBUTTON QUE RECOJA LOS JCHECKBOX SELECCIONADOS PARA PONERLOS EN UN JLABEL

public void recogerLosJCheckBoxSeleccionados() {
        try {
            String a = "";
            for (int i = 0; i < clubes_al.size(); i++) {
                JCheckBox chk = clubes_al.get(i);
                if (chk.isSelected()) {
                    System.out.println(chk.getName());
                    a = a + chk.getName() + " - ";
                }
            }
            a = a.substring(0, a.length() - 3);
            lblTitulo.setText(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "SELECCIONE AL MENOS UN CHECKBOX", "ERROR", JOptionPane.ERROR_MESSAGE);
        }	
}

// METODO PARA EL JBUTTON QUE RESETEE TODOS LOS JCHECKBOX

public void resetearTodosJCheckBox() {
        for (int i = 0; i < clubes_al.size(); i++) {
            JCheckBox chk = clubes_al.get(i);
            chk.setSelected(false);
        }
        lblTitulo.setText("AQUI SE PONDRA LO QUE SELECCIONE");  
}

// METODO PARA EL JBUTTON QUE PONE LOS JCHECKBOX SELECCIONADOS EN UN JLIST

========================================================
DefaultListModel dlm = new DefaultListModel();
lstMostrar.setModel(dlm);

List<JCheckBox> clubes_al = new ArrayList<JCheckBox>();
clubes_al.add(chkAlbion);
clubes_al.add(chkArsenal);
clubes_al.add(chkBrighton);
clubes_al.add(chkChelsea);
=======================================================

public void ponerJCheckBoxSeleccionadosToJList() {
        for (int i = 0; i < clubes_al.size(); i++) {
            JCheckBox chk = clubes_al.get(i);
            if(chk.isSelected()) {
               dlm.addElement(chk.getName());
               System.out.println(chk.getName());
            }
        }
}
		
===================
===   JButton   ===
===================	

// VARIABLE DE INSTANCIA

EventoButton eb = new EventoButton();

// CONSTRUCTOR

cmdPlain.addActionListener(eb);

// METODO PARA EL CLIC EN EL JBUTTON

public void cmdPlainAccion() {
   Font f = new Font("Courier New", Font.PLAIN, 12);
   txaContenido.setFont(f);
}
		
// MANEJADOR DE EVENTOS PARA JBUTTON

private class EventoButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cmdPlain) {
                cmdPlainAccion();
            }
            if (e.getSource() == cmdBold) {
                cmdBoldAccion();
            }
            if (e.getSource() == cmdItalic) {
                cmdItalicAccion();
            }
            if (e.getSource() == cmdEnviar) {
                cmdEnviarAccion();
            }
        }
		
}

=====================
===   JComboBox   ===
=====================

// VARIABLE DE INSTANCIA

EventoComboBox ecb = new EventoComboBox();
	
// CONSTRUCTOR

cboCiudad.addItemListener(ecb);

// METODO QUE LLAMAREMOS DESDE EL CONSTRUCTOR QUE CARGA EL JCOMBOBOX

public void cargar_cboCiudad() {
   cboCiudad.addItem("Barcelona");
   cboCiudad.addItem("Bilbao");
   cboCiudad.addItem("Madrid");
   cboCiudad.addItem("Sevilla");
   cboCiudad.addItem("Valencia");
   cboCiudad.addItem("Zaragoza");
}
	
public void cargar_cboCiudad() {
   String ciudad[] = {"Barcelona", "Bilbao", "Madrid", "Sevilla", "Valencia", "Zaragoza"};
   for (String c : ciudad) {
       cboCiudad.addItem(c);
   }
}

// METODO PARA EL CAMBIO DE OPCION EN EL JCOMBOBOX

public void cboCiudadAccion() {
        String sCiudad = (String) cboCiudad.getSelectedItem();
        switch (sCiudad) {
            case "Madrid":
                lblSalida.setText("MADRID ES CAPITAL DEL REYNO DE ESPAÑA");
                break;
            case "Barcelona":
                lblSalida.setText("BARCELONA ES CAPITAL DE LA CA DE CATALUÑA");
                break;
            case "Sevilla":
                lblSalida.setText("SEVILLA ES CAPITAL DE LA CA DE ANDALUCIA");
                break;
            case "Bilbao":
                lblSalida.setText("BILBAO ES CAPITAL DE LA CA DEL PAIS VASCO");
                break;
            case "Zaragoza":
                lblSalida.setText("ZARAGOZA ES CAPITAL DE LA CA DE ARAGON");
                break;
            default:
                lblSalida.setText("NO TENGO INFORMACION");
        }
}

// MANEJADOR DE EVENTOS PARA JRADIOBUTTON

private class EventoComboBox implements ItemListener {
   @Override
   public void itemStateChanged(ItemEvent e) {
      if(e.getSource() == cboCiudad) {
         cboCiudadAccion();
      }
   }
}

// METODO PARA EL CLIC EN EL JBUTTON  QUE AÑADE UN ELEMENTO EN JCOMBOBOX

public void cmdAnadirAccion() {
   cboCiudad.addItem(txtEntradaSalida.getText());
   txtEntradaSalida.setText("");
}

// METODO PARA EL CLIC EN EL JBUTTON  QUE REMUEVE UN ELEMENTO EN JCOMBOBOX

public void cmdRemoverAccion() {
   cboCiudad.removeItem(txtEntradaSalida.getText());
   txtEntradaSalida.setText("");
}

// METODO PARA EL CLIC EN EL JBUTTON  QUE RECOGE TODOS LOS ELEMENTOS DEL JCOMBOBOX
	
public void cmdRecogerAccion() {
for (int i = 0; i < cboCiudad.getItemCount(); i++) {
    String ciudad = cboCiudad.getItemAt(i);
    System.out.println(ciudad);
}
	
==================
===   JLIST   ====
==================

    private void cmdInvertirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        dlm2.clear();
        String[] x = new String[dlm1.size()];
        for (int i = 0; i < dlm1.size(); i++) {
            x[i] = (String) dlm1.getElementAt(i);
        }
        invertir(x);
        for (int i = 0; i < x.length; i++) {
            dlm2.addElement(x[i]);
        }
    }  
	
    public void invertir(String[] x) {
        String aux = "";
        for (int i = 0, j = x.length - 1; i < x.length / 2; i++, j--) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }
    }
	
    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String x = txtElemento.getText();
        dlm1.addElement(x);
    } 
	
    public void llenar_lstClubs() {
        String[] club = {"Atletico de Madrid", "Bilbao", "Barcelona", "Sevilla", "Madrid", "Albacete", "Almeria", "Betis","Celta"};
        for (int i = 0; i < club.length; i++) {
            dlm.addElement(club[i]);
        }
    }
	
    private void cmdSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        int[] v = lstMascotas.getSelectedIndices();
        String s = "";
        for(int i=0; i<v.length; i++) {
            String elemente = (String)dlm.getElementAt(v[i]); //Gato
            s = s + elemente + " - ";
        }
        s = s.substring(0,s.length()-3);
        lblSalida.setText(s);
    } 

    private void cmdSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        dlm2.clear();
        String s = "";
        for (int i = 0; i < dlm1.size(); i++) {
            String x = (String) dlm1.getElementAt(i);
            char letra = x.toUpperCase().charAt(0);
            if (letra == 'A') {
                dlm2.addElement(x);
            }
        }
    } 	
	
    private void cmdOrdenarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        TreeSet<String> clubs_ts = new TreeSet<String>();
        for(int i=0; i<dlm.size(); i++) {
            String x = (String)dlm.getElementAt(i);
            clubs_ts.add(x);
        }
        dlm.clear();
        for(String s: clubs_ts) { //for each
            dlm.addElement(s);
        }
    }  
	
===================
===   JTABLE   ====
===================

// VARIABLES DE INSTANCIA DE LA VENTANA

 DefaultTableModel dtm = new DefaultTableModel(data, cabecera);
 
// METODOS QUE SE PONEN EN EL CONSTRUCTOR DE LA VENTANA

public void personalizar_JTable() {
        tblMostrar.setModel(dtm);

        tblMostrar.setShowGrid(false); // Muestra el grid con true y lo oculta con false
        tblMostrar.setShowHorizontalLines(false); // Muestra la línea horizontal del grid con true y lo oculta con false
        tblMostrar.setShowVerticalLines(true); // Muestra la línea vertical del grid con true y lo oculta con false	
		
		tblMostrar.getColumnModel().getColumn(0).setMinWidth(40); // Fija un ancho a la columna 0
        tblMostrar.getColumnModel().getColumn(0).setMaxWidth(40); // Fija un achivo a la columna 0
		
        tblMostrar.getColumnModel().getColumn(0).setResizable(true); // Permite redimensionar el ancho con un true y no con un false
		
        tblMostrar.setGridColor(Color.BLUE); // Cambia el color del grid
        tblMostrar.setRowHeight(20); // Cambia el alto de la fila
        tblMostrar.setFont(new java.awt.Font("Courier New", 0, 14)); // Cambia la fuente de letra, el estilo y el tamaño de letra
        tblMostrar.setBackground(Color.BLACK); // Cambia el color de fondo del table
        tblMostrar.setForeground(Color.WHITE); // Cambia el color de letra
        tblMostrar.setBorder(BorderFactory.createTitledBorder(""));
        tblMostrar.getTableHeader().setReorderingAllowed(true);
        tblMostrar.setColumnSelectionInterval(1, 2);

        tblMostrar.setSelectionForeground(Color.red); // Cambia de color de letra que se selecciona
        tblMostrar.setSelectionBackground(Color.lightGray); // Cambia de color el fonde de lo que se selecciona

        tblMostrar.setRowSelectionAllowed(true); // Permite la selección de fila
        tblMostrar.setColumnSelectionAllowed(true); // Permite la seleccion de columna
		
		tblMostrar.getTableHeader().setOpaque(false); // Nose
		
		tblMostrar.getTableHeader().setBackground(Color.BLACK); // Cambia el color de fondo de la cabecera
		tblMostrar.getTableHeader().setForeground(Color.WHITE); // Cambia el color de letra de la cabecera
		tblMostrar.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
		tblMostrar.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232))); // Cambia de color el border de la cabecera
}

// METODOS PARA LOS EVENTOS 

    public void limpiarTable() {
        int numeroFilas = dtm.getRowCount();
        for (int j = 0; j < numeroFilas; j++) {
            dtm.removeRow(0);
        }
        repaint();
    }
	
    public void cargarDatosTable() {
        String nra = "src/ejemplo018/obrero.csv";
        List<Obrero> obreros_al = Controlador.leerArchivoCsvObrero(nra);
        int nf = obreros_al.size();
        String[] datos = {"", "", ""};
        for (int i = 0; i < nf; i++) {
            Obrero obrero = obreros_al.get(i);
            dtm.addRow(datos);
            dtm.setValueAt(obrero.getIdObrero(), i, 0);
            dtm.setValueAt(obrero.getNombre(), i, 1);
            dtm.setValueAt(String.valueOf(obrero.getCantidadHorasSemana()), i, 2);
        }
    }
	
    public void insertarFilaTable() {
        String[] datos = {"", "", ""};
        dtm.addRow(datos);
    }
	
	public void grabarFilaTable() {
        int numeroFilas = dtm.getRowCount();
        for (int i = 0; i < numeroFilas; i++) {
            String c1 = String.valueOf(dtm.getValueAt(i, 0));
            String c2 = String.valueOf(dtm.getValueAt(i, 1));
            String c3 = String.valueOf(dtm.getValueAt(i, 2));
            Obrero obrero = new Obrero(c1,c2,Integer.parseInt(c3));
            System.out.println(obrero);
        }
    }

======================
===   JTEXTAREA   ====
======================

    public void personalizar_JTable() {
		txaContenido.setLineWrap(true); // Cambia de fila cuando se llega al tope del ancho del textarea
        txaContenido.setWrapStyleWord(true); // Evita que la palabra se rompa si llega al top del ancho del textarea pasandola a la siguiente fila
	    txaContenido.setBackground(new java.awt.Color(0, 0, 0)); // Cambia el color de fondo del textarea
	    txaContenido.setForeground(new java.awt.Color(255, 255, 255)); // Cambia el color de letra del textarea
		txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // Cambia la fuente, estilo y tamaño de letra del textarea
    }