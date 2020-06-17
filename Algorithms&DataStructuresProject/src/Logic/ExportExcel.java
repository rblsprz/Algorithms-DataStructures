//package Logic;
//
///**
// *
// * @author David Robles
// */
//import java.awt.Label;
//import javax.swing.*;
//import java.io.*;
//import jxl.*;
//
//public class ExportExcel {
//
//    private File file;
//    private JTable table;
//    private String nombreTab;
//
//    public ExportExcel(JTable tabla, File file, String nombreTab) {
//        this.file = file;
//        this.table = table;
//        this.nombreTab = nombreTab;
//    }//End ExportarExcel
//
//    public boolean export() {
//        try {
//            System.out.print("INICIO PROCESO DE EXPORTACIÓN");
//            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
//            WritableWorkbook w = Workbook.createWorkbook(out);
//            System.out.print("COLOCANDO NOMBRE");
//            WritableWorkbook s = w.createSheet(nombreTab, 0);
//            System.out.println("RECORRIENDO LA TABLA");
//            for (int i = 0; i < table.getRowCount(); i++) {
//                for (int j = 0; j < table.getColumnCount(); j++) {
//                    Object objeto = table.getValueAt(i, j);
//                    s.addCell(new Label(j, i, String.valueOf(objeto)));
//                }//End for
//            }//End for
//            w.write();
//            System.out.println("CERRAMOS EL WRITABLEWORKBOOK Y DATAOUPUTSTREAM");
//            w.close();
//            out.close();
//            return true;
//        }//End try
//        catch (IOException ex) {ex.printStackTrace();}
//        catch(WriteException ex) {ex.printStackTrace();}
//        System.out.println("¡ERROR!");
//        return false;
//        }//End catch
//        }//End catch
//    }//End export
//}//End ExportExcel
