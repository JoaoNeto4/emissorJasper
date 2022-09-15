

package classe;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;


public class ImpressoraJasperReflorasul {
    
    public void ImprimeRelatorio(ArrayList lista, JDialog dialog){
        
        String caminhoRelJasper = "/imprimir/ReciboReflora.jasper";
        
        InputStream relJasper = getClass().getResourceAsStream(caminhoRelJasper);
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
        
        Map parametros = new HashMap();
        JasperPrint impressao = null;
        
        try{
            impressao = JasperFillManager.fillReport(relJasper, parametros, ds);
            JasperViewer viewer = new JasperViewer(impressao, false);
            
            dialog.setContentPane(viewer.getContentPane());
            dialog.setSize(viewer.getSize());
            
            dialog.setVisible(true);
    
        }catch (JRException ex){
            JOptionPane.showMessageDialog(null, ex);
    
        }
    }



}
