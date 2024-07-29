package View;
import Controller.SistemaAdministracionCarcel;
import Model.PPL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.BorderLayout;
public class RegistrarPPL extends javax.swing.JPanel {
    public RegistrarPPL() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nacimiento = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        alias = new javax.swing.JTextField();
        pena = new javax.swing.JTextField();
        delito = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        clasificacion = new javax.swing.JTextField();

        inicio.setBackground(new java.awt.Color(102, 153, 255));
        inicio.setBorder(new javax.swing.border.MatteBorder(null));
        inicio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESA LOS DATOS DEL PPL: ");

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EDAD:");

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE COMPLETO:");

        jLabel4.setBackground(new java.awt.Color(51, 153, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CEDULA:");

        jLabel5.setBackground(new java.awt.Color(51, 153, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("LUGAR DE NACIMIENTO:");

        jLabel6.setBackground(new java.awt.Color(51, 153, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ALIAS:");

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GENERO:");

        jLabel8.setBackground(new java.awt.Color(51, 153, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DELITO:");

        jLabel9.setBackground(new java.awt.Color(51, 153, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PENA:");

        nacimiento.setBackground(new java.awt.Color(255, 255, 255));
        nacimiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nacimiento.setForeground(new java.awt.Color(0, 0, 0));
        nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacimientoActionPerformed(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        genero.setBackground(new java.awt.Color(255, 255, 255));
        genero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 0, 0));
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        alias.setBackground(new java.awt.Color(255, 255, 255));
        alias.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        alias.setForeground(new java.awt.Color(0, 0, 0));
        alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliasActionPerformed(evt);
            }
        });

        pena.setBackground(new java.awt.Color(255, 255, 255));
        pena.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pena.setForeground(new java.awt.Color(0, 0, 0));
        pena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penaActionPerformed(evt);
            }
        });

        delito.setBackground(new java.awt.Color(255, 255, 255));
        delito.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        delito.setForeground(new java.awt.Color(0, 0, 0));
        delito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delitoActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("INGRESAR");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(51, 153, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CLASIFICACION:");

        clasificacion.setBackground(new java.awt.Color(255, 255, 255));
        clasificacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        clasificacion.setForeground(new java.awt.Color(0, 0, 0));
        clasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delito, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(alias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pena, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(pena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(delito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacimientoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void aliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aliasActionPerformed

    private void penaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penaActionPerformed

    private void delitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delitoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ResultadoRegistroPPL registro = new ResultadoRegistroPPL(crearPPL());
        registro.setSize(940, 450);
        registro.setLocation(0, 0);
        
        inicio.removeAll();
        inicio.add(registro, BorderLayout.CENTER);
        inicio.revalidate();
        inicio.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void clasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clasificacionActionPerformed
    public PPL crearPPL(){
        SistemaAdministracionCarcel sistema = new SistemaAdministracionCarcel();
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaHoy = hoy.format(formateador);
        int numero = (sistema.getLstPPL().size()+1);
        PPL ppl = new PPL(numero, this.nombre.getText(), this.cedula.getText(), 
                Integer.parseInt(this.edad.getText()), this.nacimiento.getText(), 
                this.genero.getText(), this.alias.getText(), this.clasificacion.getText(), 
                sistema.asignarCelda(sistema.asignarPabellon(this.clasificacion.getText())), 
                sistema.asignarPabellon(this.clasificacion.getText()), fechaHoy, sistema.calcularFechaSalida(Integer.parseInt(this.pena.getText())),
                Integer.parseInt(this.pena.getText()), Integer.parseInt(this.pena.getText()), 
                this.delito.getText(),0);
        return ppl;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alias;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField clasificacion;
    private javax.swing.JTextField delito;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField genero;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pena;
    // End of variables declaration//GEN-END:variables
}
