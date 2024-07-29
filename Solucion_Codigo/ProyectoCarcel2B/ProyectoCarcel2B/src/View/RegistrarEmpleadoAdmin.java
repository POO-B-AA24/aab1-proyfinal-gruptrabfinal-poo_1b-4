package View;
import Controller.SistemaAdministracionCarcel;
import Model.EmpleadoAdministracion;
import Model.PPL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.BorderLayout;
public class RegistrarEmpleadoAdmin extends javax.swing.JPanel {
    public RegistrarEmpleadoAdmin() {
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
        NivelAcadem = new javax.swing.JTextField();
        blandas = new javax.swing.JTextField();
        contacto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idiomas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        horasTrab = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        valorxHora = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        certificados = new javax.swing.JTextField();

        inicio.setBackground(new java.awt.Color(102, 153, 255));
        inicio.setBorder(new javax.swing.border.MatteBorder(null));
        inicio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESA LOS DATOS DEL EMPLEADO DE ADMINISTRACION: ");

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
        jLabel6.setText("NIVEL ACADEMICO:");

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GENERO:");

        jLabel8.setBackground(new java.awt.Color(51, 153, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CONTACTO:");

        jLabel9.setBackground(new java.awt.Color(51, 153, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("HABILIDADES BLANDAS:");

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

        NivelAcadem.setBackground(new java.awt.Color(255, 255, 255));
        NivelAcadem.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NivelAcadem.setForeground(new java.awt.Color(0, 0, 0));
        NivelAcadem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelAcademActionPerformed(evt);
            }
        });

        blandas.setBackground(new java.awt.Color(255, 255, 255));
        blandas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        blandas.setForeground(new java.awt.Color(0, 0, 0));
        blandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blandasActionPerformed(evt);
            }
        });

        contacto.setBackground(new java.awt.Color(255, 255, 255));
        contacto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        contacto.setForeground(new java.awt.Color(0, 0, 0));
        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
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
        jLabel10.setText("CERTIFICADOS ADICIONALES:");

        idiomas.setBackground(new java.awt.Color(255, 255, 255));
        idiomas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        idiomas.setForeground(new java.awt.Color(0, 0, 0));
        idiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomasActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(51, 153, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("VALOR POR HORA:");

        horasTrab.setBackground(new java.awt.Color(255, 255, 255));
        horasTrab.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        horasTrab.setForeground(new java.awt.Color(0, 0, 0));
        horasTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasTrabActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 153, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("HORAS SEMANALES:");

        valorxHora.setBackground(new java.awt.Color(255, 255, 255));
        valorxHora.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        valorxHora.setForeground(new java.awt.Color(0, 0, 0));
        valorxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorxHoraActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(51, 153, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("IDIOMAS HABLADOS:");

        cargo.setBackground(new java.awt.Color(255, 255, 255));
        cargo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cargo.setForeground(new java.awt.Color(0, 0, 0));
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(51, 153, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CARGO:");

        certificados.setBackground(new java.awt.Color(255, 255, 255));
        certificados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        certificados.setForeground(new java.awt.Color(0, 0, 0));
        certificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificadosActionPerformed(evt);
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
                        .addComponent(nombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horasTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NivelAcadem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blandas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(certificados, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(NivelAcadem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(blandas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(21, 21, 21)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(horasTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(certificados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(valorxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(24, 24, 24))
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

    private void NivelAcademActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelAcademActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelAcademActionPerformed

    private void blandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blandasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blandasActionPerformed

    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ResultadoRegistroAdministracion registro = new ResultadoRegistroAdministracion(crearEmpleadoAdministracion());
        registro.setSize(940, 450);
        registro.setLocation(0, 0);
        
        inicio.removeAll();
        inicio.add(registro, BorderLayout.CENTER);
        inicio.revalidate();
        inicio.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiomasActionPerformed

    private void horasTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasTrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasTrabActionPerformed

    private void valorxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorxHoraActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void certificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_certificadosActionPerformed
    public EmpleadoAdministracion crearEmpleadoAdministracion(){
        SistemaAdministracionCarcel sistema = new SistemaAdministracionCarcel();
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaHoy = hoy.format(formateador);
        int numero = (sistema.getLstAdministracion().size()+1);
        EmpleadoAdministracion emp = new EmpleadoAdministracion(numero, this.NivelAcadem.getText(),
                this.idiomas.getText(), this.blandas.getText(), 
                this.certificados.getText(),this.cargo.getText() , 
                Integer.parseInt(this.horasTrab.getText()), Double.parseDouble(this.valorxHora.getText()), 
                this.contacto.getText(), fechaHoy, 0, 
                this.nombre.getText(), this.cedula.getText(), Integer.parseInt(this.edad.getText()), 
                this.nacimiento.getText(), this.genero.getText());
        return emp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NivelAcadem;
    private javax.swing.JTextField blandas;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField certificados;
    private javax.swing.JTextField contacto;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField horasTrab;
    private javax.swing.JTextField idiomas;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField valorxHora;
    // End of variables declaration//GEN-END:variables
}
