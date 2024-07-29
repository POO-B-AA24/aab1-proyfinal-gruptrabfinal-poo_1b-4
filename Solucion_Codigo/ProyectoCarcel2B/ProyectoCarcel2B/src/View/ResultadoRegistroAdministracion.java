package View;
import Controller.SistemaAdministracionCarcel;
import Model.EmpleadoAdministracion;
import Model.EmpleadoSeguridad;
public class ResultadoRegistroAdministracion extends javax.swing.JPanel {
    private String mensaje;
    public ResultadoRegistroAdministracion(EmpleadoAdministracion emp) {
        initComponents();
        insertar(emp);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajita = new javax.swing.JTextArea();

        inicio.setBackground(new java.awt.Color(102, 153, 255));
        inicio.setBorder(new javax.swing.border.MatteBorder(null));
        inicio.setForeground(new java.awt.Color(255, 255, 255));

        cajita.setBackground(new java.awt.Color(255, 255, 255));
        cajita.setColumns(20);
        cajita.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cajita.setForeground(new java.awt.Color(0, 0, 0));
        cajita.setRows(5);
        jScrollPane1.setViewportView(cajita);

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 411, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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
    public void insertar(EmpleadoAdministracion emp){
        SistemaAdministracionCarcel sistema = new SistemaAdministracionCarcel();
        sistema.insertarEmplAdmin(emp);
        cajita.setText("EMPLEADO INGRESADO A LA BASE DE DATOS");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cajita;
    private javax.swing.JPanel inicio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
