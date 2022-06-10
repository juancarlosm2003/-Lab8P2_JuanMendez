
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Carlos Mendez
 */
public class administrarvida {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public administrarvida() {
    }

    public administrarvida(JProgressBar barra, boolean avanzar, boolean vive) {
        this.barra = barra;
        this.avanzar = avanzar;
        this.vive = vive;
    }

    administrarvida(JProgressBar jProgressBar1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100000000) {
                    vive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
