package view;

import controller.MovieManagementController;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Movie;

/**
 *
 * @author Jacobo-bc
 */
public class Main extends javax.swing.JFrame {

    private final MovieManagementController controller;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Inicio");
        controller = new MovieManagementController();
        fillTable();
        setCbxYearLaunch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JDesktopPane();
        txtTitle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxGenre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxLanguage = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtProductionStudio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxYearLaunch = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        btnShowAllMovies = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnSearchMovie = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        txtDuration = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TÍTULO:");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIRECTOR:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GÉNERO:");

        cbxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Acción", "Aventura", "Catástrofe", "Comedia", "Terror", "Drama" }));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LENGUAJE: ");

        cbxLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Español", "Inglés", "Francés" }));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESTUDIO DE PRODUCCIÓN:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AÑO LANZAMIENTO:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DURACIÓN (MINUTOS) :");

        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        moviesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(moviesTable);

        btnShowAllMovies.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnShowAllMovies.setText("Ver todos");
        btnShowAllMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllMoviesActionPerformed(evt);
            }
        });

        btnClean.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TÍTULO:");

        btnSearchMovie.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSearchMovie.setText("Buscar");
        btnSearchMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMovieActionPerformed(evt);
            }
        });

        btnAddProduct.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAddProduct.setText("Registrar");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnUpdateProduct.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnUpdateProduct.setText("Editar");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnDeleteProduct.setText("Eliminar");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        try {
            txtDuration.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        backgroundPanel.setLayer(txtTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(txtDirector, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(cbxGenre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(cbxLanguage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(txtProductionStudio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(cbxYearLaunch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(btnShowAllMovies, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(btnClean, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(txtFilter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(btnSearchMovie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(btnAddProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(btnUpdateProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(btnDeleteProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundPanel.setLayer(txtDuration, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(cbxYearLaunch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(txtProductionStudio)
                            .addComponent(jLabel5)
                            .addComponent(cbxLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtTitle)
                            .addComponent(txtDirector)
                            .addComponent(cbxGenre, 0, 197, Short.MAX_VALUE)
                            .addComponent(txtDuration))
                        .addGap(68, 68, 68)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnSearchMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnShowAllMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchMovie)
                    .addComponent(btnShowAllMovies)
                    .addComponent(btnClean))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbxGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cbxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtProductionStudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbxYearLaunch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct)
                    .addComponent(btnUpdateProduct))
                .addGap(44, 44, 44)
                .addComponent(btnDeleteProduct)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAllMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllMoviesActionPerformed
        fillTable();
        cleanFields();
    }//GEN-LAST:event_btnShowAllMoviesActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanTable();
        cleanFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSearchMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMovieActionPerformed
        String title = txtFilter.getText().trim();

        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el titulo de la pelicula que desea buscar");
            return;
        }

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "Título", "Director", "Género", "Lenguaje", "Estudio producción", "Año lanzamiento", "Duración"
        });
        moviesTable.setModel(model);
        Movie movie = controller.searchMovie(title);
        if (movie != null) {
            model.addRow(new Object[]{
                movie.getTitle(),
                movie.getDirector(),
                movie.getGenre(),
                movie.getLanguage(),
                movie.getProductionStudio(),
                movie.getYearLaunch(),
                movie.getDuration()
            });

            txtTitle.setText(movie.getTitle());
            txtDirector.setText(movie.getDirector());
            cbxGenre.setSelectedItem(movie.getGenre());
            cbxLanguage.setSelectedItem(movie.getLanguage());
            txtProductionStudio.setText(movie.getProductionStudio());
            cbxYearLaunch.setSelectedItem(movie.getYearLaunch());
            txtDuration.setText(String.valueOf(movie.getDuration()));

        } else {
            JOptionPane.showMessageDialog(null, "Pelicula no encontrada");
            fillTable();
        }
    }//GEN-LAST:event_btnSearchMovieActionPerformed

    private void moviesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesTableMouseClicked
        int seleccion = moviesTable.getSelectedRow();

        txtTitle.setText(moviesTable.getValueAt(seleccion, 0).toString());
        txtDirector.setText(moviesTable.getValueAt(seleccion, 1).toString());
        cbxGenre.setSelectedItem((moviesTable.getValueAt(seleccion, 2)).toString());
        cbxLanguage.setSelectedItem(moviesTable.getValueAt(seleccion, 3).toString());
        txtProductionStudio.setText(moviesTable.getValueAt(seleccion, 4).toString());
        cbxYearLaunch.setSelectedItem(moviesTable.getValueAt(seleccion, 5).toString());
        txtDuration.setText(moviesTable.getValueAt(seleccion, 6).toString());

    }//GEN-LAST:event_moviesTableMouseClicked

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        if (hasEmptyFields()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
            return;
        }

        String title = txtTitle.getText().trim();
        String director = txtDirector.getText();
        String genre = cbxGenre.getSelectedItem().toString();
        String language = cbxLanguage.getSelectedItem().toString();
        String productionStudio = txtProductionStudio.getText();
        String duration = txtDuration.getText();
        int yearLaunch = Integer.parseInt(cbxYearLaunch.getSelectedItem().toString());

        try {
            Movie movie = new Movie(title, director, genre, language, productionStudio, yearLaunch, duration);
            controller.addMovie(movie);
            JOptionPane.showMessageDialog(null, "Pelicula registrada correctamente");
            fillTable();
            cleanFields();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar la pelicula");
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        if (hasEmptyFields()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
            return;
        }

        String title = txtTitle.getText().trim();
        String director = txtDirector.getText();
        String genre = cbxGenre.getSelectedItem().toString();
        String language = cbxLanguage.getSelectedItem().toString();
        String productionStudio = txtProductionStudio.getText();
        int yearLaunch = Integer.parseInt(cbxYearLaunch.getSelectedItem().toString());
        String duration = txtDuration.getText();

        Movie movie = new Movie(title, director, genre, language, productionStudio, yearLaunch, duration);
        boolean success = controller.updateMovie(movie);

        if (success) {
            fillTable();
            cleanFields();
            JOptionPane.showMessageDialog(null, "Pelicula editada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
        }
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        String title = txtTitle.getText().trim();

        boolean success = controller.deleteMovie(title);

        if (success) {
            fillTable();
            cleanFields();
            JOptionPane.showMessageDialog(null, "Pelicula eliminada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar la pelicula");
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void setCbxYearLaunch() {
        int currentYear = LocalDate.now().getYear();

        for (int year = currentYear; year >= (currentYear - 400); year--) {
            cbxYearLaunch.addItem(String.valueOf(year));
        }

        cbxYearLaunch.insertItemAt("Seleccione una opción", 0);
        cbxYearLaunch.setSelectedIndex(0);
    }

    private void fillTable() {
        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Movie> movies = controller.listMovies();
        model.setColumnIdentifiers(new Object[]{
            "Título", "Director", "Género", "Lenguaje", "Estudio producción", "Año lanzamiento", "Duración"
        });

        moviesTable.setModel(model);

        for (Movie movie : movies) {
            model.addRow(new Object[]{
                movie.getTitle(),
                movie.getDirector(),
                movie.getGenre(),
                movie.getLanguage(),
                movie.getProductionStudio(),
                movie.getYearLaunch(),
                movie.getDuration()
            });
        }
    }

    private void cleanFields() {
        txtTitle.setText("");
        txtDirector.setText("");
        cbxGenre.setSelectedIndex(0);
        cbxLanguage.setSelectedIndex(0);
        cbxYearLaunch.setSelectedIndex(0);
        txtDuration.setText("");
        txtProductionStudio.setText("");
        txtFilter.setText("");
    }

    private void cleanTable() {
        DefaultTableModel model = (DefaultTableModel) moviesTable.getModel();
        model.setRowCount(0);
    }

    private boolean hasEmptyFields() {
        return (txtTitle.getText().isEmpty() || txtDirector.getText().isEmpty() || cbxGenre.getSelectedIndex() == 0
                || cbxLanguage.getSelectedIndex() == 0 || cbxYearLaunch.getSelectedIndex() == 0 || txtDuration.getText().isEmpty() || txtProductionStudio.getText().isEmpty());
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane backgroundPanel;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnSearchMovie;
    private javax.swing.JButton btnShowAllMovies;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JComboBox<String> cbxGenre;
    private javax.swing.JComboBox<String> cbxLanguage;
    private javax.swing.JComboBox<String> cbxYearLaunch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable moviesTable;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JFormattedTextField txtDuration;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtProductionStudio;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
