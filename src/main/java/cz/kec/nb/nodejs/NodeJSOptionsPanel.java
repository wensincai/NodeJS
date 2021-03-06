/*
 * Copyright 2010 Syntea software group a.s.
 *
 * This file may be used, copied, modified and distributed only in accordance
 * with the terms of the limited licence contained in the accompanying
 * file LICENSE.TXT.
 *
 * Tento soubor muze byt pouzit, kopirovan, modifikovan a siren pouze v souladu
 * s licencnimi podminkami uvedenymi v prilozenem souboru LICENSE.TXT.
 */
package cz.kec.nb.nodejs;

import org.openide.util.NbPreferences;

final class NodeJSOptionsPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 4066708521896652031L;

    private final NodeJSOptionsOptionsPanelController controller;
    private String nodeBin;

    NodeJSOptionsPanel(NodeJSOptionsOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        runCommandjEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        resetForWinjButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        killCommandjEditorPane2 = new javax.swing.JEditorPane();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(NodeJSOptionsPanel.class, "NodeJSOptionsPanel.jLabel1.text")); // NOI18N

        runCommandjEditorPane1.setText(org.openide.util.NbBundle.getMessage(NodeJSOptionsPanel.class, "NodeJSOptionsPanel.runCommandjEditorPane1.text")); // NOI18N
        runCommandjEditorPane1.setFocusCycleRoot(false);
        jScrollPane1.setViewportView(runCommandjEditorPane1);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(NodeJSOptionsPanel.class, "NodeJSOptionsPanel.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resetForWinjButton2, org.openide.util.NbBundle.getMessage(NodeJSOptionsPanel.class, "NodeJSOptionsPanel.resetForWinjButton2.text")); // NOI18N
        resetForWinjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetForWinjButton2ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(NodeJSOptionsPanel.class, "NodeJSOptionsPanel.jLabel2.text")); // NOI18N

        killCommandjEditorPane2.setText("taskkill /F /IM node.exe"); // NOI18N
        jScrollPane2.setViewportView(killCommandjEditorPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetForWinjButton2))
                            .addComponent(jLabel2))
                        .addGap(0, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(resetForWinjButton2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    runCommandjEditorPane1.setText(NbPreferences.forModule(NodeJSOptionsPanel.class).get("COMMAND",     "cd ${workingdir};\nnode ${selectedfile};"));
    killCommandjEditorPane2.setText(NbPreferences.forModule(NodeJSOptionsPanel.class).get("KILL_COMMAND","killall node;"));
    NbPreferences.forModule(NodeJSOptionsPanel.class).put("COMMAND", "cd ${workingdir};\nnode ${selectedfile};");
    NbPreferences.forModule(NodeJSOptionsPanel.class).put("KILL_COMMAND", "killall node;");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetForWinjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetForWinjButton2ActionPerformed
     // reset for windows
     NbPreferences.forModule(NodeJSOptionsPanel.class).put("COMMAND",      "cd ${workingdir} && node ${selectedfile}");
     NbPreferences.forModule(NodeJSOptionsPanel.class).put("KILL_COMMAND", "taskkill /F /IM node.exe");
     NbPreferences.forModule(NodeJSOptionsPanel.class).put("NODE_EXEC_PATH", "C:\\Program Files\\nodejs\\node.exe");
     runCommandjEditorPane1.setText(NbPreferences.forModule(NodeJSOptionsPanel.class).get("COMMAND",     "cd ${workingdir} && node ${selectedfile}"));
     killCommandjEditorPane2.setText(NbPreferences.forModule(NodeJSOptionsPanel.class).get("KILLCOMMAND","taskkill /F /IM node.exe"));
    }//GEN-LAST:event_resetForWinjButton2ActionPerformed

    void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(NodeJSOptionsPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(NodeJSOptionsPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        runCommandjEditorPane1.setText(NbPreferences.forModule(NodeJSOptionsPanel.class).get("COMMAND","cd ${workingdir};\nnode ${selectedfile};"));
        killCommandjEditorPane2.setText(NbPreferences.forModule(NodeJSOptionsPanel.class).get("KILL_COMMAND","killall node;"));
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(NodeJSOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(NodeJSOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        NbPreferences.forModule(NodeJSOptionsPanel.class).put("COMMAND", runCommandjEditorPane1.getText());
        NbPreferences.forModule(NodeJSOptionsPanel.class).put("KILL_COMMAND", killCommandjEditorPane2.getText());
    }

    boolean valid() {
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane killCommandjEditorPane2;
    private javax.swing.JButton resetForWinjButton2;
    private javax.swing.JEditorPane runCommandjEditorPane1;
    // End of variables declaration//GEN-END:variables
}
